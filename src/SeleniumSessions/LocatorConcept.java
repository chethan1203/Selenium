package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorConcept {

	public static void main(String[] args) {
		
	    	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-java-3.14\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://www.amazon.in");
		
//		driver.manage().window().maximize();
		
		//1.using xpath locator--2nd priority
		
//		WebElement createUser = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-icon nav-arrow']"));
//		
//		act.moveToElement(createUser).build().perform();
//		
//		WebElement createUser1 = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]"));
//		
//		act.moveToElement(createUser1).click().build().perform();
//		
//		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Marlabs");
//		
//		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9901800333");
//		
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chethan.venkat@marlabs.com");
//		
//		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("marlabs@123");
		
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//2. using id locator ---1 priority
		
//		WebElement createUser = driver.findElement(By.id("nav-link-yourAccount"));
//		
//		act.moveToElement(createUser).build().perform();
//		
//		WebElement createUser1 = driver.findElement(By.id("nav-flyout-ya-newCust"));
//	
//		act.moveToElement(createUser1).click().build().perform();
//		
//		driver.findElement(By.id("ap_customer_name")).sendKeys("Marlabs");
//		
//		driver.findElement(By.id("ap_phone_number")).sendKeys("9901800333");
//		
//		driver.findElement(By.id("ap_email")).sendKeys("chethan.venkat@marlabs.com");
//		
//		driver.findElement(By.id("ap_password")).sendKeys("marlabs@123");
		
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//3. using class name :- not use full
		
//		WebElement createUser = driver.findElement(By.className("nav-arrow-inner"));
//		
//		act.moveToElement(createUser).build().perform();
//		
//		WebElement createUser1 = driver.findElement(By.className("nav-a"));
//	
//		act.moveToElement(createUser1).click().build().perform();
//		
//		driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys("Marlabs");
//		
//		driver.findElement(By.className("a-input-text a-span12 a-spacing-micro auth-required-field auth-require-phone-validation")).sendKeys("9901800333");
//		
//		driver.findElement(By.className("a-input-text a-span12 auth-require-email-validaton\" data-validation-id=\"email")).sendKeys("chethan.venkat@marlabs.com");
//		
//		driver.findElement(By.className("a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation")).sendKeys("marlabs@123"); 
		
		//4.using name --3 priority
			
//		WebElement createUser = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-icon nav-arrow']"));
//		
//		act.moveToElement(createUser).build().perform();
//		
//		WebElement createUser1 = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]"));
//		
//		act.moveToElement(createUser1).click().build().perform();
//				
//				driver.findElement(By.name("customerName")).sendKeys("Marlabs");
//				
//				driver.findElement(By.name("email")).sendKeys("9901800333");
//				
//				driver.findElement(By.name("secondaryLoginClaim")).sendKeys("chethan.venkat@marlabs.com");
//				
//				driver.findElement(By.name("password")).sendKeys("marlabs@123");
				
				
		//5.linkText--only for links
		
//		WebElement createUser = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-icon nav-arrow']"));
//				
//		act.moveToElement(createUser).build().perform();
//				
//		driver.findElement(By.linkText("Start here.")).click();					
		
		
	 //6. partialLinkText not use full
				
//		WebElement createUser = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-icon nav-arrow']"));
//				
//		act.moveToElement(createUser).build().perform();
//				
//		driver.findElement(By.partialLinkText("Start")).click();	
				
		
	//7. css selector--priority 2 
		
		WebElement createUser = driver.findElement(By.cssSelector("#nav-link-yourAccount > span.nav-line-2 > span"));
		
		act.moveToElement(createUser).build().perform();
		
		WebElement createUser1 = driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a"));
		
		act.moveToElement(createUser1).click().build().perform();
		
		driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Marlabs");
		
		driver.findElement(By.cssSelector("#ap_phone_number")).sendKeys("9901800333");
		
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("chethan.venkat@marlabs.com");
		
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("marlabs@123");
		
//		driver.findElement(By.cssSelector("//input[@id='continue']")).click();
		
		driver.quit();
//				
		
	}

}
