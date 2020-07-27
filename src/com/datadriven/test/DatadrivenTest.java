package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.excel.utility.Xls_Reader1;

public class DatadrivenTest {

	public static void main(String[] args) {
	
		Xls_Reader1 xlrd = new Xls_Reader1("D:\\Selenium\\MyWorkSpace2018\\SeleniumPractice\\src\\com\\testdata\\TestData.xlsx");
		
		 String fname = xlrd.getCellData("Register", "Firstname", 2);
		 String lname = xlrd.getCellData("Register", "Lastname", 2);
		 String email = xlrd.getCellData("Register", "Email", 2);
		 String username = xlrd.getCellData("Register", "Username", 2);
		 String password = xlrd.getCellData("Register", "password", 2);
		 
		 System.out.println(fname);
		 
		 
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium-java-3.14\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='false']")).click();
		
//		driver.findElement(By.xpath(" //div[@class='myButton']")).click();

	}

}
