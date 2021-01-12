package day6;

public class Day6_String {

public static void main(String[] args) {
	String s1 = "Greens Technology";
	String s2 = "SeleniumAutomationTool ";
	String s3 = "velmurugn";
	String s4 = "J a v a p r o g r a m ";
	String s5 = "9876543211 ";
	
	
	int length1 = s1.length();
	int LastindexOf = s1.lastIndexOf('o');
	
	int length2 = s2.length();
	int indexOf = s2.indexOf('o');
	
	int length3 = s3.length();
	int indexOff =s3.indexOf('l');
	
	int length4 = s4.length();
	int indexOfff = s4.indexOf(' ');
	
	int length5 = s5.length();
	int indexOffff = s5.indexOf('7');
	
	System.out.println("Length of S1 : "+length1);
	System.out.println("S2 : "+length2);
	System.out.println("S3 : "+length3);	
	System.out.println("S4 : "+length4);
	System.out.println("S5 : "+length5);
	
	System.out.println("LastindexOf 'o' :"+LastindexOf);
	System.out.println("indexOf "+ indexOf);
	System.out.println("indexOf : "+indexOff);
	System.out.println("indexOf :"+ indexOfff);
	System.out.println("indexOf :"+ indexOffff);
	System.out.println();
}
}
