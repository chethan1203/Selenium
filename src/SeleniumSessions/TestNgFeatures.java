package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFeatures {
	//this class file is to test the "dependOnMethods" option available in TestNg
	WebDriver driver;
		@BeforeTest
		public void Login(){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
		}
		@Test(priority =0)
		public void TestUserCreate() {
			System.out.println("user created");
		}
		
		@Test(priority =1)
		public void TestUserEdit() {
			System.out.println("user edited");
		}
		
		@Test(priority =3, groups="sanit")
		public void TestUserUpdate() {
			System.out.println("user updated");
		}
		
		@Test(invocationCount=10)
		public void TestCount(){
			int sum = 10+5;
			System.out.println(sum);
		}
		
		@AfterTest
		public void logout(){
			driver.quit();
		}
}
