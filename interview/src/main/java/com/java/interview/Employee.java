package com.java.interview;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6872275066201236282L;
	private int ssn;
	private String name;
	private String designation;
	private long contact;
	
	public Employee(int ssn, String name, String designation,long contact) {
		this.ssn = ssn;
		this.name = name;
		this.designation = designation;
		this.contact = contact;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public long getContact() {
		return contact;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setContact(int contact) {
		this.contact = contact;
	}	
}
