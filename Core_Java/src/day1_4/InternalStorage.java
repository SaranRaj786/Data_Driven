package day1_4;

import day3_6.axis_bank;
public class InternalStorage extends axis_bank{
	
	public void processorName() {
		
		String s =" intel core i5 7G";
		System.out.println("Processor : "+ s);
		
	}
   public void ramsize() {
	   String b = "8GB";
	   System.out.println("RamSize : "+b);
   }
   
   public static void main(String[] args) {
	   InternalStorage is = new  InternalStorage();
	   is.processorName();
	   is.ramsize();
	   is.deposit();
}
}
