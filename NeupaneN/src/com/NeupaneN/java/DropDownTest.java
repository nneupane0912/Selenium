package com.NeupaneN.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Dipers");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dipers");
		driver.findElement(By.className("nav-input")).click();
	
		
	}

}
