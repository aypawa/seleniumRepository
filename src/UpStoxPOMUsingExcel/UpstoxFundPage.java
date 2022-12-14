package UpStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxFundPage {

	@FindBy(xpath="((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")private WebElement AvailableFunds;
	
	
	public  UpstoxFundPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void CheckFunds()
	{
		String myFunds = AvailableFunds.getText();
		System.out.println("my Funds are "+myFunds);
	}
}
