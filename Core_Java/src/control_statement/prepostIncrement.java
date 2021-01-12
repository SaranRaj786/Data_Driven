package control_statement;

public class prepostIncrement {
	public static void main(String[] args) {
		int i=18;
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i++);
		
		System.out.println("output :" + (i++ + i++));
		
		System.out.println( "output :" + (++i + i++));
	}

}
