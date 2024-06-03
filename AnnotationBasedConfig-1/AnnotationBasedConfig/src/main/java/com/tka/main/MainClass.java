package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		
		Employee e=context.getBean(Employee.class);
		Employee e1=context.getBean(Employee.class);
		System.out.println(e);
		System.out.println(e1);
		
	}

}
