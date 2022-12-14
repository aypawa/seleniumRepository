package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse {
  @Test
  public void assertfalseUse()
  {
	  boolean a=false;
	  Assert.assertFalse(a,"a is true hence tc is failed");
  }
}
