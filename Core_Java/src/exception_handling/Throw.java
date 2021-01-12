package exception_handling;

public class Throw {
	public static void vote(int age) throws Exception{
		if(age>=18) {
			System.out.println("Eligible to voting");
		}
		else
		{
		throw new Exception("Age should be greater than 18");
		}
	}
	
	
	
	public static void main(String[] args) throws Exception{
		vote(20);
	}



	

}
