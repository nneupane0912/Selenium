package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTestAssignment 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// click on RadioButton Female
		
		//driver.findElement(By.id("u_0_6")).click();
		
		//validate it
		
		
		//if(driver.findElement(By.id("u_0_6")).isSelected());
	
		//driver.findElement(By.id("u_0_6")).click();
		
		//System.out.println(driver.findElement(By.id("u_0_6")).getAttribute("u_0_6"));
		
		
		// click on RadioButton male
		
		//driver.findElement(By.id("u_0_7")).click();
		
		//Click on RadioButton custom
		
		//driver.findElement(By.id("u_0_8")).click();
		
		
		// validate custom radioButton
		
		if(driver.findElement(By.id("u_0_8")).isSelected());
		
		driver.findElement(By.id("u_0_8")).click();
		
		System.out.println(driver.findElement(By.id("u_0_8")).getAttribute("u_0_8"));
	
		
		
		
	}

}
