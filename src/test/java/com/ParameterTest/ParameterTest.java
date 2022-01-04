package com.ParameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"env","browser","url","emailId"})
	public void yahooLoginTest(String env,String browser, String url, String emailId)
	{
		
		if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Aaradhya//"
				+ "eclipse-workspace//FreeCRMTest//Drivers//chromedriver.exe");
		
		 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://Users//Aaradhya//"
					+ "eclipse-workspace//FreeCRMTest//Drivers//geckodriver.exe");
			
			driver=new FirefoxDriver();
			
		}
		 driver.get(url);
		 
		 driver.findElement(By.xpath("//input[@name='username']")).clear();
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(emailId); //enter username
		 
		 driver.findElement(By.xpath("//input[@id='login-signin']")).click(); // click on next button 
	}

}
