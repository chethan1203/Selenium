package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action = new Actions(driver); // Create this object for mouse hover or mousemovementon the element
		
		driver.get("https://book.spicejet.com");
		
		WebElement adon = driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"));
		
		//move the cursor or mouse hover
		action.moveToElement(adon).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Special Fare")).click();
		
		

	}

}
