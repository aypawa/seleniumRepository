package neoStoxTestClasses;

import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOM.neoStoxHomePage;
import neoStoxPOM.neoStoxLoginPage;
import neoStoxPOM.neoStoxPasswordPage;
import neoStoxUtility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateNeoStoxUserName extends Base {
	
	neoStoxLoginPage login;
	neoStoxPasswordPage pwd;
	neoStoxHomePage home;
	
	
	@BeforeClass
	  public void beforeBrowser() 
	  {
		launchNeoStox();
		login=new neoStoxLoginPage(driver);
		pwd=new neoStoxPasswordPage(driver);
		home=new neoStoxHomePage(driver);
		
	  }
	@BeforeMethod
	  public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException 
	  {
		login.sendMobileNumber(driver,Utility.readExcelData(2, 0));
		login.ClickOnSignUpButton(driver);
		pwd.sendPassword(driver,Utility.readExcelData(2, 1));
		pwd.ClickOnSubmitButton();
		Thread.sleep(2000);
		home.popUpHandle(driver);
		
	  }
	
	
	
  @Test(priority=1)
  public void ValidateUserId() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  Assert.fail();
	  Assert.assertEquals(home.getActualUserId(),Utility.readExcelData(2, 2),"TC failed actual and expected are not matching");
	  Thread.sleep(3000);
	  Utility.takeScreenshot(driver,home.getActualUserId());
	  
  }
//  @Test(priority=1)
//  public void validateBalance() throws EncryptedDocumentException, IOException
//  {
//	  Assert.assertEquals(home.getBalance(driver),Utility.readExcelData(2, 3),"TC failed actual and expected balance are not matching");
// }
  

  @AfterMethod
  public void afterMethod() 
  {
	  home.logOutFromNeoStoxApplication(driver);
  }

  

  @AfterClass
  public void closeApplication() throws InterruptedException 
  {
	  ClosingBrowser(driver);
  }

}
