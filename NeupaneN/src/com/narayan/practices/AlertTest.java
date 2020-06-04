package com.narayan.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();

		//driver.get("https://www.hdfcbank.com/");		
	
		//driver.manage().window().maximize();
		
		// handling html alert/popup
       
		//driver.findElement(By.xpath("//*[@id='popupBoxClose']")).click();
	   
		// handling java Script Alert
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com/home.aspx");		
	
		driver.manage().window().maximize();
        
		driver.findElement(By.id("login")).click();
	    
		// handling Alert
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		// Click on Ok Button
		al.accept();
	}

}
