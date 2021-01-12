package com.sample;

import java.util.Scanner;

public class pratice {
	public static void main(String[] args) {
		

	
		Scanner r = new Scanner(System.in);

		System.out.println("Enter the value");
		int a = r.nextInt();    

		int temp = a;
		int rev = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		if (a == rev) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not a palindrome");
		}

		

		}
}


