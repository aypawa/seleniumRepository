package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void MyTC() 
  {
	  String s="pawar";
	  Assert.assertNotNull(s,"s is null hence tc is failed");
  }
  @Test
  public void MyTC2()
  {
	  String s="Ajinkya";
	  Assert.assertNull(s,"s is not null hence tc is failed");
  }
}
