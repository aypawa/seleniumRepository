package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement searchBuses = driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']"));
		WebElement from = driver.findElement(By.xpath("//input[@id='txtSource']"));
		WebElement to = driver.findElement(By.xpath("//input[@id='txtDestination']"));
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,800)");
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoview();",searchBuses);
		
		//Alternate to click method
//		JavascriptExecutor  js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()",searchBuses);
		
		//Alternate of sendKeys method
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='kinwat';",from);
		js.executeScript("arguments[0].value='Nanded';",to);
		
		
	}

}
