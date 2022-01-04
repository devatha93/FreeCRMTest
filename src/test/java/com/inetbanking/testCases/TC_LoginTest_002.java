package com.inetbanking.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_LoginTest_002 {
	 
      static WebDriver driver;
	public static void main(String[] args) throws IOException {
		//  WebDriver driver;
	
	// how to read  properies file :
	// properies class available in java :
	
	Properties prop = new Properties();
	// import from java.util packege :
	
	FileInputStream ip=new FileInputStream("C:/Users/Aaradhya/eclipse-workspace"
			+ "/FreeCRMTest/config.properies");
	
	// fileInputStream Class object create then import it 
	//then copy the config.properties path
	 //01  goto config.properties>> then right click >> goto properies click it >>
	// then copy the path of config.properies >> then past it >> in fileinputstream class .
	// connection Establish B/w in  FileInputStream . And Loaded all the properties 
	  prop.load(ip);
    
	//prop.load method load the all the properies which are present  in the  properies file .
	  // now Just access  which are present in the config.properties file 
	  
	//  System.out.println(prop.getProperty("browser")); // "browser " if we give will get null o/p
	  
	  // now use the prop.getproperty method  it'll get the which variable we gave that value will be prient it .
	  // prop.getproperty it will give " key and value form  .
	  
	       String browserName = prop.getProperty("browser");
	        
	        System.out.println(browserName);
	        
	       if(browserName.equals("chroMe "))
	        {
	        	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    		
	   		 driver=new ChromeDriver();
	        	//System.out.println("if block pass");
	        }
	        
	       else
	       {
	    	   System.out.println(" No Browser value is given ");
	       }
	       
	            driver.get(prop.getProperty("urL"));
	            
	            driver.findElement(By.name("uid")).sendKeys(prop.getProperty("userName"));
	            
	            driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	            
	            driver.findElement(By.name("btnLogin")).click();
	        
	}
	
}