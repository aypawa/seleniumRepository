package UpStoxPOMUsingExcel;

import org.testng.annotations.Test;

import commonMethods.GeneralMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpstoxTestUsingTestNG {
	
	UpstoxLoginPage login;
	UpstoxPasscodePage passcode;
	UpstoxWelcomePage welcome;
	UpStoxHomePage home;
	UpstoxFundPage fund;
	Sheet mysheet;
	public static WebDriver driver;
	
	 @BeforeClass
	  public void launchBrowser() throws EncryptedDocumentException, IOException 
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://login-v2.upstox.com/");
		 Reporter.log("Launching the Browser",true);
		 
		 login=new UpstoxLoginPage(driver);
		 passcode=new UpstoxPasscodePage(driver);
		 welcome=new UpstoxWelcomePage(driver);
		 home=new UpStoxHomePage(driver);
		 fund=new UpstoxFundPage(driver);
		 
		 File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\ajinkya1.xlsx");
		    mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		 
		   GeneralMethod.waitTest(driver,1000);
	  }
	 @BeforeMethod
	  public void loginToUpstox() 
	 {
		 login.SendUserID(mysheet.getRow(1).getCell(0).getStringCellValue());
		 login.SendPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
		 login.ClickOnSignButton();
		 Reporter.log("sending userid and password",true);
		 GeneralMethod.waitTest(driver,7000);
		 
		 passcode.EnterPasscode(mysheet.getRow(1).getCell(2).getStringCellValue());
		 Reporter.log("Entering the passcode",true);
		 GeneralMethod.waitTest(driver,9000);
		 
		 welcome.ClickOnNoIAmGoodButton();
		 Reporter.log("clicking on I am good button",true);
		 GeneralMethod.waitTest(driver,5000);
		 
	  }
  @Test
  public void validateUserId() throws IOException, InterruptedException 
  {
	  String expectedUID=mysheet.getRow(1).getCell(3).getStringCellValue();
	  String actualUserID=home.getActualUserID(driver);
	  GeneralMethod.waitTest(driver,5000);
	  
	  GeneralMethod.takesScreenshot(driver, "sc1");
	  
	  Assert.assertEquals(expectedUID,actualUserID,"expected and actual userid are not equal hence tc is failed");
	  Reporter.log("validating username and taking screenshot",true);
	  
	  
  }
 

  @AfterMethod
  public void logOutFromApplication() throws InterruptedException 
  {
	  home.ClickOnLogOutButton();
	  Reporter.log("logging out from application",true);
  }
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
	  Reporter.log("closing the browser",true);
  }

}
