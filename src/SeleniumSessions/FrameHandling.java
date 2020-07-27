package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameHandling {
	
	WebDriver driver;
	
	@BeforeClass
	public void setProperty() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	}
			
		@BeforeMethod
		public void launchApplication() throws InterruptedException {
			driver.get("http://www.freecrm.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("chethanv");
			driver.findElement(By.name("password")).sendKeys("c12031982");
//			driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
//			
	}
		
	@Test
	public void selectFrame() throws InterruptedException{
		
		//switch to frame 
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
