package actionsClass;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.Screenshot;

public class DoubleClickStudy {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//	WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//Actions act=new Actions(driver);
		
//		act.moveToElement(doubleClickButton).perform();
//		act.doubleClick().perform();
//		Thread.sleep(4000);
//		
		
//		act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
	//	act.doubleClick(doubleClickButton).perform();
	//	driver.switchTo().alert().accept();
		
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleClickButton).perform();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
	    Alert alt = driver.switchTo().alert();
	    System.out.println("alt text is "+alt.getText());
		alt.accept();
		
		Screenshot.captureScreenshot(driver);
		
		
		
		
		
	}

}
