package TestNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {

	@Test
	public void A()
	{
		System.out.println("A method is running");
		Reporter.log("A method is running--:log");
		Reporter.log("A method is running--:log",true);
	}
	@Test
	public void B()
	{
		System.out.println("B method is running");
		Reporter.log("B method is running--log");
		Reporter.log("B method is running--log",true);
		
	}
}

