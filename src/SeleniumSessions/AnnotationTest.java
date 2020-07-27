package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	WebDriver driver;

	@BeforeSuite
	public void suiteTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("test setup");
}
	@BeforeTest
	public void testTest() {
		driver.manage().window().maximize();
		System.out.println("open browser");
	}
	
	@BeforeClass
	public void testClass() {
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		System.out.println("open url");
	}
	
	@BeforeMethod
	public void testMethod() {
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(40,  TimeUnit.SECONDS);
		System.out.println("Validate ulr");
	}
	
	@Test(priority = 1, groups ="link navigation")
	public void testNew() {
		System.out.println("sequense: 1");
		
	}
	
	@Test(priority = 2, groups = "page text validation")
	public void testNew1() {
		System.out.println("sequense: 2");
		
	}
	
	@Test(priority = 3)
	public void testNew3() {
		System.out.println("sequense: 3");
		
	}
	
	@Test(priority = 4, groups = "create user")
	public void testNew4() {
		System.out.println("sequense: 4");
		
	}
	
	@AfterMethod
	public void MethodAfter() {
		System.out.println("logout");
		
	}
	
	@AfterClass
	public void classAfter() {
		driver.manage().deleteAllCookies();
		System.out.println("clearcookies");
	}
	
	
	@AfterTest
	public void TestAfter() {
		System.out.println("closeBrowser");
		driver.quit();
	}
}
