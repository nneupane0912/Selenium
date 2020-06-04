package com.narayan.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test

public void adminLogin()
{
 String  username="Admin";
 String  password="Admin";
	
//appLaunch

 System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 driver.get("http://primusbank.qedgetech.com/");		
 // validation
 
Assert.assertTrue((driver.findElement(By.id("txtuId")).isDisplayed()));
 
	//appLogin
	
 driver.findElement(By.id("txtuId")).sendKeys(username);
 driver.findElement(By.id("txtPword")).sendKeys(password);
 driver.findElement(By.id("login")).click();
    

}
}
