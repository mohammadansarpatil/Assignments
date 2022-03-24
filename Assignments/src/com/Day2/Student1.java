package com.Day2;

public class Student1 {
	public  int studId;
	public static int count =550;
	private char studType;
	private String studName;
	public Student1() {
		super();

	}
	
	public Student1(char studType, String fName, String lName ){
		super();
		this.studId= ++count;

		this.studType = studType;
		this.studName = fName + " "+lName ;
	}
	@Override
	public String toString() {
		return "Student1 [studId="+ studId +", studType=" + studType + ", studName=" + studName + "]";
	}
	
	public void studentCount() {
		System.out.println("Students : "+ (count-550));
	}
	
	
	
	
	

}
