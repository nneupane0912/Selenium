package com.Homework.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {

	public static void main(String[] args) 
	{
	
		System.setProperty("webDriver.ie.driver", "C:\\Users\\neupa\\Downloads\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.amazon.com/");
	}
	

}
