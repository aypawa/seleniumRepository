package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[text()='ZD9099']")private WebElement UserId;
	@FindBy(xpath="//span[text()='Funds']")private WebElement Funds;
	@FindBy(xpath="//a[@target='_self']")private WebElement LogOut;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	public void UserIdValidation()
	{
		String ActualUserId = UserId.getText();
		String ExpectedUserId = "ZD9099";
		
		if(ActualUserId.equals(ExpectedUserId))
		{
			System.out.println("UserId is matching & tc is passed");
		}
		else
		{
			System.out.println("UserId is not matching & tc is not passed");
		}
		
		
	}
	public void ClickOnFunds()
	{
		Funds.click();
	}
	public void LogOutButton() throws InterruptedException
	{
		UserId.click();
		Thread.sleep(1000);
		 LogOut.click();
		 
		
	}
	
	
}
