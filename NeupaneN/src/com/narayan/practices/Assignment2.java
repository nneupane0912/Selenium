package com.narayan.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 
{

	public static void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
        
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com/");		
	    driver.manage().window().maximize();
		
		//Applogin
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("Narayan912");
		driver.findElement(By.id("txtAdd1")).sendKeys("177 preston Braid");
		driver.findElement(By.id("txtZip")).sendKeys("78664");
		Thread.sleep(2000);
	    Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	    country.selectByIndex(1);
	    Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		
		//Alert
		
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		// validation
		
		if(msg.contains("created Sucessfully"))
		{
		System.out.println("pass");
			
		} else if(msg.contains("already exist"))
		{
		System.out.println("fail");
	    } else if (msg.contains("please fillin the following fields:"))
		{
			System.out.println("Warning");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[1]/a/img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		driver.close();
	}}
		
		
		
		
		

	


