package TestngData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
     System.setProperty("webdriver.chrome.driver", "C://Users//Aaradhya"
     		+ "//eclipse-workspace//FreeCRMTest//Drivers//chromedriver.exe");
     
       driver = new ChromeDriver();
     
		
	}

}
