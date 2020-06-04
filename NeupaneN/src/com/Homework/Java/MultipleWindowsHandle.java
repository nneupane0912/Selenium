package com.Homework.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.unix.X11.Window;

public class MultipleWindowsHandle 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.naukri.com/");		
	
		driver.manage().window().maximize();
        
		// Capture all the window Id's
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		
		/*Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
		
		//Capturing All the windows Id's	
		//System.out.println(it.next().toString());
			
		// give the focus one by one window, capture title of the window and close it.	
		
		//driver.switchTo().window(it.next().toString());
		
		//System.out.println(driver.getTitle());
		
		//driver.close();
			
		//Close all the windows except "Intellect"
		
		driver.switchTo().window(it.next().toString());
		
		if(!driver.getTitle().equals("Intellect"))
		{
			driver.close();
		}*/
		
		
		  /*for(String items:windows)
		  {
		  //System.out.println(items);
			driver.switchTo().window(items);
		    System.out.println(driver.getTitle());
		    driver.close();
		}*/
		
		//By using ArrayList
		
		List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	
	
	}

