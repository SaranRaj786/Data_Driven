package lauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	drive.get("https://www.instagram.com");
	
	
	  Thread.sleep(2000);
		  WebElement phone = drive.findElement(By.xpath("//input[@name='username']"));
		  phone.sendKeys("aishwaryaramesh988@gmail.com");
		
		  
		  
		  WebElement password = drive.findElement(By.xpath("//input[@name='password']"));
		  password.sendKeys("gingingigana.");
		  
		  
		  WebElement login = drive.findElement(By.  xpath("( //button[contains(@class,'sqdOP ')]) [2]"));
		  login.click();
		  System.out.println("logged in successfully");
		  
		 		 
	
}
}
