package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.Configuration;
import com.tka.entity.Account;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		
		Account acc= context.getBean(Account.class);
		
		//System.out.println(acc);
		
		acc.Deposit(5700.0);
		
		System.out.println();
		
		acc.Withdraw(4200.50);
		
	}

}
