package javaProgrms;

public class StringCount {
	public static void main(String[] args) {
		String s = " King of pop";
		
		char[] a = s.toCharArray();
			int count=1	;
			for (int i = 0; i < a.length; i++) {
				for(int j=i+1;j<a.length;j++) {
					
				
				
					count++;
				}
				if(a[i]!=' ') {
					System.out.print(a[i]);	
					System.out.println();
				}
			}	
			
		
	}

}
