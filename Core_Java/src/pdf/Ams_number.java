package pdf;

import java.util.Scanner;

public class Ams_number {
	public static void checking(){
	int m,i,j=0;
	Scanner c = new Scanner(System.in);
    System.out.println("Enter the value ");
    int a = c.nextInt();
	m=a;
	while(m>0) {
		i=m%10;
		j=j+(i*i*i);
		m=m/10;
		
	}
	if(a==j) {
		System.out.println("The given value is Amstrong number");
	}else
	{
		System.out.println("The given value is Not an Amstrong number ");
	}
	
}
  public static void listofarm() {
	  
	  int c=0;
	  for(int n=1;n<1000;n++) {
		  int a,i,j=0;
		  a=n;
		  
		  while(a>0)
				   {
			  i=a%10;
			  j=j+(i*i*i);
			  a=a/10;
		  }
		  if(j==n) {
			  System.out.println("Amstrong number is "+j);
			  c++;
			  
		  }
	  }
	  System.out.println("Count of Amstrong number is "+c);
		  }
	  
  
  public static void main(String[] args) {
	  checking();
    listofarm();
    
  }	  
	  
}

