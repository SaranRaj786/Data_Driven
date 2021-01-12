package org.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserLaunch {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testings\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
	
		dr.get("https://en.wikipedia.org/wiki/Michael_Jackson");
	
	}

}
