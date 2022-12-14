package neoStoxTestClasses;

import org.testng.annotations.Test;

import neoStoxBase.BaseNew;
import neoStoxPOM.neoStoxHomePage;
import neoStoxPOM.neoStoxLoginPage;
import neoStoxPOM.neoStoxPasswordPage;
import neoStoxUtility.Utility;
import neoStoxUtility.UtilityNew;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
@Listeners(neoStoxUtility.Listener.class)
public class ValidateNeoStoxUserNameUsingPropertyFile extends BaseNew {
	
	neoStoxLoginPage login;
	neoStoxPasswordPage pwd;
	neoStoxHomePage home;
	
	 @BeforeClass
	  public void launchNeoStox() throws IOException 
	  {
		 launchBrowser();
		 login=new neoStoxLoginPage(driver);
		 pwd=new neoStoxPasswordPage(driver);
		 home=new neoStoxHomePage(driver);
		
	  }
	 @BeforeMethod
	  public void loginToNeoStox() throws IOException, InterruptedException
	  {
		 login.sendMobileNumber(driver, UtilityNew.getDataFromPropertyFile("MobileNo"));
		 login.ClickOnSignUpButton(driver);
		 pwd.sendPassword(driver, UtilityNew.getDataFromPropertyFile("password"));
		 pwd.ClickOnSubmitButton();
		// Utility.wait(driver, 2000);
		 Thread.sleep(2000);
		 home.popUpHandle(driver);
		 
	  }

  @Test(priority=1)
  public void ValidateNeoStoxUserName() throws IOException 
  {
	  Assert.assertEquals(home.getActualUserId(),UtilityNew.getDataFromPropertyFile("UserName"),"TC failed actual and expected are not matching");
	  //Utility.takeScreenshot(driver, home.getActualUserId());
	   Utility.wait(driver, 2000);
  }
  @Test(priority=2)
  public void ValidateNeoStoxUserBalance() throws IOException 
  {
	  Assert.assertEquals(home.getBalance(driver),UtilityNew.getDataFromPropertyFile("Balance"));
	 //Utility.takeScreenshot(driver, home.getBalance(driver));
  }
 

  @AfterMethod
  public void logOut() 
  {
	  home.logOutFromNeoStoxApplication(driver);
  }

  
  @AfterClass
  public void closingApplication() throws InterruptedException
  {
	  closeBrowser(driver);
  }
 
}
