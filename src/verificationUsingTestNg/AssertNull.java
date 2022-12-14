package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void MyTC()
  {
	  String a="Ajikya";
	 
	  Assert.assertNull(a, "a is not null hence tc is failed");
	 
  }
}
