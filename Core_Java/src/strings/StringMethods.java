package strings;

public class StringMethods {


	public static void main(String[] args) {
		
		String s = "Welcome to Technology";
		
		int length = s.length();
		System.out.println(length);
		
	    char charAt = s.charAt(12);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('o');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('o');
		System.out.println(lastIndexOf);
		
		boolean equals = s.equals("Welcome to Technology");
		System.out.println(equals);
		
		boolean contains = s.contains("Wel");
		System.out.println(contains);
		
		String replace = s.replace("Technology", "Sunday Samayal");
		System.out.println(replace);
		
		
	}

}
