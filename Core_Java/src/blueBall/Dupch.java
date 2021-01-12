package blueBall;

public class Dupch {
	public static void main(String[] args) {
		
		String s = "Positivity";
		int count;
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			count=1;
			for(int j=i+1;j<s.length();j++) {
				
				if(charArray[i]==charArray[j]) {
					count++;
				
				}
				
			}
			if(count>1 || count>2) {
			System.out.println(charArray[i]);
		}}
	}

}
