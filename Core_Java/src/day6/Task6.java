package day6;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner v =new Scanner(System.in);
		System.out.print("Enter the String :");
		String s = v.nextLine();
		String s1 =s;
		int count=0;
		
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			
				if(c=='a' || c=='e' || c == 'i'|| c=='o'|| c=='u') {
					count++;
					System.out.print("  "+c);
			
				}
		
		}
		System.out.println();
		System.out.println("Number of Vowels present in the String : "+count);
	
	}
	}
