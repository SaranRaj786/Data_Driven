package org.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seldy1\\driver\\chromedriver.exe");
		//to launch
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
	
	}

}
