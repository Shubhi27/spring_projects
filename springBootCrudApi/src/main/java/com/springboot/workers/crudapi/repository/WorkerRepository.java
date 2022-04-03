package com.springboot.workers.crudapi.repository;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.workers.crudapi.dao.WorkerDao;
import com.springboot.workers.crudapi.mapper.WorkerMapper;
import com.springboot.workers.crudapi.model.Worker;


@Repository("workerRepo")
 public class WorkerRepository implements WorkerDao {
	private static final Logger log = LoggerFactory.getLogger(WorkerRepository.class);
	@SuppressWarnings("unused")

	@Autowired
	JdbcTemplate jdbcTemplateObject;
	
	
	public boolean add(Worker worker) {
		String sql = "INSERT INTO worker VALUES (?,?,?,?,?,?,?)";
		
		System.out.println("Student's record inserted successfully");
		return jdbcTemplateObject.update(sql, worker.getWorkerId(), worker.getfirstName(), worker.getlastName(),
		        worker.getSalary(), worker.getjoiningDate(), worker.getDepartment(), worker.getEmail() ) > 0;
	}
	
	public boolean delete(int workerId) {
		String sql = "DELETE FROM worker WHERE worker_id = ?";
		int row = jdbcTemplateObject.update(sql, workerId);
		System.out.println("Record #" + workerId + " deleted");
		return row>0;
	}
	
	public Worker getWorker(int workerId) {
		String sql = "Select * from worker where worker_id=?";
		Worker worker = jdbcTemplateObject.queryForObject(
				sql, 
				new WorkerMapper(),
				new Object[] {workerId}
			);
		
		return worker;
	}
	public List<Worker> getWorkers() {
		String sql = "SELECT * FROM worker";
		List<Worker> workers = jdbcTemplateObject.query(
				sql, 
				new WorkerMapper()
				);
		
		return workers;
	}
	
	public boolean updateEmail(int id, String email) {
		String sql = "update worker set email=? where worker_id=?";
		int row = jdbcTemplateObject.update(sql, email, id);
		System.out.println("Record's updated");
		return row > 0;
	}
	
	public boolean update(Worker worker) {
		String sql = "update worker set first_name=?,last_name=?,salary=?,joining_date=?,department=?,email=? where worker_id=?";
		int row = jdbcTemplateObject.update(sql, worker.getfirstName(), worker.getlastName(),
		        worker.getSalary(), worker.getjoiningDate(), worker.getDepartment(), worker.getEmail(), worker.getWorkerId());
		System.out.println("Record's updated");
		return row > 0;
	}
}
