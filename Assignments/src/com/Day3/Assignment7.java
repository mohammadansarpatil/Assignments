package com.Day3;

public class Assignment7 {
	
	public static void main(String[] args) {
		Student2 std2 = new Student2();
		std2.setId(Integer.parseInt(args[0]));
		std2.setName(args[1]);
		std2.setResidentalStatus(args[2]);
		std2.setFeesPerMonth(Long.parseLong(args[3]));
		
		System.out.println(std2);
	}

}
