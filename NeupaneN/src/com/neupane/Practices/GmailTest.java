package com.neupane.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://gmail.com/");
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
    driver.findElement(By.id("identifierId")).sendKeys("seleniumtest947@gmail.com");
    driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("N@eupane0912");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
    
    // validation
    
   	
		
	if (driver.findElement(By.id("profileIdentifier")).isDisplayed()) 
	{
		System.out.println("Pass");
	}else
	{
		System.out.println("Fail");
	}
    
    
    //SignOut
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='gb_71']")).click();
	
	// appClose
    Thread.sleep(2000);
    driver.close();
	
	}

}
