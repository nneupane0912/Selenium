package com.neupane.Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginTest 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("neupaneprasad@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("N@eupane0912");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='mount_0_0']/div/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='jsc_c_bh']/div/div/span")).click();;
		
	}

}
