package com.Day2;

public class Assignment2 {
	public static void main(String[] args) {
		boolean bool = true;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10; j++) {
				System.out.println(j+"\t");
				if(j>5) {
					//break;
					System.out.println();
					continue;
				}
			}
			System.out.println("Outer Loop");
		}
		System.out.println("End");
	}

}
