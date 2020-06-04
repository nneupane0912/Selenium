package com.narayan.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethotTestAmazon 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select sl=new Select(drop);
		//sl.selectByIndex(40);
		
		//sl.selectByVisibleText("Baby");
		//sl.selectByValue("search-alias=alexa-skills");
		
		List<WebElement> deopList=sl.getOptions();
		System.out.println(deopList.size());
		
		for (int i = 0; i < deopList.size(); i++)
		{
		System.out.println(deopList.get(i).getText());	
		}
		
	}

}
