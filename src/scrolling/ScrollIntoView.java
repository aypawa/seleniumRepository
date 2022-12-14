package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		 WebElement textBox = driver.findElement(By.id("displayed-text"));
//		 
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 
//		 js.executeScript("arguments[0].scrollIntoView(true)",textBox);
//		 textBox.sendKeys("Good Morning");
//		 Thread.sleep(2000);
//		 
		 
		WebElement textBox = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",textBox);
		 Thread.sleep(2000);
		 textBox.sendKeys("Ajinkya Pawar");
	}

}
