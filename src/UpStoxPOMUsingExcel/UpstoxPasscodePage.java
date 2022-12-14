package UpStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage {

	@FindBy(xpath="//input[@name='yob']")private WebElement Passcode;
	
	public UpstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void EnterPasscode(String pin)
	{
		Passcode.sendKeys(pin);
	}
	
	
	
}
