package Abhisheck_khota_data_driven_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data_from_MS_Excel {

	public static void main(String[] args) throws Exception {
		
//		Theese are Classes we use to perform the excel action
//		
//	  FileInputStream
//	  XSSFWorkbook
//	  XSSFSheet
//	  XSSFRow
//	  XSSFCell
//	  

		
		FileInputStream file = new FileInputStream("C://Users//Aaradhya//eclipse-workspace"
				+ "//FreeCRMTest//src//test//java//ExcelData//TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file); //  which file opening that file  reference name we should give
		
		 //each Excel sheet we call it as workbook 
      
		XSSFSheet s = wb.getSheet("Sheet2"); //getSheet class is used to get the sheet Name 
		
		//XSSFSheet s = wb.getSheetAt(1);  we can  use index also start from index (0)
		
		int rows = s.getLastRowNum(); // it will give the last row value
		
		System.out.println(rows); //it will print the value in index order
		
	    int column = s.getRow(0).getLastCellNum(); // it will print "0" row and last cell value print
		
	    System.out.println("0th row print last cell value " + column);
	    
	    
	     for(int i=0; i<=rows;i++)	// read to use each row 
	     {
	    	 XSSFRow currentrow = s.getRow(i);
	    	 
	    	 for(int j=0;j<column;j++) // read to use each cell on current row 
	    	 {
	    		 String value = currentrow.getCell(j).toString();
	    		 
	    		System.out.print(value  + "   ");
	    	 }
	    	 System.out.println();
	    	 
	     }
	
	}

}
