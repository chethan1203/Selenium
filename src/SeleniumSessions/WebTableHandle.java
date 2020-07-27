package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		int timeout = 30;
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium-java-3.14\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("chethanv");
		driver.findElement(By.name("password")).sendKeys("c12031982");
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='submit']"))));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Avyakkth Bharadwaj')]/parent::td//preceding-sibling::td//input[@name= 'contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Avyakkth Bharadwaj')]/parent::td")).click();

	}

}
