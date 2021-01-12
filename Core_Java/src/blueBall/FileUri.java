package blueBall;

import java.io.File;
import java.net.URI;

public class FileUri {
 
	public static void main(String[] args) {
		
	//	String filepath ="D:\\DGVC ";
		File file = new File("D:\\DGVC ");
		URI uri = file.toURI();
		System.out.println(uri.toString());
	}
}
