package day4;

public class Task9_10 {

public static void main(String[] args) {
	System.out.println("BREAK");
	for( int i=1;i<=10;i++ ) {
		if(i==5) {
			break;
		}
		
		System.out.println(i);
		
	}
	System.out.println("===========");
    System.out.println("CONTINUE");
	for(int i=1;i<=10;i++) {
		if (i==5)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
