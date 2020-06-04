package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("neupaneprasad@hotmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("N@eupane0912");
		
		driver.findElement(By.id("loginbutton")).click();	}

}
