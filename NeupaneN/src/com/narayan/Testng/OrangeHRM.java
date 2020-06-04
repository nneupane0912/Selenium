package com.narayan.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OrangeHRM 
{
	ChromeDriver driver;
	
	@BeforeSuite
	public void appLaunch()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
driver=new ChromeDriver();
driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard");
driver.manage().window().maximize();


}
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterTest
	public void appLogOut() throws Exception
	{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		
	}
	
	@AfterSuite
	public void appclose()
	{
	driver.close();
	}
}
