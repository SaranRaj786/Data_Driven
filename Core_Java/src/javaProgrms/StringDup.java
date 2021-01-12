package javaProgrms;

public class StringDup {

	public static void main(String[] args) {
		String str= "Good things will be happen soon ";
		int count;
		
		char[] string = str.toCharArray();
		
		for(int i=0;i<string.length;i++) {
			
			count = 1;
		for(int j=i+1;j<string.length;j++) {
			if(string[i]==string[j] &&string[i]!=' ') {
				count++;
				string[j]=' '; 
			}
		} 
		if(count>1)
		{
			System.out.print(string[i]+" ");
			
		}
		}
		
	}
}
