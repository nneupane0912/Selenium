package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTestFaceBook 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");		
	
		driver.manage().window().maximize();
		
		Actions pageDown =new Actions(driver);
		
		pageDown.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.linkText("Create a page")).click();
	}

}
