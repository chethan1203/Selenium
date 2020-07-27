package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(40,  TimeUnit.SECONDS);
		
		Actions action = new Actions(driver); // Create this object for mouse hover or mouse movement on the element
		
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-shopall']"))).moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Echo & Alexa')]")))
		.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Echo Dot')]"))).click().build().perform();
		
		driver.findElement(By.xpath("//span[@id='productTitle']")).isEnabled();
		String Itemtitle = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
				
		if(Itemtitle.equalsIgnoreCase("Echo Dot - Voice control your music, Make calls, Get news, weather & more - Black")){
			System.out.println("Text found");
		}
		else {
			System.out.println("Text not found");
		}
		driver.quit();
	}
}
