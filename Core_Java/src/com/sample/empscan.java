package com.sample;

import java.util.Scanner;

public class empscan {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		System.out.println("Enter the EmpId");
		int a = e.nextInt();
		System.out.println(a);

		System.out.println("Enter the EmpName");
		String b = e.next();
		System.out.println(b);

		System.out.println("Enter the dob");
		int c = e.nextInt();
		int d = e.nextInt();
		int f = e.nextInt();
		System.out.println(c + "." + d + "." + f);

		System.out.println("Enter the Phone no");
		long g = e.nextLong();
		System.out.println(g);

		System.out.println("Enter the email");
		String h = e.next();   
		System.out.println(h);   

		e.nextLine();	System.out.println("Enter the Address");
		String i = e.nextLine();
		System.out.println(i);  

	}

}