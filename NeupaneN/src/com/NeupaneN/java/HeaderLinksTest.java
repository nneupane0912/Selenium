package com.NeupaneN.java;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksTest 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		// identify the header section
		
		WebElement header=driver.findElement(By.id("nav-xshop"));
		
		//identify the links under header section
		
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		
		System.out.println(headerLinks.size());
		
		for (int i = 0; i < headerLinks.size(); i++) 
		
	
		System.out.println(headerLinks.get(i).getText());	
		}
	
	

}
