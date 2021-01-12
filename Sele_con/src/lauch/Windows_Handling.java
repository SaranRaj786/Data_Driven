 package lauch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Best_Seller
		
		WebElement best_seller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
	    Actions a = new Actions(driver);
	    a.contextClick(best_seller).perform();
	    Thread.sleep(2000);
	    
	    
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    //Mobile
	    
	    WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	    a.contextClick(mobile).perform();
	    Thread.sleep(2000); 
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    //Today_Deal
	    
	    WebElement today = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	    a.contextClick(today).perform();
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    
	    //New Release
	    
	    WebElement release = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	    a.contextClick(release).perform();
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    
	  //  String pid = driver.getWindowHandle();
	    Set<String> allid = driver.getWindowHandles();
	    System.out.println("***Window ID***");
	    for (String id : allid) {
	    	WebDriver window = driver.switchTo().window(id);
	    	
	    	System.out.println(window);
	    }
	    
	   System.out.println("***Window Title***");
	    for (String id : allid) {
	    	String title = driver.switchTo().window(id).getTitle();
	    	System.out.println(title);
			
		}
	    
	   
       String actual="Mobile Phones: ";
       for (String id1 : allid) {
    	   if(driver.switchTo().window(id1).getTitle().contains(actual)){
    	   break;
    	   
    	   }	
	 }
	    
   }
	
	    
}    
	


