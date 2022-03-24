package com.Day4;

public class Hostelite extends Student {
	
	String hostelName;
	int roomNumdber;
	public Hostelite(int studentId, String studentName, char studentType, double feesPerMonth, String hostelName,
			int roomNumdber) {
		super(studentId, studentName, studentType, feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumdber = roomNumdber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumdber() {
		return roomNumdber;
	}
	public void setRoomNumdber(int roomNumdber) {
		this.roomNumdber = roomNumdber;
	}
	@Override
	public String toString() {
		return "Hostelite [hostelName=" + hostelName + ", roomNumdber=" + roomNumdber + ", studentId=" + studentId
				+ ", studentName=" + studentName + ", studentType=" + studentType + ", feesPerMonth=" + feesPerMonth
				+ "]";
	}
	
	public void displayStudentDetails() {
		
		System.out.println("HOSTELITE");
		System.out.println("\nStudent Id :" + studentId + "\nStudent Name : "+ studentName + "\nStudent Type : " + studentType + 
				"\nFees per Month : " + feesPerMonth + "\nHostel Name : " + hostelName + "\nRoon No. : " + roomNumdber);

	}
	
	
	

}
