package TestNGstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {

  @Test
  public void myTest1()
  {
	  Reporter.log("myTest1 test method is running",true);
  }
  @Test
  public void myTest2()
  {
	  Reporter.log("myTest2 test method is running",true);
  }
  @BeforeMethod
  public void af()
  {
	  Reporter.log("Before method is running ",true);
  }
  @AfterMethod
  public void bf()
  {
	  Reporter.log("After method is running",true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("before class is running",true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("after class is running",true);
  }
}

