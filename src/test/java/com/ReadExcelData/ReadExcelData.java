package com.ReadExcelData;

import com.lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {

		
		ExcelDataConfig excel=new ExcelDataConfig("C://Users//Aaradhya//eclipse-workspace"
				+ "//FreeCRMTest//src//test//java//ExcelData//TestData.xlsx");
		
		System.out.println(excel.getData(1, 0,1 ));
		
	}

}
