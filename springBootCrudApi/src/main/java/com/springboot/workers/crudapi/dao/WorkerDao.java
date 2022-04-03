package com.springboot.workers.crudapi.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.springboot.workers.crudapi.model.Worker;



public interface WorkerDao {
	 public boolean add(Worker worker);
	           

	    public boolean delete(int workerId);
	           

	    public Worker getWorker(int workerId);
	           

	    public List<Worker> getWorkers();
	           
	    public boolean updateEmail(int id, String email);
	    
	    public boolean update(Worker worker);
	            
}
