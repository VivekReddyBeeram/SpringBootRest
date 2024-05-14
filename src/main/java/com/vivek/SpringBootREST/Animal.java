package com.vivek.SpringBootREST;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Animal {
	
	@Id
	int aid;
	
	String aname;
	int aage;
	
	public Animal() {
	}
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAage() {
		return aage;
	}
	public void setAage(int aage) {
		this.aage = aage;
		
	
	}
	@Override
	public String toString() {
		return "Animal [aid=" + aid + ", aname=" + aname + ", aage=" + aage + "]";
	}

}
