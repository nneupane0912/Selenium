package com.narayan.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxTestAssignment2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Sizing of the Radio Button
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");		
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	    List<WebElement> radioButton=table.findElements(By.tagName("input"));
	    System.out.println(radioButton.size());
	    
	    // clicking one By One radio button
	    for (int i = 0; i < radioButton.size(); i++)
	    {
	    //radioButton.get(i).click();
	    //click on Specific RadioButton
	    
	   	/*if (radioButton.get(i).getAttribute("value").equals("Butter"));
        {
        radioButton.get(i).click();
     
        }
     */   
	    // capture the status of the all Radio button and name
	    	
	    System.out.println(radioButton.get(i).getAttribute("value")+"-------"+radioButton.get(i).getAttribute("Butter"));	
	   
	    
	    // Validation of radioButton
	    
	    radioButton.get(i).click();
	    
	    System.out.println("click on:"+radioButton.get(i).getAttribute("value"));
	   
	    for (int j = 0; j < radioButton.size(); j++) 
	    {
	     System.out.println(radioButton.get(j).getAttribute("value")+"-------"+radioButton.get(i).getAttribute("Butter")); 	
	    }
	    System.out.println("#########3");
	    
	    }
	    
	}

	
}    
