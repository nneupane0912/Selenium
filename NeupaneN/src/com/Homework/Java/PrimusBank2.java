package com.Homework.Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank2 

{ //Global Variables
	ChromeDriver driver;
	
	String res;
	//appLaunch
	
	public String appLaunch(String url)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
	
    
   // validation
    
    if (driver.findElement(By.id("txtuId")).isDisplayed())
    {
	res="Pass";
	}else
	{
	res="Fail";
	}
    return res;
    
	}
    
  // appLogin
	public String appLogin(String username,String password)
	
	{
	driver.findElement(By.id("txtuId")).sendKeys(username);
	driver.findElement(By.id("txtPword")).sendKeys(password);
	driver.findElement(By.id("login")).click();

	//Validation
	
	if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed()) 
	{
	res="pass";	
	}else
	{
		res="Fail";
	}
	return res;
	}
	// appLogout
	
	public String appLogout()
	{
     driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[3]/a/img")).click();
     
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
	
	//BranchCreation
	
	public String appBranchCreation(String bName,String Add1) throws Exception
	{		
	
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("BtnNewBR")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("txtbName")).sendKeys(bName);
	driver.findElement(By.id("txtAdd1")).sendKeys(Add1);
	driver.findElement(By.id("txtZip")).sendKeys("78664");
	
	Select Country=new Select(driver.findElement(By.id("lst_counrtyU")));
    Country.selectByIndex(1);
    Thread.sleep(2000);
	Select State=new Select(driver.findElement(By.id("lst_stateI")));
	State.selectByIndex(1);
	Thread.sleep(2000);
	Select City=new Select(driver.findElement(By.id("lst_cityI")));
	City.selectByIndex(3);
	Thread.sleep(2000);
	driver.findElement(By.id("btn_insert")).click();
				
	//handling Alert
				
	Alert al=driver.switchTo().alert();
	String msg=al.getText();
				
	//System.out.println(al.getText(""));
				
	// click on oK Button
				
	 al.accept();
				
		//validation
				
	if (msg.contains("created sucessfully")) 
	{
		res="Pass";
				
	}else if(msg.contains("already Exist"))
	{
	 res="Fail";			
    }else if(msg.contains("Please Fill"))
	{
    	res="warning";
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	return res;			
	}
	
	//=========================================================
	// AppClose
	
	public void appClose()
	{
		driver.close();
	}
	
    public static void main(String[] args) throws Exception 
	
	{
		PrimusBank2 app=new PrimusBank2();
		app.appLaunch("http://primusbank.qedgetech.com/");

		app.appLogin("Admin","Admin");
		Thread.sleep(2000);
		
		app.appBranchCreation("Jiffysak", "Teachni Center Dr");
		
		Thread.sleep(2000);
		app.appLogout();
		
		Thread.sleep(2000);
	    app.appClose();
	}

}

