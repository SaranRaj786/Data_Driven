package day6;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
				Scanner s =new Scanner (System.in);
		
				System.out.println("Password :");
				String password = s.nextLine();
				

				System.out.println(" Confirm Password :");
				String confirm = s.nextLine();
				
				boolean equals = password.equals(confirm);
				System.out.println(equals);
	}
	

}
