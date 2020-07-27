package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("chethanv");
		driver.findElement(By.name("password")).sendKeys("c12031982");
//		driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
//		driver.findElement(By.xpath("//input[@type='submit']"));
		
		WebElement btn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		
		flash(btn, driver);
		drawBorder(btn, driver);
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium\\MyWorkSpace2018\\SeleniumPractice\\src\\SeleniumSessions\\login.png"));
		
		message(driver, "the login button is not enabled");
		
		Alert acpt = driver.switchTo().alert();
		
		acpt.accept();
		
		click(driver, btn);
		
//		refreshPage(driver);
					
		System.out.println(getpageTitle(driver));
		
		System.out.println(getPageInnerText(driver));
		
		scrollPageDown(driver);
		
//		driver.quit();
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i < 30; i++) {
			changeColor("rgb(0, 200, 0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
		public static void changeColor(String color, WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor =  '"+color+"'", element );
			
			try {
				Thread.sleep(20);
			} catch(InterruptedException e ) {
				
			}
}
		//draw border using 
		public static void drawBorder(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		//alert message
		public static void message(WebDriver driver, String message){
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("alert('"+message+"')");
		}
		 
		//click element
		public static void click(WebDriver driver, WebElement element){
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click();", element);
		}
		
		//refresh page
//		public static void refreshPage(WebDriver driver) {
//			JavascriptExecutor js = ((JavascriptExecutor) driver);
//			js.executeScript("history.go(0)");
//		}
//		
		
		//get title of the page
		public static String getpageTitle(WebDriver driver) throws Exception {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String title = js.executeScript("return document.title;").toString();
			return title;
		}
		
		//get innertext of the page
		 public static String getPageInnerText(WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		    	return pageText;
		    }
		 
		 //scroll the bar
		 public static void scrollPageDown(WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		    }
}
