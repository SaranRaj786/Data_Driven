package day2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner c = new Scanner (System.in);
		
		int sum , a;
		System.out.println("Enter the Student ID ");
		int id = c.nextInt();
		
		System.out.println("Enter the Student Name :");
		String name = c.nextLine();
		c.nextLine();
		
		System.out.println("Enter the Mark1 :");
		int m1 = c.nextInt();
		

		System.out.println("Enter the Mark2 :");
		int m2 = c.nextInt();
		
		System.out.println("Enter the Mark3 :");
		int m3 = c.nextInt();
		System.out.println("Enter the Mark4 :");
		int m4 = c.nextInt();
		System.out.println("Enter the Mark5 :");
		int m5 = c.nextInt();
		
		sum= m1 + m2 + m3 + m4 + m5;
		System.out.println("Total : "+ sum);
		
		a= sum/5;
		System.out.println("Average : "+a);
	}

}
