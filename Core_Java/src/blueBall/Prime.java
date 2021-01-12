package blueBall;

public class Prime {
  
	public void prime() {

	int a=7;
	int count=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0)
			count++;
	}
	
	if(count==2) {
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
	}
	}
	
	public void fact() {
		
		int b= 5;
		int sum =1;
		for(int i=1;i<=b;i++) {
			sum =sum*i;
		}
		System.out.println(sum);
		
	}
	
public static void main(String[] args) {
	Prime v = new Prime();
	v.prime();
	v.fact();
}
}
	