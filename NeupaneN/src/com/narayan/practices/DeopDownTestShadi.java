package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeopDownTestShadi 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://shadi.com/");
		
		driver.manage().window().maximize();
		
		//month dropdown
		Select month=new Select(driver.findElement(By.id("dob_m")));
		month.selectByIndex(9);
		
		//day dropdown
		
		Select day=new Select(driver.findElement(By.id("dob_d")));
		day.selectByIndex(12);
		//year deopDown
		
		Select year=new Select(driver.findElement(By.id("dob_y")));
		year.selectByIndex(23);
				
		
		
	}

}
