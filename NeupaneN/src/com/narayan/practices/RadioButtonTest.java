package com.narayan.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://facebook.com");		
		driver.manage().window().maximize();
		
		// Sizing 
		
		WebElement radio=driver.findElement(By.id("u_0_z"));
	    
		List<WebElement> radioList=radio.findElements(By.tagName("label"));
		
		System.out.println(radioList.size());
		
		
		for (int i=0; i < radioList.size(); i++) 
		{
		
		// Click one by one Radio Button
			
		 //radioList.get(i).click();	
		
		 // System.out.println(radioList.get(i).getText());
		  
		  if (radioList.get(i).getText().equals("Female"))
		  {
		  radioList.get(i).click();
		}
			
		}
	}

}
