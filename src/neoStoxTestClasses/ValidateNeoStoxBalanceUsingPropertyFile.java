package neoStoxTestClasses;

import org.testng.annotations.Test;

import neoStoxBase.BaseNew;
import neoStoxPOM.neoStoxHomePage;
import neoStoxPOM.neoStoxLoginPage;
import neoStoxPOM.neoStoxPasswordPage;
import neoStoxUtility.Utility;
import neoStoxUtility.UtilityNew;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateNeoStoxBalanceUsingPropertyFile extends BaseNew{
	
	neoStoxLoginPage login;
	neoStoxPasswordPage pwd;
	neoStoxHomePage home;
	@BeforeClass
	  public void beforeClass() throws IOException
	  {
		launchBrowser();
		login=new neoStoxLoginPage(driver);
		pwd=new neoStoxPasswordPage(driver);
		home=new neoStoxHomePage(driver);
		
	  }
	 @BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException 
	  {
		 login.sendMobileNumber(driver, UtilityNew.getDataFromPropertyFile("MobileNo"));
		 login.ClickOnSignUpButton(driver);
		 pwd.sendPassword(driver,UtilityNew.getDataFromPropertyFile("password"));
		 pwd.ClickOnSubmitButton();
		 home.popUpHandle(driver);
		 Utility.wait(driver, 1000);
		 
	  }
  @Test
  public void ValidateNeoStoxUserBalance() throws IOException 
  {
	  Assert.assertEquals(home.getBalance(driver),UtilityNew.getDataFromPropertyFile("Balance"));
	  Utility.takeScreenshot(driver, home.getBalance(driver));
  }
 

  @AfterMethod
  public void afterMethod() 
  {
	  home.logOutFromNeoStoxApplication(driver);
  }

  

  @AfterClass
  public void closeBrowser() throws InterruptedException 
  {
	  closeBrowser(driver);
  }

}
