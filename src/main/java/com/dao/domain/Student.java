package com.dao.domain;

public class Student {

	private String name;
	private int rollNo;
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNo = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNumber) {
		this.rollNo = rollNumber;
	}

}
