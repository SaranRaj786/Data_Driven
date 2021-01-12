package lauch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook extends BaseClass {
	 static  WebElement create;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		/*
		 * WebElement email = d.findElement(By.id("email"));
		 * email.sendKeys("sarath@123");
		 * 
		 * WebElement pswd = d.findElement(By.id("pass")); pswd.sendKeys("1234567");
		 */
		Thread.sleep(1000);
		/*
		 * WebElement create = d.findElement(By.id("u_0_2")); create.click();
		 */
		
		sendkeys(create, "u_0_2");
		Thread.sleep(1000);

		WebElement name1 = d.findElement(By.xpath("//input[@name='firstname']"));
		name1.sendKeys("Saran");
		
		WebElement name2 = d.findElement(By.xpath("//input[@name='lastname']"));
		name2.sendKeys("Jackson");
		
		
		  WebElement phn = d.findElement(By.xpath("//input[@name='reg_email__']")); 
		  phn.sendKeys("9876543211");
		  
		  WebElement pswd = d.findElement(By.xpath("//input[@name='reg_passwd__']"));
		  pswd.sendKeys("abcdefghi");
		 
		  
		
		WebElement day = d.findElement(By.xpath("//select[@name='birthday_day']"));
		Select c = new Select(day);
		c.selectByValue("1");
		
		WebElement month = d.findElement(By.xpath("//select[@name='birthday_month']"));
		Select  m = new Select(month);
	    m.selectByValue("3");
	    
	    WebElement year = d.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select y = new Select(year);
	    y.selectByValue("1998");
	    
	    WebElement sex = d.findElement(By.xpath("//input[@value='2']"));
	    sex.click();
	    
	    WebElement submit = d.findElement(By.xpath("//button[@name='websubmit']"));
	    submit.click();
	    
	   TakesScreenshot ss = (TakesScreenshot) d; 
	   File screenshot = ss.getScreenshotAs(OutputType.FILE);
	   File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\ScreenShotS\\ig.png");
	   FileUtils.copyFile(screenshot, destination);
	    
	    
	}

}
