package lauch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowm_multi {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
	   WebElement day = driver.findElement(By.xpath("//select[@id='select-demo']"))	;
	   Select s = new Select(day);
	   s.selectByIndex(3);
	   System.out.println(day.getText());
	   
	 
	   WebElement list = driver.findElement(By.xpath("//select[@id='multi-select']"));
	   Select c =new Select(list);
	   for(int i=0;i<=7;i++ ) {
		   if(i==3 || i==7 || i==4) { 
			   c.selectByIndex(i);
		   }
		 
	   }
	//   System.out.println(list.getText());
	   
	 WebElement firstSelectedOption = c.getFirstSelectedOption();
	 System.out.println(firstSelectedOption.getText());
	   
	 List<WebElement> allSelectedOptions = c.getAllSelectedOptions();
	 for (WebElement webElement : allSelectedOptions) {
		
		 System.out.println(webElement.getText());
	}
	}

}
