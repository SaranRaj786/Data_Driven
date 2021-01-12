package javaProgrms;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
	
		
	
	
	int count=0;
	Scanner c =new Scanner(System.in);
	
	int a = c.nextInt();
	for (int i = 1; i <= a; i++) {
		
	
	
		if(a%i==0) {
			count++;
		}
		
	}
	
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
			
		}
	
	

	}}
	


