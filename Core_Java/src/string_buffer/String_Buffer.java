package string_buffer;

public class String_Buffer {
public static void main(String[] args) {
	String s1="Saran";
	String s2="Raj";
	String s3="Developer";
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	
	StringBuffer sb1=new StringBuffer("Saran");
	StringBuffer sb2=new StringBuffer("Raj");
	StringBuffer sb3=new StringBuffer("Developer");
	System.out.println(System.identityHashCode(sb1));
	System.out.println(System.identityHashCode(sb2));
	System.out.println(System.identityHashCode(sb3));
	
	
	
	
}
}
