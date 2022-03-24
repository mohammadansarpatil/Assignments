package com.Day4;

public class Student1 extends CourseRegistration {

	protected int studentId;
	protected String studentName;
	protected char studentType;
	protected int semesterFees;
	protected double feesPerMonth;
	public Student1(String courseName, int studentId, String studentName, char studentType, int semesterFees,
			double feesPerMonth) {
		super(courseName);
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentType = studentType;
		this.semesterFees = semesterFees;
		this.feesPerMonth = feesPerMonth;
	}

	
	
	
}
