package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest 
{

	public static void main(String[] args) {
		
		//string username:
		//Username:Admin
		// Password:Admin
		
		
	
		String username ="Admin";
		String password="Admin";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		
	}}
