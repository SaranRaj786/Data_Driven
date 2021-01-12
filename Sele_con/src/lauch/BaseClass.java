package lauch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
   public static WebDriver driver;
	public static void getBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			}
			else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			}
			
			else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//return driver;
		
	}
	
	public static void launch(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void sendkeys(WebElement element, String value ) {
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dropdown(WebElement element , String value, String option) {
		
		
		try {
			if(option.equalsIgnoreCase("value")) {
				Select s = new Select(element);
				s.selectByValue(value);
			}
			else if(option.equalsIgnoreCase("text")) {
				Select s = new Select(element);
				s.selectByVisibleText(value);
			}
			else if(option.equalsIgnoreCase("index")) {
				Select s = new Select(element);
				s.selectByIndex(Integer.parseInt(value));;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
