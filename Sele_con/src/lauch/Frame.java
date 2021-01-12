package lauch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
 public static void main(String[] args) throws InterruptedException {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.automationtesting.in/Alerts.html");
	 driver.manage().window().maximize();
	 
		/*
		 * WebElement frame1 = driver.findElement(By.id("singleframe"));
		 * driver.switchTo().frame(frame1); Thread.sleep(2000); WebElement text_box =
		 * driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 * text_box.sendKeys("king of pop");
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * WebElement frame2 =
		 * driver.findElement(By.xpath("(//a[@class='analystic'])[2]")); frame2.click();
		 * 
		 * WebElement frame_out =
		 * driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		 * driver.switchTo().frame(frame_out);
		 * 
		 * WebElement frame3 =
		 * driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		 * driver.switchTo().frame(frame3); Thread.sleep(2000);
		 * 
		 * WebElement text_box2 =
		 * driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		 * text_box2.sendKeys("kumaresaaaaaaa");
		 */
	 
	 
	 //alert
	 
	WebElement alert_btn = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
	alert_btn.click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	//2 ALERT
	WebElement alert_btn1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	alert_btn1.click();
	
	WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
	btn1.click();
	Alert alert2 = driver.switchTo().alert();
	alert2.dismiss();
	
	//text
	
	WebElement alert_btn2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	alert_btn2.click();
		
	Thread.sleep(2000);
	WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
	btn2.click();
	Alert alert3 = driver.switchTo().alert();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("completed");
	alert3.accept();
	

	
	
}
}
