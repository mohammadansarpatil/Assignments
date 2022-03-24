package com.Day4;

public class DayScholar2 extends PostGradStudent{

	protected String residentialAddress;

	public DayScholar2(char studentType, String studentName, int postCourseId, String postCourseName,
			int postCourseFees, String residentialAddress) {
		super(studentType, studentName, postCourseId, postCourseName, postCourseFees);
		this.residentialAddress = residentialAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	@Override
	public String toString() {
		return "DayScholar2 [ studentId=" + studentId + " studentType= " + studentType + ", studentName= " + studentName
				+ "postCourseId=" + postCourseId + ", postCourseName=" + postCourseName
				+  ", postCourseFees=" + postCourseFees + " +residentialAddress=" + residentialAddress + "]";
	}

	
	
	
	
}
