package pdf;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int i,sum1 = 0, sum2=0;
		System.out.println("Enter the Value :");
		int a = s.nextInt();
		System.out.println("ODD numbers");
		for( i=1;i<=a;i++)
		{
		
			if (i%2!=0) {
		        sum1=sum1+i;
		        System.out.println(i);
				
			}

			
		}
		

        System.out.println("Sum of Odd : "+sum1);
        
        System.out.println("------------------");
        
        
    	System.out.println("EVEN numbers");
		for( i=1;i<=a;i++)
		{
		
			if (i%2==0) {
		        sum2=sum2+i;
		        System.out.println(i);
				
			}

			
		}
		

        System.out.println("Sum of EVEN : "+sum2);

}
}