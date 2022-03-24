package com.Day2;

public class Assignment7 {
	
	public void PassByValue(int sId) {
		sId=60;
		System.out.println(sId);
	}
	
	public void PassByReference(Student s) {
		s.studId= 12;
		System.out.println("Student id"+  s.studId);

	}
	
	public static void main(String[] args) {
		int sId = 12;
		Student s = new Student();
		Assignment7 a7 = new Assignment7();
		
		System.out.println(sId);
		a7.PassByValue(sId);
		System.out.println(sId);
		
		
		
		System.out.println("Student id"+  s.studId);
		a7.PassByReference(s);
		System.out.println("Student id"+  s.studId);

	}

}
