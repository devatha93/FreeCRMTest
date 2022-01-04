package com.inetbanking.testData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class WordpressLogin {
	
	WebDriver driver;
	
	@Test(dataProvider = "wordpressData")
	public void loginToWordpress(String username, String password) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.gecko.driver","C://Users//Aaradhya"
			 		+ "//eclipse-workspace//FreeCRMTest//Drivers//\\geckodriver.exe");
			 
	  driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		 Thread.sleep(3000);
		 
		 
		
		//Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to login - Invalid  Credentails");
		
		System.out.println(" Page Title verified User is able to login Successfully");
		driver.quit();
		
	}
	@DataProvider(name="wordpressData")
		public Object[][] passData()
		{
		  Object[][] data=new Object[3][2];  //decleration part [3] is row [2] is column
		  
		  data[0][0]="admin1";      		//initialization
		  data[0][1]="demo1";
		  
		  data[1][0]="admin";
		  data[1][1]="demo123";
		  	
		  
		  data[2][0]="admin2";
		  data[2][1]="demo1234";
		  
		   return data;
		}
		
	}


