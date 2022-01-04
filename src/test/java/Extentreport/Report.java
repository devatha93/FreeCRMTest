package Extentreport;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Report {
	
	
	WebDriver driver;
	
	static ExtentReports report;
	
	static ExtentTest test;
	
	
	@BeforeTest
	public void browserlaunch()
	{    
		
	    System.setProperty("webdriver.chrome.driver", "C://Users//Aaradhya//eclipse-workspace//FreeCRMTest//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		report = new ExtentReports("C://Users//Aaradhya//eclipse-workspace//FreeCRMTest//src//test//java//Report//Report.html",true);
		 test = report.startTest("Extent report Demo");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
	}
	
      @AfterTest
      public void teardown()
      {
    	  driver.close();
    	  report.endTest(test);
    	  report.flush();
      }
      
      @Test(priority = 1)
      public void Validatetitle()
      {
    	           test.log(LogStatus.INFO, "Test Cases Validatetitle is Started");
    	 String title = driver.getTitle();
    	 
    	 System.out.println(title);
    	          test.log(LogStatus.PASS, title);
      }
      
      @Test(priority = 2)
      public void GmailNavigate() throws IOException
      {
    	           test.log(LogStatus.INFO, "Test Cases GmailNavigate is Started");
    	  driver.findElement(By.linkText("Gmail")).click();
    	  
    	         test.log(LogStatus.WARNING, "User is Navigating to sign in");
    	  
    	  driver.findElement(By.linkText("Sign in")).click();
    	  String title = driver.getTitle();
     	 
     	 System.out.println(title);
     	        test.log(LogStatus.PASS,test.addScreenCapture(CaptureScreen(driver))+ title);
     	 
     	  
      }
      
      @Test(priority = 4)
      public void skiptest()
      {
    	  test.log(LogStatus.SKIP," Skip test");
      }
      
      
        @Test(priority = 3)
      public void Logintest() throws IOException
      {
      try {
    	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz");
    	   test.log(LogStatus.PASS, "User Entered password Successfully");
      }catch(Exception e)
        {
    	  test.log(LogStatus.FAIL,test.addScreenCapture(CaptureScreen(driver))+ "Login test Failed");
        }
      }
      public static String CaptureScreen(WebDriver driver) throws IOException
      {
    	  
    	  File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  
    	  File Destinationfile = new File("src/../images"+System.currentTimeMillis()+".png");
    	  
    	  String absolutepath_screen = Destinationfile.getAbsolutePath();
    	  
    	  FileUtils.copyFile(scrfile, Destinationfile);
    	  
    	  return absolutepath_screen;
    	  
      }
}
