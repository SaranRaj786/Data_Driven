package swe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Inter {
	public static void main(String[] args) {
		
	 
		
		System.setProperty("Webdrive.ie.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\drive\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.com/");
	}

}
