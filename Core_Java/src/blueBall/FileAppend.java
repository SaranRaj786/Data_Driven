package blueBall;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Windows.old\\Program Files\\Windows Defender.txt");
		FileWriter fr = new FileWriter(file,true);
		BufferedWriter br = new BufferedWriter(fr);
		PrintWriter pr = new PrintWriter(br);
		pr.println("Welcome to Blueball");
		pr.close();
		br.close();
		fr.close();
	}

}
