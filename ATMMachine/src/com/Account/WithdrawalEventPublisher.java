package com.Account;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
public class WithdrawalEventPublisher implements ApplicationEventPublisherAware{
			private ApplicationEventPublisher publisher;
		
		@Override
		public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
			
			this.publisher = publisher;
		}	
		
		public void publish(double balance,BankAccount account) {
			WithdrawalEvent event= new WithdrawalEvent(this, balance, account);
		    publisher.publishEvent(event);
		}
	}

