package com.Day3;

public class Assignment8 {
	
	public static void main(String[] args) {
		Student3 std3=new Student3(1,"Ansar", 'F', "Hostelier", 34500);
		Student3 std4=new Student3(2,"Mark", 'H', "localite", 50000);
		
		if (std3.getResidentalStatus().equalsIgnoreCase("Hostelier"));
		{
			System.out.println("Monthly fees : " + std3.calculateFees(std3.getFeesPerMonth(), 50000));
		}
		
		if (std4.getResidentalStatus().equalsIgnoreCase("Localite"));
		{
			System.out.println("Monthly fees : " + std4.calculateFees(std3.getFeesPerMonth()));
		}

		
	}

}
