package collection;

import java.util.ArrayList;
import java.util.List;

public class Array_list {
	
public static void main(String[] args) {
	
	
	List <Object> li = new ArrayList<Object>();
	
	li.add(18);
	li.add("Testing");
	li.add('c');
	li.add(14.87);
	System.out.println(li);
	
	boolean contains = li.contains("Testing");
	System.out.println(contains);
	
	Object object = li.get(2);
	System.out.println(object);
	
	int indexOf = li.indexOf('c');
	System.out.println(indexOf);
	
	Object remove = li.remove(3);
	System.out.println(li);
	
	 li.set(2,12.08);
	System.out.println(li);
	
	li.add('c');
	System.out.println(li);
	
	int size = li.size();
	System.out.println(size	);
	
}

}
