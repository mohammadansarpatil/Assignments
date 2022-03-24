package com.Day2;
import java.util.*;
public class Assignment3 {
	public static void main(String[] args) {
		String grade;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER GRADE");
		grade=sc.nextLine();
		switch(grade){
			case "A":
				System.out.println("RANGE: 80 to 100");
			break;
			case "B":
				System.out.println("RANGE: 73 to 79");
			break;
			case "C":
				System.out.println("RANGE: 65 to 72");
			break;
			case "D":
				System.out.println("RANGE: 55 to 64");
			break;
			case "E":
				System.out.println("RANGE: 0 to 54 ");
			break;
			default:
				System.out.println("Grade Invalid");
				break;
				
			
		}
		
	}

}
