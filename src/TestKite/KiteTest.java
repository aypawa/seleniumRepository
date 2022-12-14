package TestKite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import KitePOM.KiteHomePage;
import KitePOM.KiteLoginPage;
import KitePOM.KitePinPage;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		KiteLoginPage Login=new KiteLoginPage(driver);
		Login.EnterUserId();
		Login.EnterPassword();
		Login.ClickOnLoginButton();
		Thread.sleep(5000);
		
		KitePinPage Login2=new KitePinPage(driver);
		Login2.EnterPin();
		
		Thread.sleep(5000);
		
		KiteHomePage Home=new KiteHomePage(driver);
		Home.UserIdValidation();
		Home.ClickOnFunds();
		Thread.sleep(3000);
		Home.LogOutButton();
		Thread.sleep(3000);
		driver.close();
		
	}

}
