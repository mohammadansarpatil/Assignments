package com.Day2;

public class Student {
	String studType;
	int studId;
	public String getStudType() {
		return studType;
	}
	public void setStudType(String studType) {
		this.studType = studType;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	
	
	
	Student(){
		studId=100;
		studType="F";
	}
	

}
