package com.neupane.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class YahooTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("header-search-input")).sendKeys("Selenium Training");
        driver.findElement(By.xpath("//*[@id='header-desktop-search-button']/svg")).click();
        
        
        // validation
        if (driver.findElement(By.id("header-search-input")).isDisplayed()) 
        {
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}

}
