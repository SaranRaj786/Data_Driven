package pdf;

import java.util.Scanner;

public class Ascending {
	
	public static void ascending_order() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of index");
		int n = s.nextInt();
		
		System.out.println("Enter the Values");
		int a[] = new int[n];
		int temp=0;
		for(int i=0;i<a.length;i++) {
	            a[i] = s.nextInt();
		}
		
		//int a[]= {10,50,30,70,60,80};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Ascending Order");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
	  int min = a.length-1;
	  System.out.println("Minimum Value : "+a[min]);
	}
	
	public static void descending_order() {
		int temp=0;
		int a[]= {10,50,30,70,60,80};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Descending Order");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		int max = a.length-1;
		System.out.println("Maximun Value : "+a[max]);
	}
	
	
	public static void main(String[] args) {
		ascending_order();
		descending_order();
		
	}

}
