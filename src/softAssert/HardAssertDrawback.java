package softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawback {
  @Test
  public void testing ()
  {
	  String a="abc";
	  String b="abc";
	  String c="abc1";
	  
	  Assert.assertEquals(a,b,"a and b are not equal hence tc is failed");
	  Assert.assertEquals(a,c,"a and c are not equal hence tc is failed");
	  Assert.assertNull(b,"b is not null hence tc is failed");
  }
}
