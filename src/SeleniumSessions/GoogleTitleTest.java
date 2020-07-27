package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(40,  TimeUnit.SECONDS);
	}
	
	@Test
	public void TestTiltle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google",  "The title is not matched");

}
	@Test
	public void LogoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(logo, "The log not found");
}
	
	@AfterMethod
	public void endTest() {
		driver.quit();
	}
}
