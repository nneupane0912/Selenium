package com.narayan.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationTest 

{
	
	@Test
	public void Method2()
	{
		System.out.println("Method2 Executed");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Beforeclass Executed");
		
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("Afterclass Executed");
	}
	
	
@Test
public void Method1()
{
	System.out.println("Method1 Executed");
}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMedthod Executed");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod Execution");
	}
	@BeforeSuite
	public void aftermethod()
	{
      System.out.println("BeforeSuit Execution");
	}
	@AfterSuite
	public void afterSuit()
	{
	System.out.println("AfterSuit Execution");
	}
	
	
	
}
