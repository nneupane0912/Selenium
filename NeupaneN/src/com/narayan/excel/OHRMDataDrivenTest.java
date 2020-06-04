package com.narayan.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Homework.Java.OHRM;

public class OHRMDataDrivenTest 
{

	public static void main(String[] args) throws Exception 
	{
		
		OHRM app=new OHRM();
		app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.appLogin("Admin", "Qedge123!@#");
		
		Thread.sleep(2000);
		File srcFile=new File("C:\\Users\\neupa\\OneDrive\\Desktop\\Test3.xlsx");

		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		 // reading Multiple set of data
		  // row count
		   
		int rcnt=ws.getLastRowNum();
		
		   for (int i = 1; i <=rcnt; i++) 
		  {
		    String firstName=ws.getRow(1).getCell(0).getStringCellValue();
			
			String lastName=ws.getRow(1).getCell(1).getStringCellValue();
			
			
			System.out.println(firstName+"   "+lastName);
			Thread.sleep(2000);
			String results=app.employeeCreation(firstName, lastName);
			ws.getRow(i).createCell(2).setCellValue(results);
			FileOutputStream fos=new FileOutputStream(srcFile);
			
			wb.write(fos);
			
		}
		  wb.close();
	      app.appLogout();
	      app.appclose();
		
	}

}
