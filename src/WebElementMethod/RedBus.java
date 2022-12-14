package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
		WebElement To = driver.findElement(By.xpath("//input[@id='dest']"));
		WebElement Date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		WebElement Month = driver.findElement(By.xpath("//td[text()='Sept 2022']"));
		WebElement Day = driver.findElement(By.xpath("//td[@class='current day']"));
		
		From.click();
		From.sendKeys("Pune");
		Thread.sleep(1000);
		
		To.click();
		To.sendKeys("Nanded");
		Thread.sleep(1000);
		
		Date.click();
		Month.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try
		{
			Day.click();
		}
		catch(Exception e)
		{
			Day.click();
		}
		
		
		
	}

}
