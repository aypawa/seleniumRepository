package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(dependsOnMethods=("B"))
	public void A()
	{
		Reporter.log("A test case is running",true);
	}
	@Test
	public void B()
	{
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
