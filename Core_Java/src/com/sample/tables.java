package com.sample;

import java.util.Scanner;

public class tables
{ 
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		
		int i=1;
		System.out.println("Enter the Table values");
		int j = c.nextInt();
		System.out.println("Enter the Table steps");
		int k = c.nextInt();
		System.out.println(j + "Tables");
		System.out.println("=======");
		while( i<=k)
		{
	        
			System.out.println(j +"x" + i +"=" +j*i);
			i++;
	}
	
	
  

}

}
