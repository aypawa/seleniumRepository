package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class MyTesting1 {
	
  @Test(priority=1)
  public void a() 
  {
	  Reporter.log("A TC is running",true);
  }
 
  @Test(priority=2)
  public void b()
  {
	  Assert.fail();
	  Reporter.log("B TC is running",true);
	  
  }
  @Test(dependsOnMethods="b",priority=3)
  public void c()
  {
	  Reporter.log("C TC is running",true);
  }
}
