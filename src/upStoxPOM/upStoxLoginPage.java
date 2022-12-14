package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upStoxLoginPage {

	@FindBy(name="userId")private WebElement UserID;
	
	@FindBy(name="password")private WebElement Password;
	
	@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signInButton;
	
	
	public upStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId()
	{
		UserID.sendKeys("6WB4LB");
	}
	public void EnterPassword()
	{
		Password.sendKeys("Rr1x=%I$p4");
	}
	public void ClickOnSignButton()
	{
		signInButton.click();
	}
}
