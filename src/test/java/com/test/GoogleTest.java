package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	 
  @Test(priority=1,groups="title")
  
  public void googleTest()
  {
	    String title = driver.getTitle();
	    
	    System.out.println(title);
  }
  
   //5
   @Test(priority=2, groups="Logo")
   public void googleLogoTest()
   {
	   boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	   
	   System.out.println(b);
   }
   //8
   @Test(priority=3,groups="Link Test")
   public void mailLinkTest()
   {
	  boolean b1 = driver.findElement(By.linkText("Mail")).isDisplayed();
	  
	  System.out.println(b1);
   }
   
   
	    
	 //3 //6 //9
	 @AfterMethod
	 
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
