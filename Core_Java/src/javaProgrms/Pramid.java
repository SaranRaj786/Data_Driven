package javaProgrms;

import java.util.Scanner;

public class Pramid {
	public static void main(String[] args) {	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = s.nextInt();
		/*
		 * System.out.println("Enter the Value of m"); int m = s.nextInt();
		 */
	
	for(int i=0;i<n;i++) {
		for(int j=n-i;j>1;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i*2;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	

}
