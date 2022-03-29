package com.Account;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		WithdrawalEventPublisher publisher = (WithdrawalEventPublisher) context.getBean("customEventPublisher");
		BankAccount account = new SavingsAccount(100, "Shubhi", 50000);
		 account.withdraw(1000);
		publisher.publish(1000,account);
	}

}
