package com.tka.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value("${cid}")
	int cid;
	@Value("${cname}")
	String cname;
	@Value("${OwnerName}")
	String OwnerName;
	@Value("${cmodel}")
	int cmodel;

	public Car() {

	}

	public Car(String cname, String ownerName, int cmodel) {
		super();
		this.cname = cname;
		OwnerName = ownerName;
		this.cmodel = cmodel;
	}

	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public int getCmodel() {
		return cmodel;
	}

	public void setCmodel(int cmodel) {
		this.cmodel = cmodel;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", OwnerName=" + OwnerName + ", cmodel=" + cmodel + "]";
	}

}
