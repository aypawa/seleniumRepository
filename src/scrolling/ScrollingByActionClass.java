package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByActionClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		 WebElement textBox = driver.findElement(By.id("displayed-text"));
		
		 Actions act=new Actions(driver);
		 
		 act.scrollToElement(textBox).click(textBox).sendKeys("Good morning").build().perform();
		 Thread.sleep(2000);
		 
		//Iframe Example 
		 
		 WebElement iframeEg = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		 act.scrollToElement(iframeEg).perform();
		 
		 driver.switchTo().frame("iframe-name");
		 
		 WebElement courses = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		 
		 act.scrollToElement(courses).perform();
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 
		 act.scrollToElement(textBox).perform();
	}

}
