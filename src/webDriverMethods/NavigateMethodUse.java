package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.redbus.in/");
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//        driver.navigate().to("https://www.phonepe.com/");
//        
//        Thread.sleep(2000);
//        
//        driver.navigate().back();
//        
//        Thread.sleep(2000);
//        
//        driver.navigate().forward();
//        
//        Thread.sleep(2000);
//        
//        driver.navigate().refresh();
//        
//        driver.close();
//        
        
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.navigate().to("https://www.primevideo.com/hp/video/offers/nonprimehomepage/ref=dvm_pds_amz_in_as_s_g_146?_encoding=UTF8&dvah=nonprimehomepage");
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
	}

}
