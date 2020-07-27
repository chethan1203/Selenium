package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcenpt {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		
		driver.get("https://www.freecrm.com/");
		
		System.out.println("the title before login : " + driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("chethanv");
		driver.findElement(By.name("password")).sendKeys("c12031982");
		driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(3000);
		
		System.out.println("the title after login : " + driver.getTitle());
	}

}
