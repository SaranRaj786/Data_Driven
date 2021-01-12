package com.sample;

import java.util.Scanner;


public class scanner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
	
		
		
		
		 System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		 System.out.println(" Given number is "+a);
		
         System.out.println("Enter the value of b ");
		 int b = sc.nextInt();
		 System.out.println(" Given number is  "+b);
			String v=sc.nextLine();

		System.out.println("******");
	
		System.out.println("Arithmetic operations" +v);
		
	     int c=a+b; 
	     int d=a-b;
	     int e=a*b;
	     int f=a/b;
	     int g=a%b;
	     
	     
	     
		 System.out.println("Addition value is : "+c);
		 System.out.println("Subtraction value is : "+d);
		 System.out.println("Multiplication value is : "+e);
		 System.out.println("Division value is : "+f);
		 System.out.println("Modulo value is : "+g);
				
	}
           
}   
