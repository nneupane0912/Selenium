package com.narayan.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Homework.Java.PrimusBank2;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception
	{
     PrimusBank2 app=new PrimusBank2();
     
     app.appLaunch("http://primusbank.qedgetech.com/");
     
     app.appLogin("Admin", "Admin");
     
     
       File srcFile=new File("C:\\Users\\neupa\\OneDrive\\Desktop\\Test.xlsx");

		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		 // reading Multiple set of data
		  // row count
		 
		Thread.sleep(2000);
		int rcnt=ws.getLastRowNum();
		for (int i = 1; i <=rcnt; i++) 
		{
		    String bName=ws.getRow(i).getCell(0).getStringCellValue();
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(bName+"      "+add1);
			
			String results=app.appBranchCreation(bName,add1);
			
			Thread.sleep(2000);
			ws.getRow(i).createCell(2).setCellValue(results);
			FileOutputStream fos=new FileOutputStream(srcFile);
			
			wb.write(fos);
			
		}

        wb.close();
        app.appLogout();
        app.appClose();
	}

}
