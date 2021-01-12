package Array;

import java.util.Scanner;

public class scanarray {

	public static void main(String[] args) {

		System.out.println("Enter the Index Value");

		Scanner y = new Scanner(System.in);

		int n = y.nextInt();

		System.out.println("Enter the Values");
		
		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = y.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("The Given Values  " + a[i]);

		}

	}
}
