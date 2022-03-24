package com.Day3;

public class Student2 {
	
	int id;
	String name;
	String residentalStatus;
	long feesPerMonth;
	public Student2() {
		
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", residentalStatus=" + residentalStatus + ", feesPerMonth="
				+ feesPerMonth + "]";
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
	
	
	
	
}
