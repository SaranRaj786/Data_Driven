package balance_topic;

import java.util.ArrayList;
import java.util.List;


public class Iterator {
	public static void main(String[] args) {
		List<Integer> li =new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		
	
		java.util.Iterator<Integer> iterator = li.iterator();
	while (iterator.hasNext()) {
		Integer integer = iterator.next();
		System.out.println(integer);
	}
	}

}
