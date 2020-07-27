package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.amazon.in");
		
		//select is the class we use for dropdown selection
		Select select = new Select(driver.findElement(By.id("searchDropdownBox"))); 
		
		select.selectByValue("search-alias=beauty");
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();	
		
		if(driver.getPageSource().contains("India's Largest Beauty Store")) {
			System.out.println("Text Present");
		}else {
			System.out.println("Text not Present");
		}
		driver.quit();
		
	}

}
