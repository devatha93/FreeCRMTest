package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
		
	  
	WebDriver driver;

	 @BeforeMethod 
	 public void setUp()
	 {
		 System.setProperty("webdriver.chrome.driver","C://Users//Aaradhya"
		 		+ "//eclipse-workspace//FreeCRMTest//Drivers//chromedriver.exe");
		 
		    driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		    driver.get("http://www.google.com");
		    
		        
	 }
	 
	 //2
	 
 @Test()
 
 public void googleTest()
 {
	    String title = driver.getTitle();
	    
	  Assert.assertEquals(title, "Google","title is not matched");
 }
 
 @Test()
 
 public void googleLogoTest()
 {
   boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
   Assert.assertTrue(b); 
   
   Assert.assertEquals(b, true);
   
	    
 }
 
 
 
 @AfterMethod
 
 public void tearDown()
 {
	 driver.quit();
 }
}
