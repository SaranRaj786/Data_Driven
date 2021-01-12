package day2;

public class Que_11_arts extends Que_11_eng{
	public void bSC() {
		System.out.println("Batchelor of Science ");
	}
  public void bEd() {
	  System.out.println("Batchelor of Education");
  }
  public void bA() {
	  System.out.println("Batchelor of Arts");
  }
  public void bBA() {
	  System.out.println("Batchelor of Bussiness Administration");
  }
  public static void main(String[] args) {
	  Que_11_arts q = new Que_11_arts();
	  System.out.println("Arts and Science");
	  System.out.println("================");
	  q.bSC();
	  q.bEd();
	  q.bA();
	  q.bBA();
	  System.out.println("Engineering");
	  System.out.println("============");
	  q.be();
	  q.btech();
		System.out.println("Medical");
		System.out.println("=========");
		q.dental();
		q.mbbs();
		q.physio();
}
  
  

}
