package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupseg1 {

	@Test(groups="regression")
	public void TC1()
	{
		Reporter.log("TC1 regression is running",true);
		
	}
	@Test(groups="sanity")
	public void TC2()
	{
		Reporter.log("TC2 sanity is running",true);
	}
	@Test(groups="regression")
	public void TC3()
	{
		Reporter.log("TC3 regression is running",true);
	}
	@Test(groups="sanity")
	public void TC4()
	{
		Reporter.log("TC4 sanity is running",true);
	}
	@Test(enabled=false)
	public void TC5()
	{
		Reporter.log("TC5 is running",true);
	}
}
