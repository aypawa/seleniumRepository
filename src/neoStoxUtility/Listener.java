package neoStoxUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.BaseNew;

public class Listener extends BaseNew  implements ITestListener 
{

	public void onTestSuccess(ITestResult result)
	{
		String methodName = result.getName();
		Reporter.log("TC "+methodName+"is completed successfully",true);
	}
	public void onTestFailure(ITestResult result)
	{
		
		try {
			Utility.takeScreenshot(driver,result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Reporter.log("TC "+result.getName()+"is failed",true);
	}
	public void OnTestSkipped(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+"is skipped please check",true);
	}
}
