package com.neupane.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest 
{
    
	public static void main(String[] args) throws Exception 
	{
		
		
		//Using variables
				String username="Admin";
				String password="Admin";
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		// login
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		// validation
		
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		

		
		
	}

}
