package com.Day4;

public class DayScholar extends Student{
	
	String residentalAddress;

	public DayScholar(int studentId, String studentName, char studentType, double feesPerMonth,
			String residentalAddress) {
		super(studentId, studentName, studentType, feesPerMonth);
		this.residentalAddress = residentalAddress;
	}

	public String getResidentalAddress() {
		return residentalAddress;
	}

	public void setResidentalAddress(String residentalAddress) {
		this.residentalAddress = residentalAddress;
	}

	@Override
	public String toString() {
		return "DayScholar [residentalAddress=" + residentalAddress + ", studentId=" + studentId + ", studentName="
				+ studentName + ", studentType=" + studentType + ", feesPerMonth=" + feesPerMonth + "]";
	}
	
	public void displayStudentDetails()
	{
		System.out.println("DAY SCHOLAR");
		System.out.println("\nStudent Id :" + studentId + "\nStudent Name : " + studentName +"\nStudent Type : " + studentType + 
				"\nFees per Month" + feesPerMonth + "\nAddress : "+ residentalAddress);

	}
}
