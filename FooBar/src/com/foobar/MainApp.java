package com.foobar;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     context.start();
		 Bar obj = (Bar)context.getBean("bar");
	        System.out.println(obj);
	       obj.processFooName();
	       context.close();
	}

}

