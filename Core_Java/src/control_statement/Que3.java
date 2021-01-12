package control_statement;

import java.util.Scanner;

public class Que3 {
	public static void main(String[] args) {
		Scanner f= new Scanner(System.in);
		
	System.out.println("Enter the value of i");
	int n = f.nextInt();
		
	for (int i=1;i<=n;i++)
	{
		if(i==5)
		{
			System.out.println(i);
			break;
		}
		
		System.out.println(i);
		
	}
}
}