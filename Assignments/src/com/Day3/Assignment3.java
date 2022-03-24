package com.Day3;

public class Assignment3 {
	
	public static void main(String[] args) {
		String[][] s1 = new String[][] {{"Tony", "C#" , "Java", "Cpp"},{"Thomas","Java","Unix"}, {"John","Python"}
		,{"Delvin","C","HTML","CSS","JS"}};
		String s2="Delvin";
		
		for (int i=0;i<s1.length;i++) {
			
			for(int j=0 ; j<s1[i].length; j++)
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
				
		for (int i=0;i<s1.length;i++) {
			if((s1[i][0]).equals(s2)) 
			for(int j=0 ; j<s1[i].length; j++)
			{
				System.out.print(s1[i][j]+" ");
			}
	
		}
	}

}
