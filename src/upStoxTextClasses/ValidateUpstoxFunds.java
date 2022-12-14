package upStoxTextClasses;

import org.testng.annotations.Test;

import UpStoxPOMUsingExcel.UpStoxHomePage;
import UpStoxPOMUsingExcel.UpstoxFundPage;
import UpStoxPOMUsingExcel.UpstoxLoginPage;
import UpStoxPOMUsingExcel.UpstoxPasscodePage;
import UpStoxPOMUsingExcel.UpstoxWelcomePage;
import base.Base;
import utilityCurrent.UtilityCurrent;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ValidateUpstoxFunds extends Base {
	
	UpstoxLoginPage login;
	UpstoxPasscodePage passcode;
	UpstoxWelcomePage welcome;
	UpStoxHomePage home;
	UpstoxFundPage fund;
	
	@BeforeClass
	  public void launchBrowser() 
	  {
		launchUpstox();
		
		login=new UpstoxLoginPage(driver);
		passcode=new UpstoxPasscodePage(driver);
		welcome=new UpstoxWelcomePage(driver);
		home=new UpStoxHomePage(driver);
		fund=new UpstoxFundPage(driver);
		UtilityCurrent.wait(driver, 1000);
		
		
		
	  }
	 @BeforeMethod
	  public void beforeMethod() {
	  }

	
	
	
  @Test
  public void f() {
  }
 
  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() {
  }

}
