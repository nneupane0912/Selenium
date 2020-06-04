package com.NeupaneN.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeopDownTest2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement> countryList=country.findElements(By.tagName("option"));
		
		System.out.println(countryList.size());
		
		for (int i = 0; i < countryList.size(); i++)
		{
		//System.out.println(countryList.get(i).getText());
			//select one by one country
			countryList.get(i).click();
			
			}
			
	}}		
		
		
			
	
	
	


	


