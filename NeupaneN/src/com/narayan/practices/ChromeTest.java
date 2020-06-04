package com.narayan.practices;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) 
	{
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://gmail.com");
	
	
	
	}

}
