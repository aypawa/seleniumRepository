package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	@FindBy(xpath="//button[@type='submit']")private WebElement Pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ContinueButton;
	
	
	
	public  KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void EnterPin()
	{
		Pin.sendKeys("175863");
	}
	
	
}
