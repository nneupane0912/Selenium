package com.NeupaneN.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

public class DropDownTestFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
WebElement drop=driver.findElement(By.id("month"));
		
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++)
		{
		
			System.out.println(dropList.get(i).getText());	
			
		}
		
	}

}
