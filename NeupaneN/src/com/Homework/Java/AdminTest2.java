package com.Homework.Java;

import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("http://primusbank.qedgetech.com/");
	    driver.manage().window().maximize();
	    
	   
	    
	
	}

}
