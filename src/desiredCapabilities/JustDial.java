package desiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
	
		//create an object of chromeOptions class
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//opt.addArguments("incognito");
		//opt.addArguments("start-maximized");
		//opt.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);

	}

}
