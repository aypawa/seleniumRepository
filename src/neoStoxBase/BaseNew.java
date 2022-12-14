package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;
import neoStoxUtility.UtilityNew;

public class BaseNew {

	public static WebDriver driver;
	
	public void launchBrowser() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(UtilityNew.getDataFromPropertyFile("Url"));
		 driver.manage().window().maximize();
		 Reporter.log("launching the browser",true);
		 Utility.wait(driver, 1000);
	}
	public static  void closeBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);
		Reporter.log("closing Browser",true);
		driver.close();
	}
}
