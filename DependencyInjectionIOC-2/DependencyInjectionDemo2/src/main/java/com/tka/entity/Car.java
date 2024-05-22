package com.tka.entity;

public class Car {

	String cname;
	String cowner;
	long cprice;
	
	public Car() {
		
	}

	public Car(String cname, String cowner, long cprice) {
		super();
		this.cname = cname;
		this.cowner = cowner;
		this.cprice = cprice;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCowner() {
		return cowner;
	}

	public void setCowner(String cowner) {
		this.cowner = cowner;
	}

	public long getCprice() {
		return cprice;
	}

	public void setCprice(long cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Car [cname=" + cname + ", cowner=" + cowner + ", cprice=" + cprice + "]";
	}
	
	
}
