package day2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the ID : ");
		int id = s.nextInt();
		
		System.out.println("Enter the Name : ");
		String str1 = s.nextLine();
		s.nextLine();
		
		System.out.println("Enter the eMail : ");
		String str2 = s.nextLine();
		
		System.out.println("Enter the Number : ");
		long ph = s.nextLong();
		
		System.out.println("Enter the Salary : ");
		long sal = s.nextLong();
		
		System.out.println("Enter the Gender : ");
		String str3 = s.nextLine();
		s.nextLine();
		
		System.out.println("Enter the City :");
		String city = s.nextLine();
		
		
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+str1);
		System.out.println("EmailID : "+str2);
		System.out.println("Phone Numeber : "+ph);
		System.out.println("Salary : "+sal);
		System.out.println("Gender : "+str3);
		System.out.println("City : "+city);
	}

  
    

	}



	

