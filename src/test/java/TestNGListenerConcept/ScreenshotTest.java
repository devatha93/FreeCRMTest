package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class ScreenshotTest extends Base {
	
	
	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		
		initialization();
		
	}
	
  @AfterMethod
  
  public void tearDown() throws InterruptedException
{ 
	  
	  
	driver.quit();
	
}

    @Test
   public void loginTest()
   {
     Assert.assertEquals(false,true);
   }
    @Test
    public void searchTest()
    {
      Assert.assertEquals(false,true);
      
    }
     
    @Test
    public void createContactsTest()
    {
      Assert.assertEquals(false,true);
    }
    
    @Test
    public void HomePageTest()
    {
      Assert.assertEquals(false,true);
    }
}
