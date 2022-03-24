package com.Day4;

public class DayScholar3  extends Student3{
	
	private String residentialAddress;

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Residential Address : " + residentialAddress);
	}

}
