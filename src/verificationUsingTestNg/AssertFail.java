package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void MyTC() 
  {
	  Assert.fail();
  }
  @Test
  public void a()
  {
	  Reporter.log("a test case is running",true);
  }
}
