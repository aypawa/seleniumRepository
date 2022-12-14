package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class neoStoxLoginPage {

    @FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumberfield;
    
    @FindBy(xpath="//a[@id='lnk_signup1']") private WebElement signUpButton;
    
    public neoStoxLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void sendMobileNumber(WebDriver driver,String MobileNum)
    {
    	mobileNumberfield.sendKeys(MobileNum);
    	Reporter.log("sending mobile number",true);
    }
    public void ClickOnSignUpButton(WebDriver driver)
    {
    	signUpButton.click();
    	Reporter.log("clicking on sign up button",true);
    	Utility.wait(driver, 10000);
    }
}
