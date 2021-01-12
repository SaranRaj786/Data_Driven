package day6;

import java.util.Scanner;

public class Que_8 {

public static void main(String[] args) {
	Scanner s =new Scanner (System.in);
	System.out.println("Enter the UPPERCASE : ");
	String Str = s.nextLine();
	
	System.out.println("Enter the lowercase : ");
	String str1 = s.nextLine();
	
	String lowerCase = Str.toLowerCase();
	System.out.println(lowerCase); 
	
	String upperCase = str1.toUpperCase();
	System.out.println(upperCase);
}

}
