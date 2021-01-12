package javaProgrms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class StringWordsDupli {
	
	public static void main(String[] args) {
		
		String s = "We are world and we are the Children, we are the once make a better place";
		 
		Map<String,Integer> m= new LinkedHashMap<>();
		String[] allwords = s.split(" ");
		for(String words : allwords) {
			if(m.containsKey(words)) {
				Integer value = m.get(words);
				m.put(words, value+1);
			}
			else
			{
				m.put(words, 1);
			}
		}
			Set<Entry<String, Integer>> allentry = m.entrySet();
		    for(Entry<String,Integer> entry : allentry) {
		    	if(entry.getValue()>1) {
		    		System.out.println(entry);
		    	}
		    }
		}
	

}
