package com.narayan.method;

public class StaticMethodTest 
{

	//1. Static Method with return type and with parameter 
	// addition of two number 
		

		public static int add(int a, int b)
		{
			
			int sum=a+b;
			
			return sum;
			
	}

		public static void main(String[] args) 
		
		{
		
		//calling static method no need to create object reference 
		//calling Static method
			// syntax
			
			// classname.methodname
			// calling a  method with methold name 
			
			StaticMethodTest.add(20,30);// it won't return the value 
			
			// calling the method with variables
			
			int res=StaticMethodTest.add(30,50);
			
			System.out.println(res);
			
			
		}
		
	}
