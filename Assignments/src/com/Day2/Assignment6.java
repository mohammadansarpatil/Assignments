package com.Day2;


public class Assignment6 {
	String Name;
	
	Assignment6(){
		Name="Ansar";
	}
	
	Assignment6(String Name){
		this.Name=Name;
	}
	
	public static void main(String[] args) {
		Assignment6 a6 = new Assignment6();
		Assignment6 b6 = new Assignment6("Mark");
		
		System.out.println("DEFAULT "+a6.Name);
		System.out.println("PARAMETERIZED "+b6.Name);
	}

}
