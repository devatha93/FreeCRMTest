package com.ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedExcel1 {

	public static void main(String[] args) throws Exception {
		
		
		File src=new File("C://Users//Aaradhya//eclipse-workspace"
				+ "//FreeCRMTest//src//test//java//ExcelData//TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowCount= sheet1.getLastRowNum();
		
		System.out.println("Total  rows is " + rowCount);
		
		for(int i=0;i<rowCount;i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from Row " + i + " is " + data0);
		}
		
		wb.close();
		
	}

}
