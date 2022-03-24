package com.Day4;

public class DayScholar1 extends Student1 {
	String residentalAddress;

	public DayScholar1(String courseName, int studentId, String studentName, char studentType, int semesterFees,
			double feesPerMonth, String residentalAddress) {
		super(courseName, studentId, studentName, studentType, semesterFees, feesPerMonth);
		this.residentalAddress = residentalAddress;
	}
	
	public void displayDetails() {
		System.out.println("Registration Id : " + regId +"\nCourse Name : " + courseName +"Student Id :" + studentId + "Student Name : "+ studentName + "Student Type : " + studentType + 
				"Fees per Month" + feesPerMonth + "\nAddress : " + residentalAddress);
	}
}
