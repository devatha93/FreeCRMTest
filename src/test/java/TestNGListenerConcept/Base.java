package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class Base {
	
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Aaradhya//eclipse-workspace"
				+ "//FreeCRMTest//Drivers//chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
	
		 
		 driver.get("http://www.google.com");
	}
	
	
	public void failed(String testMethodName)
	{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
         FileUtils.copyFile(srcfile, new File("C://Users//Aaradhya//eclipse-workspace"
         + "//FreeCRMTest//Screenshots//"+"failshot_"+testMethodName+"_"+".jpg"));
         	
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	

	}	



}

