package lauch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//downScroll
		
		WebElement downLogo = driver.findElement(By.xpath("(//div[contains(@class,'nav')])[141]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", downLogo);
		Thread.sleep(2000);
		
		//upScroll
		
		WebElement uplogo = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		js.executeScript("arguments[0].scrollIntoView();",uplogo);
		Thread.sleep(3000);
		
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,-3000)");
	    Thread.sleep(3000);
	
		driver.close();
		
	}

}
