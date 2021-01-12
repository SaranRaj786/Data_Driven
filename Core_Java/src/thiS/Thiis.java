package thiS;

public class Thiis extends Supr {

	int b=112;
	
  private void add() {
   int b=113;
   
   System.out.println(b);
   System.out.println(this.b);
   System.out.println(super.b);
}
      
	
	public static void main(String[] args) {
		
		Thiis h =new Thiis();
		h.add();
		
		
		
	}

}
