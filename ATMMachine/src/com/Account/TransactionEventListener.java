package com.Account;

import org.springframework.context.ApplicationListener;

public class TransactionEventListener implements ApplicationListener<WithdrawalEvent> {
	
	private void sendSMS(String msg) {
		System.out.println(msg);
		
	}
	@Override
	public void onApplicationEvent(WithdrawalEvent event) {
		sendSMS(event.toString());
	}

	
}
