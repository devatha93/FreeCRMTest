package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	/* [RemoteTestNG] detected TestNG version 7.3.0
 @BeforeSuite ----> SetUp System Property for chrome    1
 @BeforeTest ---->  Launch chrome  Browser              2
@BeforeClass ----> login to app     					3
@BeforeMethod ----> Enter URL 							4
@Test ----> Google logo Test 
@AfterMethod ----> Logout from app 
@BeforeMethod ----> Enter URL 
@Test ----> Google Title Test
@AfterMethod ----> Logout from app 
@BeforeMethod ----> Enter URL 
Search test
@AfterMethod ----> Logout from app 
@AfterClass ----->  Close Browser 
  @AfterTest -----> Delete All Cookies 
PASSED: googleLogoTest
PASSED: googlePage
PASSED: searchTest

	
	 */
	
	//Pre -conditions annotation ---starting with @Before
	
	@BeforeSuite
	
	public void setUp() //1 first excuted 
	{
		System.out.println(" @BeforeSuite ----> SetUp System Property for chrome ");
	}
	
	

	@BeforeTest //2
	
		public void launchBrowser()
		{
			System.out.println(" @BeforeTest ---->  Launch chrome  Browser  ");
		}
	
    @BeforeClass // how will u get known that annotation Ans "@"  we use so It is annotation .
	
	public void login()  //3
	{
		
		System.out.println("@BeforeClass ----> login to app ");
	}
	
    
    /*
     * @BeforeMethod 
     * @Test -1
     * @AfterMethod 
     * 
     * @BeforeMethod 
     * @Test -2
     * @AfterMethod
     * 
     * @BeforeMethod  
     * @Test - 3
     * @AfterMethod
     * 
     */
	@BeforeMethod  //4
	public void enterURL()
	{
		System.out.println("@BeforeMethod ----> Enter URL ");
	}
	
	
	// Test cases starting with @Test
	@Test   //5
	public void googlePage()
	{
		System.out.println("@Test ----> Google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search test");
	}
	
	@Test
	
	public void googleLogoTest()
	{
		System.out.println("@Test ----> Google logo Test ");
	}
	
	 // Post conditions---starting with @After
    @AfterMethod //6
    
    public void logout()
    {
    	System.out.println("@AfterMethod ----> Logout from app ");
    }
	 
    @AfterTest //8
    public void deleteAllCookies()
    {
    	System.out.println("  @AfterTest -----> Delete All Cookies ");
    }
    
    @AfterClass  //7
    
    public void closeBrowser()
    {
    	System.out.println("@AfterClass ----->  Close Browser ");
    	
    }
    
//     @AfterSuite   //9
//     public void generateTestReport()
//     {
//    	 System.out.println("GenerateTestReport");
//     }
//         
    
	}

