package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsePopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//-Alert : Javascipt popup(accept, dismiss)
		//Fileupload popup --browse button(typr = file, sendkeys(path))
		//Browser window popup --Advertisement popup (windowHandler API)
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> lst = windows.iterator();
		
		String parentwindow = lst.next();
		
		String childwindow = lst.next();  
		
		

	}

}
