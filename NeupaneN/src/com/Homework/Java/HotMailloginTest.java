package com.Homework.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotMailloginTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://outlook.live.com/owa/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a")).click();
		
		driver.findElement(By.id("i0116")).sendKeys("neupaneprasad@hotmail.com");
		
		driver.findElement(By.id("idSIButton9")).click();
		
		driver.findElement(By.id("i0118")).sendKeys("N@eupane0912");
		
		driver.findElement(By.id("idSIButton9")).click();
		
		

	}

}
