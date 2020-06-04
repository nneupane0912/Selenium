package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/advanced_search");		
	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xX4UFf")).sendKeys("Narayan");
        
		// select the Text
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		
		// copy
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		
		// pest Text
		
		driver.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"v");
		
	}

}
