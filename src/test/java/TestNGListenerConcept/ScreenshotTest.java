package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class ScreenshotTest extends Base {
	
	
	@BeforeClass
	
	public void setUp() throws InterruptedException {
		
		initialization();
		
	}
	
  @AfterClass
  
  public void tearDown() throws InterruptedException
{ 
	  
	  
	driver.quit();
	
}

    @Test
   public void loginTest()
   {
     Assert.assertEquals(false,false);
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
