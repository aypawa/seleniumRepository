package neoStoxPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class neoStoxPasswordPage {
 
	JavascriptExecutor js;
	Actions act;
	
	@FindBy(xpath="//*[@id='txt_accesspin']") private WebElement Password;
	
	@FindBy(xpath="//*[@id='lnk_submitaccesspin']") private WebElement submitButton;
	
	
	
	 public neoStoxPasswordPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
		 js=(JavascriptExecutor)driver;
		 act= new Actions(driver);
		 
	 }
	 public void sendPassword(WebDriver driver,String password)
	 {
		 Password.sendKeys(password);
		 Reporter.log("sending password",true);
	 }
	 public void ClickOnSubmitButton() throws InterruptedException
	 {
		 //Utility.wait(driver,10000);
		//submitButton.click();
		//js.executeScript("arguments[0].click();",submitButton);
		//Thread.sleep(2000);
//		 act.doubleClick(submitButton).perform();
//		 driver.navigate().refresh();
//		 Password.sendKeys(password);
//		 act.doubleClick(submitButton);
//		 Thread.sleep(3000);
//		 js.executeScript("arguments[0].click();",submitButton);
		 
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].click();",submitButton);
		 
		 
	 }
}
