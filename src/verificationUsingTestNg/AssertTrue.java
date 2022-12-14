package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void trueUse()
  {
	 boolean a=false;
	 Assert.assertTrue(a,"a is false hence tc is failed");
  }
}
