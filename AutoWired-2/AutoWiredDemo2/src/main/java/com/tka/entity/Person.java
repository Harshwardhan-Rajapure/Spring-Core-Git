package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("${id}")
	int id;
	@Value("${name}")
	String name;
	@Value("${age}")
	int age;
	@Value("${gender}")
	String gender;

	@Autowired
	Car car;

	public Person() {

	}

//	public Person(String name, int age, String gender) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}

	public Person(int id, String name, int age, String gender, Car car) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.car = car;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", car=" + car + "]";
	}

}
