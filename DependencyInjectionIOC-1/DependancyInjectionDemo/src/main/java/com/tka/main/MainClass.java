package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Country;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig1.xml");
		Employee emp=context.getBean("e1", Employee.class);
		System.out.println(emp);
		
//		Country c=context.getBean("con", Country.class);
//		System.out.println(c);
	}
}
