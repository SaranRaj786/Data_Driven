
package com.sample;

import java.util.Scanner;

public class vote {
	public static void main(String[] args) {

		System.out.println("enter age : ");
		Scanner h = new Scanner(System.in);
		int a = h.nextInt();

		if (a >= 18) {
			System.out.println("candidate is able to vote");
		} else

		{
			System.out.println("the canditate is not able to vote");
		}
	}

}
