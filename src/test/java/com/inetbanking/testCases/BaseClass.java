package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {
	
	//http://sur.ly/o/demo.guru99.com/AA000014?source=top&cid=desktop-302e323936373938303020313633343532313431352031313037303832363736
	
	//https://demo.guru99.com/v4/
	public String baseURL="http://demo.guru99.com/V1/index.php";
	public String username="mngr347425";
	public String password="pAgemeb";
	public static WebDriver driver;
	public static Logger logger ;
	
	@BeforeClass
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(15 ,TimeUnit.SECONDS);
	     
		  logger=Logger.getLogger("FreeCRMTest");
		 
		 PropertyConfigurator.configure("log4j.properties");
		 
		 
		 
	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}

}



