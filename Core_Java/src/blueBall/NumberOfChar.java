package blueBall;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfChar {
	public static void main(String[] args) {
		
		String s = "Welcome to java";
		Map<Character, Integer> m = new LinkedHashMap<>();
		char[] charArray = s.toCharArray();
		System.out.print(charArray );
		
		for(char c:charArray) {
			if (Character.isAlphabetic(c)) {
		
			
			if(m.containsKey(c)) {
				Integer value = m.get(c);
				m.put(c, value+1);
			} 
			else
			{
				m.put(c, 1);
			}
			}
		}
		System.out.println(m);
	}

}
