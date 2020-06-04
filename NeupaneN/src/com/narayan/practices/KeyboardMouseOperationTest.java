package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseOperationTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();
        WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
        WebElement ywl=driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"));
        Actions mouse=new Actions(driver);
        
        mouse.moveToElement (signIn).build().perform();
        mouse.moveToElement(ywl).click().build().perform();
        
        
		
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"));
	}

}
