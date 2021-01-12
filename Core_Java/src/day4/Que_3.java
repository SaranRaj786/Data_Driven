package day4;

import java.util.Scanner;

public class Que_3 {

public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	System.out.println("Enter the Value :");
	int a = s.nextInt();
	System.out.println("ODD numbers");
	for(int i=1;i<=a;i++)
	{
	
		if (i%2!=0) {
			
	
		System.out.println(i);
	}
		
}
	System.out.println("Even numbers");
	for(int i=1;i<=a;i++)
	{
	
		if (i%2==0) {
			
	
		System.out.println(i);
	}
		
}

}
}
