package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mainPageElement = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		
		System.out.println(mainPageElement.getText());
		Thread.sleep(5000);
		
		driver.switchTo().frame("courses-iframe");
		
		WebElement framePage = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
		
		System.out.println(framePage.getText());
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement AutoSuggestive = driver.findElement(By.xpath("//legend[text()='Auto Suggestive Dropdown Example']"));
		System.out.println(AutoSuggestive.getText());
		
	}

}
