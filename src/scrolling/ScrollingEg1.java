package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		  WebElement text = driver.findElement(By.id("displayed-text"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",text);//Scrolling
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='Ajinkya'",text);//sendKeys
		Thread.sleep(1000);
		
		WebElement hide = driver.findElement(By.xpath("//input[@value='Hide']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].click",hide);
	}

}
