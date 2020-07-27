package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Thread.sleep(5000);
		Alert chwindow = driver.switchTo().alert(); //class available in selenium to handle javascript alert
		
		if(chwindow.getText().equals("Please enter a  user name")) {
			
			chwindow.accept(); //click the ok button in alert
		}
		else
		{
			System.out.println("incorrect alert found");
		}
		
		driver.quit();
	}

}
