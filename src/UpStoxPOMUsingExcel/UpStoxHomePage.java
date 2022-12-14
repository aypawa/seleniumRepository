package UpStoxPOMUsingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.GeneralMethod;
import screenshot.Scrolling;

public class UpStoxHomePage {

	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement UserId;
	
	@FindBy(xpath="//a[@id='funds']")private WebElement funds;
	
	@FindBy(xpath="//div[@id='logout_title']")private WebElement LogOut;
	
	public UpStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateUserId(WebDriver driver,String exp) throws IOException, InterruptedException
	{
	Scrolling.scrollIntoView(driver, UserId);
	
	String ActualUserId = UserId.getText();
	String Expected=exp;
	
	GeneralMethod.takesScreenshot(driver,"ActualUserId"+ ActualUserId);
	
	if(ActualUserId.equalsIgnoreCase(Expected))
	{
		System.out.println("Actual id and expected id is matching hence tc is passed");
	}
	else
	{
		System.out.println("Actual id and expected id is not matching hence tc is failed");
	}
	

	}
	public void ClickOnFundButton()
	{
		funds.click();
	}
	public void ClickOnLogOutButton() throws InterruptedException
	{
		UserId.click();
		Thread.sleep(1000);
		LogOut.click();
	}
	public String getActualUserID(WebDriver driver) throws InterruptedException
	{
	String actualUserID = UserId.getText();
	GeneralMethod.scrollIntoView(driver, UserId);
	Thread.sleep(10000);
	return actualUserID;
	}
}
