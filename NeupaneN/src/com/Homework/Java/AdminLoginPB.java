package com.Homework.Java;

import org.openqa.jetty.http.nio.SocketChannelOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginPB 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		//logout
		//driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		//Thread.sleep(3000);
		//driver.close();
		
		
		//validation 
		
		if (driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).isDisplayed()) 
		
		{
		System.out.println("PASS");	
		}else
		{
		 System.out.println("FAIL");
		}
		
		
		
	}
	

}
