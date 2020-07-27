package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@class, '_2AkmmA _29YdH8')]")).click();
	
//		Relative xpath by class properties
//		driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
//		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("honor 9n");
		
//		customized xpath by contains
//		driver.findElement(By.xpath("//input[contains(@class, 'LM6RPg')]")).click();
//		driver.findElement(By.xpath("//input[contains(@class, 'LM6RPg')]")).sendKeys("honor 9n");
		
//		Relative xpath by name properties
//		driver.findElement(By.xpath("//input[@name = 'q']")).click();
//		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("honor 9n");
		
//		customized xpath by contains
		driver.findElement(By.xpath("//input[contains(@class, 'LM6RPg')]")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'LM6RPg')]")).sendKeys("honor 9n");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		
		
		String expectedText = " results for \"honor 9n\"";
		
		String searchText = driver.findElement(By.xpath("//span[@class='_2yAnYN']")).getText();
		
		Assert.assertEquals(searchText.contains(expectedText), true);
						
		driver.findElement(By.xpath("//a[@title='Honor 9N (Sapphire Blue, 128 GB)']")).click();
//		
		Set<String> handler = driver.getWindowHandles();
		
			Iterator<String> it = handler.iterator();
			
			String parentWindow = it.next();
			
			String childWindow = it.next();
			
			driver.switchTo().window(childWindow);
			
			boolean phoneDEtails = driver.findElement(By.xpath("//span[@class='_35KyD6']")).getText().contains("Honor 9N");
			
			Assert.assertEquals(phoneDEtails, true);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.getTitle();
		
		driver.quit();

	}

}
