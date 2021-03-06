package com.springboot.my.org.crudapi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.my.org.crudapi.model.Worker;
import com.springboot.my.org.crudapi.service.WorkerService;



@RestController
@RequestMapping("/worker")
public class WorkerController {
	
	@Autowired
	WorkerService workerService;

@GetMapping("/worker/{id}")
public Worker showWorker(@PathVariable int id) {
	return workerService.getWorker(id);
}

@GetMapping("/all")
public List<Worker> showAllWorker(){
	return workerService.getAllWorkers();
}

@PostMapping("/create")
@ResponseStatus(HttpStatus.CREATED)
public boolean createWorker(@RequestBody Worker worker) {
	boolean row = workerService.createWorker(worker);
	return row;
}

@PatchMapping("/update/{id}")
public boolean updateWorker(@PathVariable int id, @RequestBody Map<String,String> map) {
  return workerService.updateWorkerEmail(id, map.get("email"));
}

@DeleteMapping("/delete/{id}")
public boolean delete(@PathVariable int id){
	return workerService.deleteWorker(id);
}

@GetMapping("/worker/all/fullInfo")
public List<Map<String,String>> getFullInfo(){
	return workerService.getCombinedDetails();
}

@GetMapping("/dept/{dept}/all/fullInfo")
public List<Map<String,String>> getFullInfoByDept(@PathVariable String dept){
	return workerService.getCombinedDetailsByDept(dept);
}
}
