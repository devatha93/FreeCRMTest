package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest()
	{
	System.out.println("login Test");
	
	//int i = 9/0;
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void HomePageTest()
	{
		System.out.println("HomePage Test");
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void SearchPageTest()
	{
		System.out.println("Search Page Test ");
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void RegPageTest()
	{
		System.out.println("RegPageTest");
	}

}
