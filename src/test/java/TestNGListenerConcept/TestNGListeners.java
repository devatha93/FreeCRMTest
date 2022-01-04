package TestNGListenerConcept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners extends Base implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		
		System.out.println("My test case Started .. Name of test case : " + result.getName());
	
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("My test case Passed .. Name of test case : " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("My test case Failed .. Name of test case ");
		
		failed(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("My test case Skipped .. Name of test case : " + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("My test case Skipped .. Name of test case : " + context.getName());
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("My test case Closed .. Name of test case : " + context.getName());
       	
	
      	}
}
