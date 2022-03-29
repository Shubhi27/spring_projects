package com.springDemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     context.start();
		 HelloWorld obj = context.getBean("hello", HelloWorld.class);
	        System.out.println(obj.getMessage1());
	        System.out.println(obj.getMessage2());
	        context.close();
	}

}
