package com.Day4;

public class CourseRegistration {
	
	static int count1=1;
	protected int regId;
	protected String courseName;
	public CourseRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseRegistration(String courseName) {
		super();
		regId = ++count1;;
		this.courseName = courseName;
	}
	public  int getRegId() {
		return regId;
	}
	public  void setRegId(int regId) {
		this.regId = regId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	void displayDetails() {
		System.out.println("\nRegistration Id : "+ regId + "\nRegistration Name");
	}
	
	
	

}
