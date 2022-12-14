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

public class ValidateBalance extends Base {
	
	neoStoxLoginPage login;
	neoStoxPasswordPage pwd;
	neoStoxHomePage home;
	@BeforeClass
	  public void launchBrowser()
      {
		launchNeoStox();
		login=new neoStoxLoginPage(driver);
		pwd=new neoStoxPasswordPage(driver);
		home=new neoStoxHomePage(driver);
	  }
	@BeforeMethod
	  public void loginToNeoStox() throws InterruptedException, EncryptedDocumentException, IOException
	 {
		login.sendMobileNumber(driver,Utility.readExcelData(2, 0));
		login.ClickOnSignUpButton(driver);
		pwd.sendPassword(driver,Utility.readExcelData(2, 1));
		pwd.ClickOnSubmitButton();
		Thread.sleep(2000);
		home.popUpHandle(driver);
	  }
  @Test
  public void VerifyBalance() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getBalance(driver),Utility.readExcelData(2, 3),"TC failed actual and expected balance are not matching");
  }
  

  @AfterMethod
  public void logOut() 
  {
	  home.logOutFromNeoStoxApplication(driver);
  }

   

  @AfterClass
  public void closingApplication() throws InterruptedException 
  {
	  ClosingBrowser(driver);
  }

}
