package lauch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/tshirts-for-men?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-tshirts-for-men");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		List<Integer> price_list=new ArrayList<Integer>();
		
		
		List<WebElement> all_price = driver.findElements(By.xpath("//span[@class='product-discountedPrice']//following::span[@class='product-strike']"));
 			for (WebElement prize_element : all_price) {
				String price = prize_element.getText().replace("Rs. ", "");
				System.out.println(price);
				int parseInt = Integer.parseInt(price);
				
				price_list.add(parseInt);
				
				
			}
			System.out.println(price_list);
			int size = price_list.size();
			System.out.println("Size : "+(size));
			System.out.println("Maxinum_Value : "+ Collections.max(price_list));
		}
		
	}

