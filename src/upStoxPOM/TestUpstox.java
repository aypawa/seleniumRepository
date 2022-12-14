package upStoxPOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpstox {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			
			driver.get("https://login-v2.upstox.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			
			upStoxLoginPage login=new upStoxLoginPage(driver);
			login.EnterUserId();
			login.EnterPassword();
			login.ClickOnSignButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			UpStoxPasscodePage passcode=new UpStoxPasscodePage(driver);
			passcode.EnterPasscode();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			UpStoxWelcomePage WelcomePage=new UpStoxWelcomePage(driver);
			WelcomePage.clickOnnoIAmGoodButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			UpStoxHomePage home=new UpStoxHomePage(driver);
			home.ClickOnFundsButton();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			home.validateUserId(driver);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			UpStoxFundPage fund=new UpStoxFundPage(driver);
			fund.CheckAvailableFunds();
			
			home.ClickOnLogoutButton();
			driver.close();
			
	}

}
