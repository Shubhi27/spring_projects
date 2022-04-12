package com.springboot.my.org.crudapi.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.my.org.crudapi.model.Worker;
import com.springboot.my.org.crudapi.repository.WorkerRepository;

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
	public List<Map<String,String>> getCombinedDetails() {
		
		return workerRepo.getAllDetails();
	
}

public List<Map<String,String>> getCombinedDetailsByDept(String dept) {

		return workerRepo.getAllDetailsByDept(dept);
	
}
}
