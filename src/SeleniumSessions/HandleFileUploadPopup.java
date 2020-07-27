package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		//window popup or dialogbox to upload the local file 
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("D:\\Selenium\\CoreJava Programs\\Selenium Training Day1.ppt");;
	

	}

}
