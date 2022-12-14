package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxFundPage {

	
	@FindBy(xpath="((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[3]")
	private WebElement availableFunds;
	
	
	public UpStoxFundPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void CheckAvailableFunds()
	{
		
		String myFunds = availableFunds.getText();
		System.out.println("Funds available to trade is "+myFunds);
	}
	
}
