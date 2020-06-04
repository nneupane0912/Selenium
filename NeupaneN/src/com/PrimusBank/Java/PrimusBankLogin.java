package com.PrimusBank.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusBankLogin 
{

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		 ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com/");	
		driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
	    driver.findElement(By.id("txtPword")).sendKeys("Admin");
	    driver.findElement(By.id("login")).click();
		
	}

}
