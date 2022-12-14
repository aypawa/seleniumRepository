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

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUpstoxUserId extends Base {
	
	//public static WebDriver driver;
	UpstoxLoginPage login;
	UpstoxPasscodePage passcode;
	UpstoxWelcomePage welcome;
	UpStoxHomePage home;
	UpstoxFundPage fund;
	 String TCID="TC1234";
	
	
	 @BeforeClass
	  public void beforeClass() 
	 {
		 launchUpstox();
		 UtilityCurrent.wait(driver, 5000);
		 login=new UpstoxLoginPage(driver);
		 passcode=new UpstoxPasscodePage(driver);
		 welcome=new UpstoxWelcomePage(driver);
		 home=new UpStoxHomePage(driver);
		 fund=new UpstoxFundPage(driver);
		
		 
	  }
	 @BeforeMethod
	  public void beforeMethod() throws EncryptedDocumentException, IOException 
	 {
		 login.SendUserID(UtilityCurrent.readDataFromExcel(1, 0));
		 
		 login.SendPassword(UtilityCurrent.readDataFromExcel(1, 1));
		 login.ClickOnSignButton();
		 UtilityCurrent.wait(driver, 1000);
		 Reporter.log("clicking on sign button ",true);
		 
		 passcode.EnterPasscode(UtilityCurrent.readDataFromExcel(1, 2));
		 UtilityCurrent.wait(driver, 5000);
		 Reporter.log("entering the passcode",true);
		 
		 welcome.ClickOnNoIAmGoodButton();
		 UtilityCurrent.wait(driver, 8000);
		 Reporter.log("clicking on No Iam good button",true);
		 
	  }
  @Test
  public void ValidateUserId() throws EncryptedDocumentException, InterruptedException, IOException 
  {
	  Assert.assertEquals(home.getActualUserID(driver),UtilityCurrent.readDataFromExcel(1, 3),"TC failed actual and expected are not matching");
	  UtilityCurrent.wait(driver, 5000);
	  UtilityCurrent.takeScreenshot(driver,TCID);
	  Reporter.log("validating the user id ",true);
  }
 

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  UtilityCurrent.wait(driver, 500);
	  home.ClickOnLogOutButton();
	  Reporter.log("clicking on the logOut button");
  }

 

  @AfterClass
  public void afterClass() throws InterruptedException 
  {
//	  UtilityCurrent.wait(driver, 500);
//	  driver.close();
	  
	  closingBrowser(driver);
	  Reporter.log("closing the browser",true);

  }

}
