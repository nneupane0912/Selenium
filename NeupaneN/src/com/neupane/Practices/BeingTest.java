package com.neupane.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeingTest 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
			
		driver.findElement(By.id("id_s")).click();
		
		
	}

}
