package com.Homework.Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("src")).sendKeys("H");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> cities=driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
	   
	    System.out.println(cities.size());
       
	    for (int i = 0; i < cities.size(); i++) 
	    {
    	
	    	System.out.println(cities.get(i).getText());
       }
	}

}
