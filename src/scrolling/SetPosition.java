package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
//		Point position = driver.manage().window().getPosition();
//		System.out.println("default position is "+position);
//		
//		Point p=new Point(190,10);
//		Thread.sleep(2000);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(2000);
//		
//		Point p1=new Point(300,250);
//		Thread.sleep(2000);
//		driver.manage().window().setPosition(p1);
		
		Point position = driver.manage().window().getPosition();
		System.out.println("default position is "+position);
		
		
		Point p=new Point(300,90);
		Thread.sleep(2000);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		Point p1=new Point(250,250);
		Thread.sleep(2000);
		driver.manage().window().setPosition(p1);
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}
