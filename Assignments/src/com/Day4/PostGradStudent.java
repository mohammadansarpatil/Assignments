package com.Day4;

public class PostGradStudent extends Student2 {
	
	protected int postCourseId;
	protected String postCourseName;
	protected int postCourseFees;
	
	public PostGradStudent(char studentType, String studentName, int postCourseId, String postCourseName,
			int postCourseFees) {
		super(studentType, studentName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCourseFees = postCourseFees;
	}
	public int getPostCourseId() {
		return postCourseId;
	}
	public void setPostCourseId(int postCourseId) {
		this.postCourseId = postCourseId;
	}
	public String getPostCourseName() {
		return postCourseName;
	}
	public void setPostCourseName(String postCourseName) {
		this.postCourseName = postCourseName;
	}
	public int getPostCourseFees() {
		return postCourseFees;
	}
	public void setPostCourseFees(int postCourseFees) {
		this.postCourseFees = postCourseFees;
	}
	@Override
	public String toString() {
		return "PostGradStudent [postCourseId=" + postCourseId + ", postCourseName=" + postCourseName
				+ ", postCourseFees=" + postCourseFees + "]";
	}
	
	

}
