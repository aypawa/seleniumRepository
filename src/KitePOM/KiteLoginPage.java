package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	@FindBy(xpath="//input[@id='userid']") private WebElement UserID;
	
	@FindBy(xpath="//input[@id='password']")private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;

	
	public KiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId()
	{
		UserID.sendKeys("ZD9099");
	}
	public void EnterPassword()
	{
		Password.sendKeys("Ajinkya@65");
	}
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
}
