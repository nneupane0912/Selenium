package com.Homework.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM {
// Global variables
ChromeDriver driver;
String res;
	
	
// appLaunch
	
	public String appLaunch(String url)
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get(url);
	
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
	
	//AddEmployee
	
	public  String employeeCreation(String firstName,String lastName) throws Exception 
	{
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\neupa\\OneDrive\\Desktop\\NN.jpg");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
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
	
	//AppLogout
	
	public String appLogout()
	{
	driver.findElement(By.id("welcome")).click();
	
	driver.findElement(By.linkText("Logout")).click();
	
	
	// validation
		
	if (driver.findElement(By.id("txtUsername")).isDisplayed()) 
		
	{
	res="Pass";
	}else
	{
	res="Fail";
	}
		
	return res;	
	
	}
	
	
	//AppLogin
	
	public String appLogin(String userName,String Password)
	{
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();

	// Validation
	
	if (driver.findElement(By.linkText("PIM")).isDisplayed()) 
	{
		res="Pass";
	}else
	{
		res="Fail";
	}
	return res;
	}
	
//=======================================================================	
	public static void main(String[] args) throws Exception 
	{
		OHRM app=new OHRM();
		String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		System.out.println(results);
		
		Thread.sleep(2000);
		app.appLogin("Admin","Qedge123!@#");
		
		Thread.sleep(2000);
		app.employeeCreation("RAM","Poudel");
		Thread.sleep(2000);
		app.appLogout();
		Thread.sleep(2000);
		app.appclose();
	
	}

}
