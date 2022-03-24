package com.Day2;

public class Assignment8 {
	
	int i=22;
	int j=14000;
	boolean k;
	boolean l;
	
	public static void main(String[] args) {

		Assignment8 a8 = new Assignment8();
		a8.k=a8.Method1(a8.i);
		a8.l=a8.Method2(a8.j);
		
		if(a8.k==true && a8.l==true)
		{
			System.out.println("Is a new Employee");
		}
		else {
			System.out.println("Is not a new employee");
		}
	}
		public  boolean Method1(int i)
		{
			if(i>20 && i<30) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean Method2(int j)
		{
			if (j>=1400 && j<20000)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	

}
