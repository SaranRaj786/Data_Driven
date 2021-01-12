package javaProgrms;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {
		
		
		
		int[] a = new int[] {20,25,5,30};
		int[] b = new int[] {12, 32,24};
		
		int length = a.length; 
		int length2 = b.length;
		System.out.println("a Length : "+length);
 		System.out.println("b Length : "+length2);
		
 		boolean equals = Arrays.equals(a, b);
 		System.out.println(equals);
 		
		
	}

}
