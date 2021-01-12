package lauch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_l {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Sele_con\\driver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.greenstechnologys.com/");
		String title = d.getTitle();
		System.out.println(title);
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		d.close();
		
	}

}
