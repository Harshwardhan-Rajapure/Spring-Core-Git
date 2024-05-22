package com.tka.entity;

public class Address {

	int hnumber;
	String village;
	long pincode;
	
	Person person;
	
	Car car;
	
	public Address() {
		
	}
	
	public Address(int hnumber, String village, long pincode) {
		super();
		this.hnumber = hnumber;
		this.village = village;
		this.pincode = pincode;
	}
	public int getHnumber() {
		return hnumber;
	}
	public void setHnumber(int hnumber) {
		this.hnumber = hnumber;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	
		
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Address [hnumber=" + hnumber + ", village=" + village + ", pincode=" + pincode + ", person=" + person
				+ ", car=" + car + "]";
	}

	
	
	
//	@Override
//	public String toString() {
//		return "Address [hnumber=" + hnumber + ", village=" + village + ", pincode=" + pincode + ", person=" + person
//				+ "]";
//	}

//	@Override
//	public String toString() {
//		return "Address [hnumber=" + hnumber + ", village=" + village + ", pincode=" + pincode + "]";
//	}
	
	
	
	
	
}
