package com.tka.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.tka.entity.Employee;

@ComponentScan(basePackages = {"com.tka"})

public class Configuration {

//	@Bean
//	@Scope(value = "prototype")
//	public Employee MyConfiguration() {
//		
//		Employee emp=new Employee();
//		return emp;
//	}

}
