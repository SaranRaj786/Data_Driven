package lauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
	WebDriver d =new ChromeDriver();
	d.get("https://www.youtube.com/");
	WebElement search = d.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("soorarai potru");
	
	WebElement search_icon = d.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
	search_icon.click();
	Thread.sleep(3000);
	
	
	WebElement suriya = d.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
	suriya.click();
	
	
	WebElement next = d.findElement(By.xpath("(//a[@role='button'])[1]"));
	Thread.sleep(3000);
	next.click();
}
}
