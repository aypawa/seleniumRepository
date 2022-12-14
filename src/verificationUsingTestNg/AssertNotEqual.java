package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void assertNotEqualsUse ()
  {
	  String a="abc";
	  String b="def";
	  
	  Assert.assertNotEquals(a,b,"a and b are same hence tc is failed");
	  Reporter.log("a and b are not same hence tc is passed",true);
	  
  }
}
