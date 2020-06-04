package com.narayan.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrithingTest2 {

	public static void main(String[] args) throws Exception 
	{
		File srcFile=new File("C:\\Users\\neupa\\OneDrive\\Desktop\\Narayan.xlsx");

		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("sheet1");
		ws.getRow(1).createCell(3).setCellValue("Narayan");
		ws.getRow(2).createCell(3).setCellValue("Neupane");
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		wb.close();
		
		

	}

}
