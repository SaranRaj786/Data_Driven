package day3_6;

public class bankinfo extends axis_bank {
	
   public void fixed()
   {
	   System.out.println("Fixed : 2k ");
   }
	
   public void saving()
   {
	   System.out.println("Savings : 75L");
   }
   
   @Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		System.out.println("Deposit : 5L");
	}
	
	
	public static void main(String[] args) {
		bankinfo b=new bankinfo();
		b.deposit();
		b.fixed();
		b.saving();
	}
}
