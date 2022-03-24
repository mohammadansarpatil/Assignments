package com.Day1;

public class Assignment2{
	public static void main(String[] args) {
		int myInt=10;
		float myFloat=1.2f;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;

		System.out.println("ARITHMETIC");
		System.out.println(myInt + myFloat + "=" + (myInt % myFloat));
		System.out.println();
		
		System.out.println("STRING CONCATENATION");
		System.out.println("Day" + 2 + "Session");
		System.out.println("\n"+ 2 + 3 + "\n"+ (2+3));
		System.out.println();
		
		System.out.println("RELATIONAL");
		System.out.println(myInt + "==" + myFloat + "=" + (myInt==myFloat));
		myFloat = 10.0f;
		System.out.println(myInt + "==" + myFloat + "=" + (myInt==myFloat));
		System.out.println();
		if(bool1 || (bool1 && (bool2==false))) {
			System.out.println("Success");
			
		}
		else {
			System.out.println("Failure");
			
		}
		System.out.println("Bool2 value " + bool2);
			
		
		
		

		
		

		

		
	}

}
