package lauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watch {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.amazon.in/");

		a.manage().window().maximize();

		WebElement search = a.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("oneplus");
		
		WebElement find = a.findElement(By.xpath("(//input[@type='submit'])[1]"));
		find.click();

		
	}

}
