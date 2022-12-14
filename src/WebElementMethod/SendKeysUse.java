package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hotstar.com/in");
//		Thread.sleep(2000);
//		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id='searchField']")).sendKeys("cricket");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='searchField']")).clear();
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='searchField']")).sendKeys("cricket match");
//	    
//	    driver.navigate().refresh();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//input[@id='searchField']")).sendKeys("anupma");
//	    driver.navigate().refresh();
	    Thread.sleep(5000);
	   WebElement search = driver.findElement(By.xpath("//input[@id='searchField']"));
		
		search.sendKeys("cid");
		//driver.navigate().refresh();
		Thread.sleep(5000);
		//search.clear();
		//driver.navigate().refresh();
		search.click();
		Thread.sleep(3000);
		search.clear();
		//search.sendKeys("Dangal");		
		
		driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
		
	}

}
