package com.Homework.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PhotoUploadTest
{

	public static void main(String[] args) throws Exception 
	{
      System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Narayan");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Neupane");
		
		
		
		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\neupa\\OneDrive\\Desktop\\NN.jpg");
		
		//Actions action=new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.id("photofile"))).sendKeys("C:\Users\neupa\OneDrive\Desktop\NN.jpg").build().perform();
		
		//run AutoIt Program
		
		//Runtime.getRuntime().exec("C:\\Users\\neupa\\OneDrive\\Desktop\\Narayan.exe");
		
	   //Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		
		
		
		
		

	}

}
