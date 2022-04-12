package com.springboot.my.org.crudapi.dao;

import java.util.List;
import java.util.Map;

import com.springboot.my.org.crudapi.model.Worker;



public interface WorkerDao {
 public boolean insertWorker(Worker worker);
	 
	 public boolean deleteWorkerById(int workerId);
	           
     public Worker findWorkerById(int workerId);
	           
     public List<Worker> getAllWorkers();
	           
	 public boolean updateEmailById(int id, String email);
	    
	 public boolean update(Worker worker);
	  
	 public List<Map<String,String>> getAllDetails();
	    
	 public List<Map<String,String>> getAllDetailsByDept(String dept);
}
