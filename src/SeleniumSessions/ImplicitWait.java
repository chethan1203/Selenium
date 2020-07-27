package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.flipkart.com");
		
		//wait for page to load
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//wait for all elements to be loaded in a page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
