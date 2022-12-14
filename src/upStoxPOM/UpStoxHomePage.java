package upStoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.GeneralMethod;

import screenshot.Scrolling;

public class UpStoxHomePage {

	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")
	private WebElement userId;
	@FindBy(id="//a[@id='funds']")
	private WebElement FundsButton;
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement LogOutButton;
	
	public UpStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void validateUserId(WebDriver driver) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		Scrolling.scrollIntoView(driver,userId);
		String ActualUserId = userId.getText();
		String ExpectedUserId = "kshitij j.";
		
		GeneralMethod.takesScreenshot(driver, "actualUserID "+ActualUserId);
		
		if(ActualUserId.equalsIgnoreCase(ExpectedUserId))
		{
			System.out.println("Actual and Expected result is matching ,Tc is passed");
		}
		else
		{
			System.out.println("Actual and Expected result is not matching ,Tc is Failed");
		}	
	}
	   public void ClickOnFundsButton()
	   {
		   FundsButton.click();
	   }
	   public void ClickOnLogoutButton() throws InterruptedException
	   {
		   userId.click();
		   Thread.sleep(500);
		   LogOutButton.click();
		   
	   }
}
