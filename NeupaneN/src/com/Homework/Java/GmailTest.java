package com.Homework.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class GmailTest 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://gmail.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("seleniumtest947@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("N@eupane0912");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
		
		
	}

}
