package com.narayan.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest 
{
 @Test
 public void validation()
 {
	 
	String data = "Selenium";
	String data1 = "Selenium";
	
	//validation
	
	//Assert.assertEquals(data, data1);
	
	Assert.assertEquals(11, 13);
	
		
	}
}
