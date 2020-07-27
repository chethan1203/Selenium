package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FindbyElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act =new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
				
//		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Fashion')]"))).build().perform();
////		
//		driver.findElement(By.xpath("//*[contains(text(),'Fashion')]")).click();
		 List<WebElement> linklist = driver.findElements(By.tagName("a"));
		 
		System.out.println(linklist.size());
		
		for(int i = 0; i< linklist.size(); i++){
			 
			String txt = linklist.get(i).getText();
			System.out.println(txt);
	}
}
}
