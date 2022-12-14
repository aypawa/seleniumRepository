package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");	
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.phonepe.com/");
	
     System.out.println(driver.getTitle());
     
     String myTitle=driver.getTitle();
     
     System.out.println("My title is "+myTitle);
     
     System.out.println(driver.getCurrentUrl());
     
     String myUrl=driver.getCurrentUrl();
     
     System.out.println("My url is "+myUrl);
     
  
//		driver.get("https://www.myntra.com/");
//		
//		System.out.println(driver.getTitle());
//		
//		String myTitle=driver.getTitle();
//		System.out.println("my title is -"+myTitle);
//		
//		System.out.println(driver.getCurrentUrl());
//		
//		String myUrl=driver.getCurrentUrl();
//		System.out.println("my url is "+myUrl);
//		
//		driver.navigate().refresh();
//		
	
	
	
	}

}
