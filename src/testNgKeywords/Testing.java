package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing {

	@Test(invocationCount=5)
	public void A()
	{
		Reporter.log("A test case is running",true);
	}
	@Test
	public void B()
	{
		Reporter.log("B test case is running",true);
	}
	
}

