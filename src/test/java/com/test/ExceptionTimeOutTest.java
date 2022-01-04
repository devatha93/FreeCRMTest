package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

//	
//	@Test(invocationTimeOut=2,expectedExceptions = NumberFormatException.class)
//	public void test()
//	{
//		int i=1;
//		while(i==1)
//		{
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class) //interview quotion how to Handle expection
	  													  // without using try catch block ,
	public void test1()                                  // expectedExceptions=NumberFormatException.class
	{
		String x="100A";
		Integer.parseInt(x);
	}
}
