package TestNGstudy;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class FailedTCExecution {

	 @Test(timeOut = 100)
	  public void TC6() throws InterruptedException
	  
	  {
		  Reporter.log("TC6 Running",true);
		  Thread.sleep(200);
	  }
	  
	  @Test
	  public void TC7()
	  
	  {
		  Reporter.log("TC7 Running",true);
	  }
	  
	  @Test
	  public void TC8()
	  
	  {
		 
		  Reporter.log("TC8 Running",true);
		SoftAssert assert1= new SoftAssert();
		assert1.fail();
		assert1.assertAll();
		
		System.out.println("TC8 method");
		  
	  }
	  
	  @Test
	  public void TC9()
	  
	  {
		  Reporter.log("TC9 Running",true);
	  }
	  
	  @Test
	  public void TC10()
	  
	  {
		 
		  Reporter.log("TC10 Running",true);
		  
	  }
}


