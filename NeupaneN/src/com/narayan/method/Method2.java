package com.narayan.method;

public class Method2 
{
	
	// 1. method with return type with-out parameters 
		// create a method for addition of two numbers
		
	     public int add()
	     
	     {
	
		  int a=20;
		  int b=40;
		  
		  int sum=a+b;
		  
		  return sum;
		  
		}
	

	public static void main(String[] args) 
	{
		 Method2 ns2=new Method2();
		 
		 int res=ns2.add();
		 
		 System.out.println(res);
		 
	}

}
