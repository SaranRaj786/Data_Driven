package day3_6;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the sentance : ");
		String c = s.nextLine();
		
		char[] vowels = {'a','e','i','o','u'};
		
		for(char vow : vowels) {
	     c = c.replace(vow, '@');
		}
		
	
		System.out.println(c);

   
}

}
