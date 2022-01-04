package Datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcelData_Application{

	public static WebDriver driver;
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C://Users//Aaradhya"
				+ "//eclipse-workspace//FreeCRMTest//Drivers//chromedriver.exe");
			
	
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		   
		   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		   
		   driver.get("http://demo.guru99.com/test/newtours/");
		   
		 //driver.get("http://demo.guru99.com/test/newtours/register.php");
		   
		   

		  
	}
}






//
//String First_name = currentrow.getCell(0).getStringCellValue();
//
//  String Last_name = currentrow.getCell(1).getStringCellValue();
//  String Phone_num = currentrow.getCell(2).getStringCellValue();
//  String Email_Id = currentrow.getCell(3).getStringCellValue();
//  String Address = currentrow.getCell(4).getStringCellValue();
//  String City = currentrow.getCell(5).getStringCellValue();
//  String State = currentrow.getCell(6).getStringCellValue();
//  String PinCode = currentrow.getCell(7).getStringCellValue();
//  String Country = currentrow.getCell(8).getStringCellValue();
//  String User_name = currentrow.getCell(9).getStringCellValue();
//  String Password = currentrow.getCell(10).getStringCellValue();
//  
//
//	
////  //Registration Process
////  
////  driver.findElement(By.linkText("REGISTER")).click();
//   
//   //Entering Contact Information
//   
//   driver.findElement(By.name("firstName")).sendKeys(First_name);
//   driver.findElement(By.name("lastName")).sendKeys(Last_name);
//   driver.findElement(By.name("phone")).sendKeys(Phone_num);
//   driver.findElement(By.name("userName")).sendKeys(Email_Id);
//   
//   // Entering Mailing information
//   
//   driver.findElement(By.name("address1")).sendKeys(Address);
//   
//   driver.findElement(By.name("city")).sendKeys(City);
//   
//   driver.findElement(By.name("state")).sendKeys(State);
//   
//   driver.findElement(By.name("postalCode")).sendKeys(PinCode);
//   
// 
//    //Country selection
//   
//   Select dropcountry = new Select(driver.findElement(By.name("country")));
//   
//   dropcountry.selectByVisibleText(Country);
//   
//   // Entering User information
//   
//    driver.findElement(By.name("email")).sendKeys(User_name);  //user
//    
//    driver.findElement(By.name("password")).sendKeys(Password); //name
//    
//    //Submitting form
//    
//    driver.findElement(By.name("submit")).click();
//    
//    if(driver.getPageSource().contains("Thank you for registering")){
//    		
//    	      System.out.println("Registration Completed for " + i + "record");
//    	
//    		}
//     
//    else
//    {
//    	 System.out.println("Registration Failed  for " + i + "record");
//    	 
//    }
//    
//    
//}
//
//System.out.println(" Data Driven Test Completed ");
//driver.close();
////driver.quit();
//
//file.close();
//workbook.close();
