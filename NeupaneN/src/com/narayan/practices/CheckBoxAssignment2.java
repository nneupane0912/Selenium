package com.narayan.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.echoecho.com/htmlforms09.htm");		
		driver.manage().window().maximize();
		
		// Sizing 
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	    List<WebElement> checkList=table.findElements(By.tagName("input"));
	    System.out.println(checkList.size());
	    
	    
	    
	    for(int i=0; i < checkList.size(); i++)
	    {
	    //Click  one by one checkBox
	    	
	    //checkList.get(i).click();
	    //click on Specific checkBox	
	    
	   	/*if(checkList.get(i).getAttribute("value").equals("Cheese"))
	   	{
	   		checkList.get(i).click();
	   	}*/
	    	
	   // }
	    //Capture the status of all the check box and name 
	    
	  
          //System.out.println(checkList.get(i).getAttribute("value")+"----"+checkList.get(i).getAttribute("checked"));	
	
         // Validation of checkBoxes  
          
          checkList.get(i).click();
          for (int j = 0; j < checkList.size(); j++) 
          
          {
			System.out.println(checkList.get(j).getAttribute("value")+"----"+checkList.get(j).getAttribute("Checked"));
		}
          System.out.println("#############");
	}

}}
