package com.NeupaneN.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest 
{

public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
		
	//	Captures all links by using tagName (tagName is common for all Elements) and stored in the variables
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
		//size
	{	
		System.out.println(links.size());
		
		for (int i = 0; i< links.size(); i++) 
		{
		System.out.println(links.get(i).getText());	
		
		}
	}

}
}