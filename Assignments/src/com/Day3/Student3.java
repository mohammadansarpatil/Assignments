package com.Day3;

public class Student3 {
	
	int id;
	String name;
	char studentType;
	String residentalStatus;
	long feesPerMonth;
	public Student3(int id, String name, char studentType, String residentalStatus, long feesPerMonth) {
		super();
		this.id = id;
		this.name = name;
		this.studentType = studentType;
		this.residentalStatus = residentalStatus;
		this.feesPerMonth = feesPerMonth;
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
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getResidentalStatus() {
		return residentalStatus;
	}
	public void setResidentalStatus(String residentalStatus) {
		this.residentalStatus = residentalStatus;
	}
	public long getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", studentType=" + studentType + ", residentalStatus="
				+ residentalStatus + ", feesPerMonth=" + feesPerMonth + "]";
	}
	
	
	long calculateFees(long fees) {
		
		return fees/12;
	}
	
long calculateFees(long fees , long hostelfees) {
		
		return hostelfees + (fees/12);
	}
	
	
	
}
