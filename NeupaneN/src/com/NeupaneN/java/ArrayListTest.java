package com.NeupaneN.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	private static int i;

	public static void main(String[] args)
	{
//insert the value into Arraylist	

/*ArrayList<String> l=new ArrayList<>();

l.add("Selenium");
l.add("narayan");
l.add("Training");
l.add("from Austin");
l.add("QA Training");
System.out.println(l.size());

//Retrieving the value from arrayList

for (int i = 0; i < l.size(); i++)
{
	System.out.println(l.get(i));

}
*/

		List<Object> l=new ArrayList<>();
//Insect values into arrayList
		
		l.add("10");
		l.add("20");
		l.add("Selenium");
		l.add("40");
		l.add("50.12");
		
		System.out.println(l.size());

		//Retrieving the value from arrayList

		for (int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));

		}

		
	}
}
