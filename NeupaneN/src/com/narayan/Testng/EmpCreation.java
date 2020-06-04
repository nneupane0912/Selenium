package com.narayan.Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpCreation extends OrangeHRM// 
{
@Test
public void EmpCreation() throws Exception
{
	driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("firstName")).sendKeys("Ramesh");
    driver.findElement(By.id("middleName")).sendKeys("Prasad");
    driver.findElement(By.id("lastName")).sendKeys("Neupane");
    driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\neupa\\OneDrive\\Desktop\\NN.jpg");
    driver.findElement(By.id("btnSave")).click();
 	
}
}
