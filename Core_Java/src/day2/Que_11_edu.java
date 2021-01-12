package day2;

public class Que_11_edu extends Que_11_arts {
	public void ug() {
		System.out.println("Under Graduation");
	}
	
	public void pg() {
		System.out.println("-----------------");
		System.out.println("Post Graduation");
		System.out.println("================");
		System.out.println("Master of Science");
	}
	public static void main(String[] args) {
		Que_11_edu q = new Que_11_edu();
		q.ug();
		System.out.println("=================");
	    System.out.println("Arts and Science");
		System.out.println("================");
		q.bA();
		q.bEd();
		q.bBA();
		q.bSC();
		System.out.println("------------");
		System.out.println("Engineering");
		System.out.println("============");
		q.be();
		q.btech();
		System.out.println("------------");
		System.out.println("Medical");
		System.out.println("=========");
		q.dental();
		q.mbbs();
		q.physio();
		q.pg();
		
	}

}
