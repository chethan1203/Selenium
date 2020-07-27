package com.datadriven.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader1;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		
		Xls_Reader1 xlrd = new Xls_Reader1("D:\\Selenium\\MyWorkSpace2018\\SeleniumPractice\\src\\com\\testdata\\TestData.xlsx");
		
		int rownum= xlrd.getRowCount("Register");
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium-java-3.14\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
					
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.freecrm.com/register/");
			driver.findElement(By.xpath("//input[@value='false']")).click();
			
			//add coloumn to the sheet
			xlrd.addColumn("Register", "status");
		
		for(int i= 2; i<= rownum; i++) {
			
			Select sel = new Select(driver.findElement(By.id("payment_plan_id")));
			sel.selectByIndex(0);
			
			 String fname = xlrd.getCellData("Register", "Firstname", i);
			 String lname = xlrd.getCellData("Register", "Lastname", i);
			 String email = xlrd.getCellData("Register", "Email", i);
			 String username = xlrd.getCellData("Register", "Username", i);
			 String password = xlrd.getCellData("Register", "password", i);
				
			 	driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
			 	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
				
			 	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
			 	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
				
			 	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
			 	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
				
			 	driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).clear();
			 	driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(email);
				
			 	driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			 	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
				
			 	driver.findElement(By.xpath(" //input[@placeholder='Password']")).clear();
			 	driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys(password);
				
			 	driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).clear();
			 	driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(password);
			 	
			 	xlrd.setCellData("Register", "status", i, "pass");
			 	
			 	driver.findElement(By.xpath(" //div[@class='myButton']")).click();
		}
		
		
	}

}
