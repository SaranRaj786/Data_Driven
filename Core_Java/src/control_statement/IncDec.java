package control_statement;

public class IncDec {
	public static void main(String[] args) {
		
		int a=11, b=22,c,d;
		c=a+b+(a++)+(b++)+(++a)+(++b);
		System.out.println("Increment:"+c);
		
		d= a + b + (b--)+ (--a)+ (--b);
		System.out.println("Decrement :"+d);
		
	}


	}


