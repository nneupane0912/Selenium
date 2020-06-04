package com.PrimusBank.Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class PrimusBankBranchCeration 
     {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		 ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com/");		

		driver.manage().window().maximize();
   
	    driver.findElement(By.id("txtuId")).sendKeys("Admin");
	    driver.findElement(By.id("txtPword")).sendKeys("Admin");
	    driver.findElement(By.id("login")).click();
	    
	    //Branch Creation
	    driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	    driver.findElement(By.id("BtnNewBR")).click();
	    driver.findElement(By.id("txtbName")).sendKeys("Neupane512");
	    driver.findElement(By.id("txtAdd1")).sendKeys("605 Teachni Center dr");
	    driver.findElement(By.id("txtZip")).sendKeys("22222");
	    Thread.sleep(2000);
	    Select Country=new Select(driver.findElement(By.id("lst_counrtyU")));
	    Country.selectByIndex(1);
	    Thread.sleep(2000);
	    Select State=new Select(driver.findElement(By.id("lst_stateI")));
	    State.selectByIndex(1);
	    Thread.sleep(2000);
	    Select City=new Select(driver.findElement(By.id("lst_cityI")));
	    City.selectByIndex(1);
	    
	    //appLogout
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[3]/a/img")).click();
	    
	    // appClose
	    Thread.sleep(2000);
	    driver.close();
	    
	   
	}

}
