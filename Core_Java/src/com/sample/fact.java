package com.sample;

public class fact {

	public void facto() 
	{
	int n=10;
	int factorial=1;
	for (int i=1;i<=n;i++)
	{
		
		factorial=factorial +i;
		
	}
	System.out.println(factorial);
	}
	
public static void main(String[] args) {
	fact f= new fact();
	f.facto();
	
}
}
