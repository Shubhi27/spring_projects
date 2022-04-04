package com.springboot.workers.crudapi.dao;

import java.util.List;


import com.springboot.workers.crudapi.model.Worker;



public interface WorkerDao {
	 public boolean insertWorker(Worker worker);
	 
	 public boolean deleteWorkerById(int workerId);
	           
     public Worker findWorkerById(int workerId);
	           
     public List<Worker> getAllWorkers();
	           
	 public boolean updateEmailById(int id, String email);
	    
	 public boolean update(Worker worker);
	            
}
