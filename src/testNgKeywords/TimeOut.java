package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {

	@Test
	public void A()
	{
		Reporter.log("A test case is running",true);
	}
	@Test(timeOut=2010)
	public void B() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("B test case is running",true);
	}
	@Test
	public void C()
	{
		Reporter.log("C test case is running",true);
	}
	@Test
	public void D()
	{
		Reporter.log("D test case is running",true);
	}
}
