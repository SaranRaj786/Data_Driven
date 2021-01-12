package variabletypes;

public final class Static extends Variable{

	 static int a;
	
	public static void add()
	{
			int b=10;
			System.out.println(b);
	}
	public static void main(String[] args) {
	    Static s =new Static (); 
		add();
		System.out.println(a);
		s.claass();
	}
}
