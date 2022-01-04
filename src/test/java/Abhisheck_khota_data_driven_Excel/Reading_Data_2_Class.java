package Abhisheck_khota_data_driven_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reading_Data_2_Class {
	
	

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Aaradhya"
				+ "//eclipse-workspace//FreeCRMTest//Drivers//chromedriver.exe");
			
	
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("http://demo.guru99.com/test/newtours/");
      
      FileInputStream  file = new FileInputStream("C://Users//Aaradhya//eclipse-workspace"
				+ "//FreeCRMTest//src//test//java//ExcelData//TestData.xlsx");
      
       XSSFWorkbook workbook = new XSSFWorkbook(file);
       
       XSSFSheet sheet = workbook.getSheet("Sheet3");
       
      int rowCount = sheet.getLastRowNum();
      
      System.out.println(rowCount);
      
      //toString() -----------------> 12345.0 .0  should not add
      
      
       for(int i=1;i<=rowCount;i++)
       {
    	 XSSFRow row= sheet.getRow(i); 
    	 
    	String First_Name= row.getCell(0).getStringCellValue();
    	String Last_Name= row.getCell(1).getStringCellValue();
    	int Phone_Num= (int) row.getCell(2).getNumericCellValue(); //typecasting
    	String Email_Id= row.getCell(3).getStringCellValue();
    	String Address= row.getCell(4).getStringCellValue();
    	String City= row.getCell(5).getStringCellValue();
    	String State= row.getCell(6).getStringCellValue();
    	int PinCode= (int) row.getCell(7).getNumericCellValue(); //double (12345.0) convert to int (use type casting)
    	String Country= row.getCell(8).getStringCellValue();
    	String User_Name= row.getCell(9).getStringCellValue();
    	String Pass_Word= row.getCell(9).getStringCellValue();
    	
    	
         //Registration Process
   
          driver.findElement(By.linkText("REGISTER")).click();
     
         //Entering Contact Information
    
        driver.findElement(By.name("firstName")).sendKeys(First_Name);
        driver.findElement(By.name("lastName")).sendKeys(Last_Name);
        driver.findElement(By.name("phone")).sendKeys(String.valueOf(Phone_Num)); //string.valueOf choose valueof int
        driver.findElement(By.name("userName")).sendKeys(Email_Id);
        
        
         // Entering Mailing information
      
        driver.findElement(By.name("address1")).sendKeys(Address);
    
        driver.findElement(By.name("city")).sendKeys(City);
    
        driver.findElement(By.name("state")).sendKeys(State);
     
        driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(PinCode));
        
        
        
        //Country selection
     
        Select dropcountry = new Select(driver.findElement(By.name("country")));
      
        dropcountry.selectByVisibleText(Country);
     
      // Entering User information
   
        driver.findElement(By.name("email")).sendKeys(User_Name);  //user
    
      driver.findElement(By.name("password")).sendKeys(Pass_Word); //name
     
      //Submitting form
       
      driver.findElement(By.name("submit")).click();
    
      if(driver.getPageSource().contains("Thank you for registering")){
      		
      	      System.out.println("Registration Completed for " + i + "record");
      	
      		}
       
      else
     {
      	 System.out.println("Registration Failed  for " + i + "record");
      	 
      }
      
      
   }
  
   System.out.println(" Data Driven Test Completed ");
   driver.close();
   driver.quit();
  
   file.close();
   workbook.close();

    	
       }
      
            
	}

