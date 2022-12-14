package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.switchTo().frame("frame1");
//		WebElement myElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
//		
//		System.out.println(myElement.getText());
//		
//		driver.switchTo().defaultContent();
//		
//		WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Frames']"));
//		
//		System.out.println(mainPageElement.getText());

		
		driver.switchTo().frame("frame1");
		WebElement myElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		System.out.println(myElement.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement mainPageElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		Thread.sleep(1000);
		
		System.out.println(mainPageElement.getText());
		
	}

}
