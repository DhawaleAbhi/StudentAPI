package com.example.demo.Student;

import jakarta.persistence.*;

@Entity
public class Student {

	@Id
	private int RollNo;
	private String Name;
	private String Address;
	private String Grade;
	
	public int getRollNo() {
		return RollNo;
	}
	public Student(int rollNo, String name, String address, String grade) {
		super();
		RollNo = rollNo;
		Name = name;
		Address = address;
		Grade = grade;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}

}
