package swe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://www.amazon.in/");
		//d.get("https://www.instagram.com/");
	    //	d.navigate().forward();
		d.navigate().refresh();
		d.navigate().back();
	    String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		String title = d.getTitle();
		System.out.println( title );
		d.manage().window().maximize();
		d.close();
		d.quit();
		
		
		
		
		
	}

}
