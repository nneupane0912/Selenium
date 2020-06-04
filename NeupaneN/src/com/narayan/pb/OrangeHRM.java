package com.narayan.pb;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM //Library it contains reusable methods
  
{ // Global variables
	ChromeDriver driver;
	String res;
	//AppLaunch
	public String appLaunch(String url)
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();

		driver.get(url);		
	
		driver.manage().window().maximize();
        
		//Validation
		
		if (driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}

	//appLogin
	
	public String appLogin(String username,String password)
	{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
		
	//Validation
	
	if (driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).isDisplayed()) 
	{
		res="pass";
	}else
	{
	res="Fail";

	}
	return res;
	
	}
	// Add Employee
	public String appAddEmployee(String FirstName, String MiddleName,String LastName) throws Exception
	{
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Ramesh");
	    driver.findElement(By.id("middleName")).sendKeys("Prasad");
	    driver.findElement(By.id("lastName")).sendKeys("Neupane");
	    driver.findElement(By.id("btnSave")).click();
	 
	   // validation
	    
	    if (driver.findElement(By.xpath("//*[@id='empPic']")).isDisplayed()) 
	    
	    {
		res="Pass";
		}else
		{
			res="Fail";
		}
	    return res;
		}
	
	
	// appLogout
	
	public String appLogout() throws Exception
	
	{
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	
	//validation
	
	if (driver.findElement(By.id("txtUsername")).isDisplayed())
	
	{
	res="Pass";
	}else
	{
	res="Fail";
	}
	return res;
	}
	
	//AppClose
		public void appclose()
		{
		driver.close();
		}
		
	
	public static void main(String[] args) throws Exception
	{
     OrangeHRM app=new OrangeHRM();
    //Calling a method with method name,it won't return value
     //app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard");
    
     //Calling a method with help of variable,it will return a value
     String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard");
	 System.out.println(results);
	 Thread.sleep(2000);
	 String result1=app.appLogin("Admin","Admin");
	 Thread.sleep(2000);
	 System.out.println(result1);
	 app.appAddEmployee("Ramesh", "Prasad", "Neupane");
	 Thread.sleep(2000);
	 app.appLogout();
	 Thread.sleep(2000);
	 app.appclose();
	}
		
	
	
}
