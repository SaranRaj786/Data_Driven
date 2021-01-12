package day3_7;

public class college extends university {

	@Override
	public void ug() {
		super.ug();
		System.out.println("St.Thomas college of Arts and Science ");
	}

	
	  @Override public void pg() {
		  super.pg();
	  System.out.println("DG Vaishnav colleg of Arts and Science"); }
	 
	public static void main(String[] args) {
		college c = new college();
		c.ug();
		c.pg();
	}

}