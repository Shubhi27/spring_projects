package com.Account;

import java.sql.Timestamp;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {
	double amount;
	BankAccount account;

	public WithdrawalEvent(Object source, double balance, BankAccount account) {
		super(source);
		this.amount = balance;
		this.account = account;
	}
	
	public String toString() {
		return "Amount withdrawn is: " + amount + "\n" +  " Balance left is: " + account + "\n" + "Timestamp: " + new Timestamp(System.currentTimeMillis());
	}
}
