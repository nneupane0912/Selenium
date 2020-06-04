package com.Homework.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class KeepFluentLoginTest 
{

	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");

	ChromeDriver driver= new ChromeDriver();
	driver.get("https://app.keepfluent.com");
    driver.manage().window().maximize();
    
    //insert userID and Password
    
    driver.findElement(By.xpath("//*[@id='loginForm']/ion-item[1]/ion-input/input")).sendKeys("neupane_narayan1980@hotmail.com");
    driver.findElement(By.xpath("//*[@id='loginForm']/ion-item[2]/ion-input/input")).sendKeys("N@eupane0912");
    driver.findElement(By.xpath("//*[@id='loginForm']/div/ion-button[2]")).click();
    
    //Create Event
    
    /*driver.findElement(By.xpath("//*[@id='sideMenu']/events[2]/ion-header/ion-toolbar/ion-button[1]//button/span"));
    driver.findElement(By.xpath("//*[@id='item38']/input")).sendKeys("Narayan Happy BirthDay");
    driver.findElement(By.xpath("//*[@id='item35']/ion-item[2]/ion-icon//div/svg/path")).sendKeys("05/15/2020");
    driver.findElement(By.xpath("//*[@id='item35']/ion-item[3]/ion-icon//div/svg/path")).sendKeys("05/15/2020");
    driver.findElement(By.xpath("//*[@id='item38']/textarea")).sendKeys("17009 Preston Braid Ln");
    driver.findElement(By.xpath("//*[@id='item86']/ion-textarea/textarea")).sendKeys("Narayan 40th Birthday Party Celebration");
    driver.findElement(By.xpath("//*[@id='item36']/ion-textarea/textarea")).sendKeys("All t3 Studends must be present for celebration of Narayan Birthday");
    driver.findElement(By.xpath("//*[@id='item38']/input")).sendKeys("Narayan Neupane");
    driver.findElement(By.xpath("//*[@id='item38']/input")).sendKeys("neupane_narayan1980@hotmail.com");
    driver.findElement(By.xpath("//*[@id='item38']/input")).sendKeys("5123758390");
    driver.findElement(By.xpath("//*[@id='item35']/div/div/ion-chip[1]/ion-label")).sendKeys("Bishnu");
    driver.findElement(By.xpath("//*[@id='item110']")).click();
    */
    
    
    driver.findElement(By.xpath("/html/body/app-root/dew-layout/ion-app/ion-split-pane/ion-menu/ion-content/default-navigation/app-navigation/ion-list/ion-item[5]")).click();
    
  // Validation 
    
    
    {
		
	}
    
    
    //Close window
    
    driver.close();
   
    
    
    
    
    
	}
	
	

}
