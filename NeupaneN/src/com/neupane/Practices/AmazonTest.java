package com.neupane.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		
	//validation
		
		if (driver.findElement(By.id("twotabsearchtextbox")).isDisplayed())
			
		{
			System.out.println("pass");
			
		}else
		{
			System.out.println("Fail");
		}
		
		
	}

}
