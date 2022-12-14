package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class Base {

	protected WebDriver driver;
	public void launchNeoStox()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Reporter.log("launching Browser",true);
		Utility.wait(driver, 3000);
	}
	public static void ClosingBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);
		Reporter.log("closing Browser",true);
		driver.close();
	}
	
}
