package com.tka.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {

	int id;
	double amt;

	public void Deposit(double amt) {
		System.out.println("Amount deposited successfully !!" + amt);
	}

	public void Withdraw(double amount) {
		System.out.println("You are withdraw the amount successfully !!");
	}

	public Account() {

	}

	public Account(double amt) {
		super();
		this.amt = amt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", amt=" + amt + "]";
	}

}
