package day6;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter a String : ");
		String c = s.nextLine();
		
		StringBuffer a =new StringBuffer(c);
		StringBuffer reverse = a.reverse();
		String n =reverse.toString();
		System.out.println("Reversed String : "+n);
		
		if(c.equals(n)){
			System.out.println("The Given String is PALINDROME");
			
		}
		else
		{
			System.out.println("The Given String is NOT A PALINDROME");
		}
	}
}