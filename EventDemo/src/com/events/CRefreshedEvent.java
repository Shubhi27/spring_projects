package com.events;

import java.sql.Timestamp;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CRefreshedEvent implements ApplicationListener<ContextRefreshedEvent>{
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Event refreshed at "+ new Timestamp(System.currentTimeMillis()));
		
	}
}
