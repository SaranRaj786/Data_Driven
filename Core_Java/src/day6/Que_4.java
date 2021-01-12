package day6;

import java.util.Scanner;

public class Que_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String1 ");
		String str1 = s.nextLine();
		System.out.println("Enter the String2 ");
		String str2 = s.nextLine();
		System.out.println(str1.equals(str2));
		System.out.println("Ignore Case");
		System.out.println(str1.equalsIgnoreCase(str2));
		
		boolean contains = str1.contains("@");
		System.out.println(contains);
	}

}
