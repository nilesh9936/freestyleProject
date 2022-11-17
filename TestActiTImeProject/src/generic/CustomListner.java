package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListner extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{

	}

	@Override
	public void onTestSkipped(ITestResult result)
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
	  String failedMethodname = result.getMethod().getMethodName();
	  Reporter.log(""+failedMethodname+"is the method which got failed",true);
	  failed(failedMethodname);
	  
	}

	@Override
	public void onStart(ITestContext context)
	{
		
	}

	@Override
	public void onFinish(ITestContext context)
	{

	}

}
