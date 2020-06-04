package com.narayan.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTest 
{
 ChromeDriver driver;
 
 @BeforeTest
 public void appLaunch()

 {   
 System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("http://primusbank.qedgetech.com/");
	 
 driver.manage().window().maximize();
 
 }

 
	@AfterTest
	public void appClose()
	{
		driver.close();
	}
	
	@Test
	public void appLogin()
	{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();

	}
	
}
