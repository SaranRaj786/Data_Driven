package pdf;

import java.util.Scanner;

public class FactFib {
	public void fact() {
		int sum = 0;
		Scanner c = new Scanner(System.in);
		System.out.println("Factorial");
		System.out.println("=========");
		System.out.println("Enter the Value");
		int n = c.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println("The Value is :" + sum);

	}

	public void fib() {
		System.out.println("Fibnaaci");
		System.out.println("========");
		int a = 0, b = 1, c;
		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

	public static void main(String[] args) {
		FactFib f = new FactFib();
		f.fact();
		f.fib();
	}

}
