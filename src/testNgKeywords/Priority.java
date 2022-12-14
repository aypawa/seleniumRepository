package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test
	public void C()
	{
		Reporter.log("A test case is running",true);
	}
	@Test
	public void B()
	{
		Reporter.log("B test case is running",true);
	}
	@Test
	public void A()
	{
		Reporter.log("A test case is running ",true);
	}
	@Test
	public void D()
	{
		Reporter.log("D test case is running",true);
	}
	
	
	
	
}
