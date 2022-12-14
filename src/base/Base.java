package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utilityCurrent.UtilityCurrent;

public class Base {

	public static WebDriver driver;
	
	public void launchUpstox()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		UtilityCurrent.wait(driver, 1000);
//		driver.findElement(By.xpath("//*[@id='mobileNum']")).sendKeys("7755989895");
//		driver.findElement(By.xpath("//*[@id='getOtp']")).click();
		Reporter.log("launching the browser ",true);
	}
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);
		driver.close();
	}
	
			
	
	
	
}
