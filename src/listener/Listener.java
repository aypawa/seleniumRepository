package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC is completed successfully",true);
	}
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is failed");
	}
	public void onTestSkipped() 
	{
		Reporter.log("TC is skipped please check",true);
	}

	

}
