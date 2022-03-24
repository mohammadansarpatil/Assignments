package com.Day3;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String uname;
		uname=sc.nextLine();
		System.out.println(uname.length());
		System.out.println("Hi " + uname);
		System.out.println(uname.toLowerCase());
		System.out.println(uname.toUpperCase());
		System.out.println("Name is starting with " + uname.charAt(0));
		 uname= "SEED";
		 System.out.println(uname);
		
		
	}

}
