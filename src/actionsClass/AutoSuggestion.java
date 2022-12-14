package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		 WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		 
		 Actions act=new Actions(driver);
		 act.sendKeys(search,"ind");
		 Thread.sleep(3000);
		 
		 act.sendKeys(search,Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER).build().perform();
	}

}
