package com.narayan.Testng;

import org.testng.annotations.Test;

public class SampleTest 
{
  @Test(priority=1)// classes/Test cases
  public void appLaunch()
  {
	  System.out.println("appLaunch");
  }
  
  
  
  
  @Test(priority=2)//classes/test cases
  public void appLogin()
  {
	  System.out.println("appLogin");
  }
  
  @Test(priority=3)//Class/Test cases
  
  public void appLogout()
  {
	  System.out.println("appLogout");
  }
  
  
  @Test(priority=4)//classes/test cases
  public void appClose()
  {
	  System.out.println("appClose");
  }
  
}
