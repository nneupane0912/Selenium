package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipalDropDwonTestFacebook 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com/");
		
		driver.manage().window().maximize();
		
		//day deopDown
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(5);
		
		//monthsDropDown
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(1);
		
		//year DropDown
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByIndex(5);
		
		
		
		
		
	}

}
