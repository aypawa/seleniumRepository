package UpStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage {

	@FindBy(xpath="//input[@name='userId']")
	private WebElement UserID;
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//div[text()='Sign into Upstox']")
	private WebElement SignButton;
	
	
	public UpstoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void SendUserID( String uid)
	{
		UserID.sendKeys(uid);
	}
	public void SendPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickOnSignButton()
	{
		SignButton.click();
	}
	
	
}
