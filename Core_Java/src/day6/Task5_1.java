package day6;

import java.util.Scanner;

public class Task5_1 {
public static void main(String[] args) {
	
	Scanner u =new Scanner (System.in);
	System.out.println("Enter the String  :");
	String r = u.nextLine();
    StringBuffer s =new StringBuffer(r);
    StringBuffer d = s.reverse();
    System.out.println(d);
   
}
}

