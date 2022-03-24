package com.Day4;

public class Student2 {

	static int count = 1;
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(char studentType, String studentName) {
		super();
		this.studentId=count++;
		this.studentType = studentType;
		this.studentName = studentName;
	}
	
	
	
}
