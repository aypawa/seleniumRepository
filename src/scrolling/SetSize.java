package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
//		Dimension defaultSize = driver.manage().window().getSize();
//	    System.out.println("default size is "+defaultSize);
//	    
//	   Dimension d=new Dimension(400,800);
//	   driver.manage().window().setSize(d);
//	   Thread.sleep(2000);
//	   
//	   Dimension d1=new Dimension(1500,720);
//	   driver.manage().window().setSize(d1);
//	   Thread.sleep(2000);
		
		Dimension defaultSize= driver.manage().window().getSize();
		System.out.println("default size is "+defaultSize);
		
		Dimension d=new Dimension(250,450);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Dimension d1=new Dimension(300,800);
		driver.manage().window().setSize(d1);
		Thread.sleep(2000);
		
	}

}
