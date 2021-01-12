package lauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php?controller=my-account");
	    
	    driver.manage().window().maximize();
	    
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("sara@gmail.com");
	    
	    WebElement psd = driver.findElement(By.xpath("//input[@id='passwd']"));
	    psd.sendKeys("abcdef");
	    
	    WebElement sub = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	    sub.click();
	    
	    Thread.sleep(5000);
	    WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
	    Actions a =new Actions(driver);
	    a.moveToElement(women).perform();
	    
	    WebElement t_Shirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
	    t_Shirt.click();
	    
	    WebElement sleeve = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	    sleeve.click();
	    
	
	    driver.switchTo().frame(0);
	    

		  Thread.sleep(3000);
		  WebElement item = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")); 
		  item.clear();
		  item.sendKeys("3");
		  
		  
		  
		  WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		  Select z = new Select(size);
		  z.selectByIndex(1);
		  
		  WebElement blue = driver.findElement(By.xpath("//a[@title='Blue']"));
		  blue.click();
		  
		  WebElement add = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")); 
		  add.click();
		 
		  Thread.sleep(2000);
	    WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	    proceed.click();
	    
	    
	}

}
