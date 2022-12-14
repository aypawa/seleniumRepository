package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listener.class)
public class MyTesting2 {
  @Test(priority=1)
  public void D() 
  {
	  Reporter.log("D TC is running",true);
  }
  @Test(dependsOnMethods="F",priority=3)
  public void E()
  {
	  Reporter.log("E TC is running",true);
  }
  @Test(priority=2)
  public void F()
  {
	  Assert.fail();
	  Reporter.log("F TC is running",true);
	
  }
}
