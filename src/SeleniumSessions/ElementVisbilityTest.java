package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisbilityTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium-java-3.14\\\\chromedriver_win32\\\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium-java-3.14\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		//is Displayed method
		boolean flag = driver.findElement(By.className("myButton")).isDisplayed();
		System.out.println(flag);
		
		//is Enabled method
		boolean flag1 = driver.findElement(By.className("myButton")).isEnabled();
		System.out.println(flag1);
		
		//isSelected false
		boolean flag6 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag6);
		
		//check the agree check box
		driver.findElement(By.name("agreeTerms")).click();
		boolean flag5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag5);
		
		//is enabled
		boolean flag2 = driver.findElement(By.className("myButton")).isEnabled();
		System.out.println(flag2);
		
		//is displayed
		boolean flag4 = driver.findElement(By.className("myButton")).isDisplayed();
		System.out.println(flag4);
		
		//isSelected is only applicable for checkbox, radiobutton, and select drop down
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean flag7 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag7); 

	}

}
