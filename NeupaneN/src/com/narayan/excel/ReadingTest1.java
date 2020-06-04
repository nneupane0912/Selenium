package com.narayan.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest1 {

	public static void main(String[] args) throws Exception
	{
		File srcfile=new File( "C:\\Users\\neupa\\OneDrive\\Desktop\\Test.xlsx");
	    
		FileInputStream fis=new FileInputStream(srcfile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet    ws=wb.getSheet("Sheet1");
        
		//reading single set of data
		
		/*String data=ws.getRow(0).getCell(0).getStringCellValue();
		
		String data1=ws.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data+"------"+data1);
		*/
		//reading multiple  set of data
		
		//row count
		
		int rctn=ws.getLastRowNum();
		for (int i = 0; i <= rctn; i++) 
		{
		String data=ws.getRow(0).getCell(i).getStringCellValue();
		String data1=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data+"----"+data1);
		}
}}
