package com.narayan.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		//string username
		//username: "neupaneprasad@hotmail.com"
		
		@SuppressWarnings("unused")
		String username ="neupaneprasad@hotmail.com";
		
		@SuppressWarnings("unused")
		String password="N@eupane0912";
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	
		
	}

}


