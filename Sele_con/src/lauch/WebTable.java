package lauch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		System.out.println("***** Table ******");
	    List<WebElement> alltable = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
	    System.out.println(alltable.size());
	    for (WebElement table : alltable) {
	    	System.out.println(table.getText());
			
		}
	    
	    System.out.println("***** Row1 *****");
	    List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
	    for (WebElement row_one : row1) {
	    	System.out.println(row_one.getText());
			
		}
	    
	    System.out.println("***** Row2 ******");
	    List<WebElement> row2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
	    for (WebElement row_2 : row2) {
			System.out.println(row_2.getText());
		}
	    
	    System.out.println("**** Row3 ******");
	    List<WebElement> row3 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
	    System.out.println(row3.size());
        for (WebElement row_three : row3) {
        	System.out.println(row_three.getText());
			
		}
			    
	    System.out.println("***** Columnn1 ******* " );
	    List<WebElement> column1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	    for (WebElement col_one : column1) {
			System.out.println(col_one.getText());
		}
	    System.out.println("**** Column2 ******");
	    List<WebElement> column2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	    System.out.println(column2.size());
	    for (WebElement column_two : column2) {
	    	System.out.println(column_two.getText());
	    	
			
		}
	    
	}

}
