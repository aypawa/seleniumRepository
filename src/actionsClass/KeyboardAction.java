package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
//		
//		Actions act=new Actions(driver);
//		
//		act.click(day).perform();
//		Thread.sleep(2000);
//		
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Actions act =new Actions(driver);
		
	    act.sendKeys(firstName,"Ajinkya")
	    .sendKeys(Keys.TAB).sendKeys("pawar")
	    .sendKeys(Keys.TAB).sendKeys("8668392460")
	    .sendKeys(Keys.TAB).sendKeys("ajinkya")
	    .sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		act.click(day).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_UP).build().perform();
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		act.click(month).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB).build().perform();
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	}

}
