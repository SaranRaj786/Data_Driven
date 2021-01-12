package day2;

public class Q_11_med {
	public void physio() {
		System.out.println("Physio Department");
	}
   public void dental() {
	   System.out.println("Dental Department ");
   }
   public void mbbs() {
	   System.out.println("MBBS Department");
   }
   public static void main(String[] args) {
	   Q_11_med q=new Q_11_med();
	   
		System.out.println("Medical");
		System.out.println("=========");
		q.dental();
		q.mbbs();
		q.physio();
}
	
}
