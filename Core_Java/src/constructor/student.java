package constructor;

public class student {
	
	public void stud_name() {
		System.out.println("Name");
	}
	
	
	public student(String  s) {
		System.out.println("Student department " +s);
		System.out.println(s);
		
	}
	
	
 public student(){
	 System.out.println("id");  
	 
	 
 }
  public student(String d,int a) {
	  System.out.println("hi");
	  System.out.println(d);
	  System.out.println(a);
  }
	
public static void main(String[] args) throws Throwable {
	student s1= new student();
	student s2 =new student("Testing");
	student s3 = new student("king ",2);
	s1.stud_name();
	s2.finalize();
}
}
