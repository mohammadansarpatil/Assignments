package com.Day4;

public class Student {
	
	protected int studentId;
	protected String studentName;
	protected char studentType;
	protected double feesPerMonth;
	public Student(int studentId, String studentName, char studentType, double feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentType = studentType;
		this.feesPerMonth = feesPerMonth;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentType=" + studentType
				+ ", feesPerMonth=" + feesPerMonth + "]";
	}
	
	public void displayStudentDetails() {
		
		System.out.println("Student Id :" + studentId + "Student Name : "+ studentName + "Student Type : " + studentType + "Fees per Month" + feesPerMonth);
		
	}
	
	

}
