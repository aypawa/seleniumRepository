package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting {
	WebDriver driver;
	@Parameters("browserName")
  @Test
  public void browserTest(String bName) throws InterruptedException 
  {
	  if(bName.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();	  
	  }
	  else if(bName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\geckodriver.exe");
		   driver=new FirefoxDriver();
	  }
	  driver.get("https://paytm.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
}
