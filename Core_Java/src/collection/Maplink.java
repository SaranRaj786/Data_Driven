package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Maplink {
	public static void main(String[] args) {
		
		/*
		 * Scanner c =new Scanner(System.in);
		 * System.out.println("Enter the Sentence : "); String s = c.nextLine();
		 */
		String s = "Welcome god god here here here";
		
		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		
		String[] allwords = s.split(" ");
		
		
		for (String word : allwords) {
			if(m.containsKey(word)) {
			Integer value = m.get(word);
			m.put(word, value+1);
		}
		else {
			m.put(word, 1);
		}		
		}
		
		System.out.println(m);
		
		
		Set<Entry<String, Integer>> allEntry = m.entrySet();
		for (Entry<String, Integer> entry : allEntry) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}

}
