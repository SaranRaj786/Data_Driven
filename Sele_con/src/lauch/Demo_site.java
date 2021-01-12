package lauch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_site {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		driver.manage().window().maximize();
		
		  WebElement email =
		  driver.findElement(By.xpath("//input[@id='email_create']"));
		  email.sendKeys("sara@gmail.com");
		  

		  
		  WebElement create = driver.findElement(By.xpath("//button[@id='SubmitCreate']")); 
		  create.click();
		 
		/*
		 * WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		 * email.sendKeys("sarath@gmail.com");
		 * 
		 * WebElement psdd = driver.findElement(By.xpath("//input[@id='passwd']"));
		 * psdd.sendKeys("abcdef");
		 * 
		 * WebElement click =
		 * driver.findElement(By.xpath("//button[@id='SubmitLogin']")); click.click();
		 */
		
		Thread.sleep(5000);
		
		WebElement mr = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		mr.click();
		
		WebElement f_name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		f_name.sendKeys("King ");
		
		WebElement l_name = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		l_name.sendKeys("Of Pop");
		
		WebElement psd = driver.findElement(By.xpath("//input[@id='passwd']"));
		psd.sendKeys("abcdef");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select c = new Select(day);
		c.selectByIndex(2);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
	    Select m = new Select(month);
	    m.selectByIndex(3);
	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
	    Select y = new Select(year);
	    y.selectByValue("1998");
	    
	    WebElement up = driver.findElement(By.xpath("//input[@id='newsletter']")); 
	    up.click();
	    
	    WebElement com = driver.findElement(By.id("company"));
	    com.sendKeys("kekran mekran");
	    
	    WebElement add = driver.findElement(By.xpath("//input[@id='address1']"));
	    add.sendKeys("3rd Street, Ramapuram,kekran mekran");
	    
	    WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
	    city.sendKeys("Chennai");
	    
	    WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
	    Select s = new Select(state);
	    s.selectByIndex(3);
	    
	    WebElement zip = driver.findElement(By.xpath("//input[@id='postcode']"));
	    zip.sendKeys("12345");
	    
	    WebElement ph = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
	    ph.sendKeys("9876543211");
	    
	    WebElement ad = driver.findElement(By.xpath("//input[@id='alias']"));
	    ad.sendKeys("no.112, anna nagar,");
	    
	    WebElement reg = driver.findElement(By.xpath("//button[@id='submitAccount']"));
	    reg.click();
	}

}
