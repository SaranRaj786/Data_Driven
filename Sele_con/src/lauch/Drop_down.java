package lauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select days = new Select(day);
		days.selectByVisibleText("Monday");
		Thread.sleep(2000);
		WebElement cou = driver.findElement(By.xpath("//select[@id='multi-select']"));
		Select coun = new Select(cou);
		Thread.sleep(1000);
		coun.selectByVisibleText("California");	
		Thread.sleep(1000);
		coun.selectByVisibleText("Washington");	
		Thread.sleep(1000);
		coun.selectByVisibleText("Florida");	
		Thread.sleep(1000);
		coun.selectByVisibleText("Pennsylvania");
		Thread.sleep(1000);
		coun.selectByVisibleText("New Jersey");	
		Thread.sleep(1000);
		coun.selectByVisibleText("Texas");	
		Thread.sleep(1000);
		coun.selectByVisibleText("New York");	
		Thread.sleep(1000);
	
		WebElement all = driver.findElement(By.xpath("//button[@id='printAll']"));
		all.click();
	}

}
