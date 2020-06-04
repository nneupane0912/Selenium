package com.narayan.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiltipleRadioButtonTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");		
		driver.manage().window().maximize();
        
		//Sizing
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radioList=table.findElements(By.tagName("Input"));
		System.out.println(radioList.size());
		
		for (int i = 0; i < radioList.size(); i++)
		
		{
		//radioList.get(i).click();	
		
		System.out.println(radioList.get(i).getAttribute("value")+"   "+radioList.get(i).getAttribute("checked"));
			
		}
		
	}

}
