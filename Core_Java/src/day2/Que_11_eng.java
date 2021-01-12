package day2;

public class Que_11_eng extends Q_11_med{
	public void be() {
		System.out.println("Batchelor of Engineering");
	}
	
	public void btech() {
		System.out.println("Batchelor of Technology");
	}
public static void main(String[] args) {
	Que_11_eng q =new Que_11_eng();
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
