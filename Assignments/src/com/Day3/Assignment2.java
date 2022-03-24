package com.Day3;

public class Assignment2 {
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,1,1},{2,2,2}, {3,3,3}};
		int[][] arr2 = {{3,3,3},{2,2,2}, {1,1,1}};
		int[][] arr3 = new int[3][3];
		
		for(int i=0; i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++) 
			{
				arr3[i][j]=arr1[i][j] + arr2[i][j];
			System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		

		
		
	}

}
