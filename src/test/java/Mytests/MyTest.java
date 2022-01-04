package Mytests;

import org.testng.Assert;

import org.testng.annotations.Test;

public class MyTest {
	
	
	
	@Test
	
	 public void Test1()  // its applicable only for test1  
	{
	  Assert.assertEquals(false, true);
	}
	
	
	@Test
	 public void Test2() //  retryAnalyzer not applicable for test2 method
		{
		  Assert.assertEquals(true, false);
		}
	
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(false, true);
	}

}
