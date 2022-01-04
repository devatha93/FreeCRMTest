package com.ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception  {
	
		
		File src=new File("C://Users//Aaradhya//eclipse-workspace"
				+ "//FreeCRMTest//src//test//java//ExcelData//TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src); //this class used to read the data from excel sheet
		
		XSSFWorkbook wb=new XSSFWorkbook(fis); // This class is interracting the workbook
		
		XSSFSheet sheet1 = wb.getSheetAt(0);  // this class is used to interracting the sheets
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from Excel is " + data0);

		
	String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from Excel is " + data1);
		
		wb.close();

	}

}
