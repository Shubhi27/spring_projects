package com.springboot.workers.crudapi.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.workers.crudapi.model.Worker;
import com.springboot.workers.crudapi.repository.WorkerRepository;

@Service
public class WorkerService {
 
	@Resource(name="workerRepo")
	WorkerRepository workerRepo;
	
	public Worker getWorker(int id) {
		return workerRepo.findWorkerById(id);
	}

	
	public List<Worker> getAllWorkers(){
		return workerRepo.getAllWorkers();
	}

	
	public boolean createWorker(Worker worker) {
		boolean row = workerRepo.insertWorker(worker);
		return row;
	}

	
	public boolean updateWorkerEmail( int id, String email) {
	  return workerRepo.updateEmailById(id, email);
	}

	public boolean deleteWorker(int id) {
		return workerRepo.deleteWorkerById(id);
	}
}
