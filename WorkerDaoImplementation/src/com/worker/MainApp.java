package com.worker;

import java.sql.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.worker.model.Worker;
import com.worker.util.WorkerJDBCTemplate;
import com.worker.helpers.WorkerHelpers;

public class MainApp {

	public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		WorkerJDBCTemplate workerJDBCTemplate = (WorkerJDBCTemplate) context.getBean("workerJDBCTemplate");
		
		System.out.println("************** Records Creation **************");
		Worker worker1 = new Worker(10, "Shubhi", "s.giri@my_org.in");
		workerJDBCTemplate.add(worker1);
		//Worker worker2 = new Worker(9, "Swati", "Giri ", 250000, Date.valueOf("2020-05-21"), "HR", "s.giri@my_org.in");
		//workerJDBCTemplate.update(worker2);
		//workerJDBCTemplate.delete(10);
		
		System.out.println();
		
		
		System.out.println("************** Displaying Worker Records **************");
		List<Worker> workerList = workerJDBCTemplate.getWorkers(); 
		WorkerHelpers.printAllWorkers(workerList);
		Worker worker3 = workerJDBCTemplate.getWorker(2);
		System.out.println(worker3);
		context.close();
	}

}
