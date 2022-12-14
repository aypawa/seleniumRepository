package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class neoStoxHomePage {

	@FindBy(xpath="//span[@id='lbl_username']")private WebElement UserId;
	
	@FindBy(xpath="(//*[text()='OK'])[2]")private WebElement okButton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	
	@FindBy(xpath="//*[@id='lbl_curbalancetop']")private WebElement Balance;
	
	@FindBy(xpath="//span[text()='Logout']")private WebElement logOutButton;
	
	public neoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void popUpHandle(WebDriver driver) throws InterruptedException
	{
		if(okButton.isDisplayed())
		{
//			Utility.wait(driver, 2000);
			Thread.sleep(2000);
			okButton.click();
			Utility.scrollIntoView(driver, closeButton);
//			Utility.wait(driver,2000);
			Thread.sleep(2000);
			closeButton.click();
		}
		else
		{
			Utility.wait(driver, 2000);
			Reporter.log("threre is no popup ",true);
		}
		
	}
	public String getActualUserId()
	{
		String ActualUserId = UserId.getText();
		Reporter.log("getting actual userId "+ActualUserId,true);
		return ActualUserId;
	}
	public String getBalance(WebDriver driver)
	{
		Utility.wait(driver,1000);
		String actualBalance = Balance.getText();
		Reporter.log("getting actual balance "+actualBalance,true);
		return actualBalance;
	}
	public void logOutFromNeoStoxApplication(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		UserId.click();
		Utility.wait(driver, 1000);
		Reporter.log("gettin logOut from Application",true);
		logOutButton.click();
	}
	
}
