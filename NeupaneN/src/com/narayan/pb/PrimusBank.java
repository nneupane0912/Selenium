package com.narayan.pb;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusBank // Library it contains reusable methods
{
	
	// Global Variables
	
	ChromeDriver driver;
   	String res; 
	
	//AppLaunch
	
	public String appLaunch(String url) // method with return Type with parameters
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
	
	driver=new ChromeDriver();

	driver.get(url);		

	driver.manage().window().maximize();
	
	//validation 
	
	if (driver.findElement(By.id("txtuId")).isDisplayed()) 
	{
		//System.out.println("Pass");
		
		res="pass";	
				
	}	else 	
	{
      //System.out.println("Fail");
		
		res="Fail";
}
	return res;
}	
//=============================================================================	
	// appLogin
	
	public String appLogin(String username,String password)
	
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com/home.aspx");		
	
		driver.manage().window().maximize();
	   
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	
		//validation 
			
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
		res="Pass";
				
		}	else 	
		{
	      res="Fail";
		}
		return res;
	}
	
	//========================================================================
	// Logout
	
	public String appLogout()
	
	{
	driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	
	//validation 
		
	if (driver.findElement(By.id("txuid")).isDisplayed())
		{
		res="Pass";
			
		}else
		
		{
		res="Fail";
		}	
		
		return res;
		}
		
//===============================================================================
		
    //CloseApp
	
	public void appClose()
	{
	driver.close();	
	}
	
   
//=============================================================================	
	  public static void main(String[] args)
	  {
	
		 PrimusBank app=new PrimusBank(); 
		 
		 //calling a method with Method name it won't return a value
		 
		 //app.appLaunch("http://primusbank.qedgetech.com");
		 
        
		 //calling a method with variables it will return a value
				 
		 String results=app.appLaunch("http://primusbank.qedgetech.com");
		 
		 System.out.println(results);
		 
		 System.out.println(results);
		 
		 String results1=app.appLogin("Admin", "Admin");
		 
		 System.out.println(results1);
		 
		 app.appLogout();
		 
		 app.appClose();

		  
	//========================================================================	  
  //AppLaunch 
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com");		

		driver.manage().window().maximize();
		
		//validation 
		
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
		System.out.println("Pass");
				
		}	else 	
		{
	      System.out.println("Fail");
		}}

}
	
	
//================================================================================
