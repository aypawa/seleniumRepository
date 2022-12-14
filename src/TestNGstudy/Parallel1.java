package TestNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel1 {

	@Test
	public void KiteLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		driver.manage().window().maximize();
		Reporter.log("KiteLaunched",true);
		Thread.sleep(2000);
		driver.close();
		
	}
}
