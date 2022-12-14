package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void TC1()
  {
	  String a="Pune";
	  String b="Pune";
	  
//	  if(a.equals(b))
//	  {
//		  Reporter.log("a and b are same hence tc is passed",true);
//	  }
//	  else
//	  {
//		  Reporter.log("a and b are not same hence tc is failed",true);
//	  }
	  
	  Assert.assertEquals(a,b,"a and b are not same hence tc is failed");
  }
}
