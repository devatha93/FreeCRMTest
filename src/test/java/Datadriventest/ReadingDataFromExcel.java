package Datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ReadingDataFromExcel {

	
	public static void main(String[] args) throws Exception {
		
	
		  
	
		
		
		
		 FileInputStream file=new FileInputStream("C://Users//Aaradhya//eclipse-workspace"
		 + "//FreeCRMTest//src//test//java//ExcelData//TestData.xlsx");
		
		//this class reffering excel file  first step
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		 // when we impot ( xssf usermodel ) it contains  several classes like 
		 // ex 1 xssfworkbook
		 //    2 xssfsheet
		 //    3 xssfrow
		 //    4 xssfcell
		 
		 XSSFSheet sheet = workbook.getSheet("Sheet3"); // providing  sheet name
		 
		// XSSFSheet sheet = workbook.getSheetAt(3) ; //providing sheet index
		 
		 //How to count number of rows and columns in the sheet level
		 
		int rowcount = sheet.getLastRowNum(); // return the row count ex(13) last row  count is 13 like that .
		
		System.out.println(" Number of Records in the Excel Sheet "+  rowcount);
		// rows are present under the sheet only
		
		int colcount = sheet.getRow(1).getLastCellNum();  // it will return column or cell  count 
		
		// it will goto 1st row "0" row then move to last cell number give 
		
		 for(int i=1; i<rowcount;i++)
		 {
			XSSFRow currentrow = sheet.getRow(i); //this will focussed on current row
			
			for(int j=0;j<colcount;j++)
			{
				String value = currentrow.getCell(j).toString();  //toString (toString is generic method which will read the all type of data )will read the value from a cell 
				
				System.out.print("  " + value);
			}
			System.out.println();
			
			
		 }	
			
		 
		
	}

}
