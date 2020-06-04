package com.narayan.Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest1 
{
	@Test
	public void Method4()
	{
		System.out.println("Method4 Executed");
	}
	
	
	
	@Test
	public void Method3()
	{
		System.out.println("Method3 Executed");
	}
	
	@BeforeTest()
	public void beforeTest()
	{
		System.out.println("BeforeTest Executed");
		
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Executed");
	}
	
	

}
