package com.springboot.workers.crudapi.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

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

import com.springboot.workers.crudapi.model.Worker;
import com.springboot.workers.crudapi.repository.WorkerRepository;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	@Resource(name="workerRepo")
	private WorkerRepository repo;

@GetMapping("/worker/{id}")
public Worker getWorker(@PathVariable int id) {
	return repo.getWorker(id);
}

@GetMapping("/all")
public List<Worker> getAllWorker(){
	return repo.getWorkers();
}

@PostMapping("/create")
@ResponseStatus(HttpStatus.CREATED)
public boolean createWorker(@RequestBody Worker worker) {
	boolean row = repo.add(worker);
	return row;
}

@PatchMapping("/update/{id}")
public boolean updateWorker(@PathVariable int id, @RequestBody Map<String,String> map) {
  return repo.updateEmail(id, map.get("email"));
}

@DeleteMapping("/delete/{id}")
public boolean delete(@PathVariable int id) {
	return repo.delete(id);
}
}
