package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals {
	SoftAssert soft =new SoftAssert();
  @Test
  public void testing ()
  {
	  String a="abc";
	  String b="abc1";
	  String c="xyz";
	 
	soft.assertEquals(a,b,"a and b are not equal hence tc is failed" );
	soft.assertEquals(a,c,"a and c are not equal hence tc is failed");
	soft.assertAll();
  }
  @Test
  public void testing1()
  {
	  boolean a=false;
	  
	  soft.assertTrue(a,"a is not true hence tc is failed");
	  soft.assertNull(a,"a is not null hence tc is failed");
	  soft.assertAll();
  }
}
