package com.Homework.Java;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.unix.X11.Window;

public class PrimusBankLogin //Library it contains reusable Methods
{
     //Global Variables
	ChromeDriver driver;
	String res;
	
	//AppLaunch (Converting program in to Method to Launch tha app) Method
	
	public String appLaunch(String url)// method with return type with parameter
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		
		//validation
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		
		{
		res="Pass";
		}else
		{	
		res="Fail";
		
	}
		return res;
	}
	
	
	
	
	
	
//==========================================================================
	//appLogin
	
	public String appLogin(String username,String Password)
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();

		//validation
		
		if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed()) 
		{
		res="Pass";	
		}else
		res="Fail";
		{
			return res;
		}
	}
	
	//Create Branch
	
	
	// AppLogout
	
	public String appLogout()
	{
	driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	
	//Validation
	
	if (driver.findElement(By.id("txtuId")).isDisplayed()) 
	{
		res="Pass";
	}else
	
	{
	res="Fail";	
	}
	return res;
	
	}
	
	public void appClose()
	{
		driver.close();
	}
	
	
	
	//AppLaunch ( this is Program)	
	
	public static void main(String[] args) 
	
	{
	PrimusBankLogin app=new PrimusBankLogin();
	
	//Calling a method with method name,it won't return a value
	// app.appLaunch("http://primusbank.qedgetech.com/home.aspx");
	// Calling a method with variables,it will return a value
	 
	String results=app.appLaunch("http://primusbank.qedgetech.com/home.aspx");
	  
	 System.out.println(results);
	 
	 String result1=app.appLogin("Admin","Admin");
	 System.out.println(result1);
	 app.appLogout();
	 app.appClose();
	 
	 
	}}
//==========================================================================

