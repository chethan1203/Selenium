package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. ff driver
		//geckodriver
		
		//set the property of gecko driver to drive the firefox properties
//		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium-java-3.14\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//		WebDriver fdriver = new FirefoxDriver(); //launch the browser 
//		driver.get("http://www.google.co.in"); //open the site/url
//		driver.manage().window().maximize();
//		
		//2.chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in"); //open the site/url
		driver.manage().window().maximize(); //maximize window
		String pageTitle = driver.getTitle();
				
		//validation point
		if (pageTitle.equalsIgnoreCase("Goole")){
			System.out.println("Title matched");
		}else {
			System.out.println("Title not matched");
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();	
	}

}
