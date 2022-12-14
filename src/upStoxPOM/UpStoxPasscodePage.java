package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage {

	@FindBy(xpath="//input[@name='yob']")private WebElement Passcode;
	
	public UpStoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterPasscode()
	{
		Passcode.sendKeys("1994");
	}
}
