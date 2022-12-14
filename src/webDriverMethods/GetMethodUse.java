package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class GetMethodUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
	    driver.get("https://paytm.com/");
		//driver.close();
		//driver.quit();
		
	driver.manage().window().maximize();
	Thread.sleep(2000);
   // driver.close();
	
	//driver.manage().window().minimize();
		
		
	driver.get("https://www.jio.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	}

}
