package com.Homework.Java;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.wellsfargo.com/");
	}

}
