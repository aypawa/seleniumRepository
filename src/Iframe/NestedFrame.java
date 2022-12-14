package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println(mainPageElement.getText());
		
		driver.switchTo().frame("frame1");
		
		WebElement parentPage = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(parentPage.getText());
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		Thread.sleep(5000);
		
		WebElement childPage = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
		
		System.out.println(childPage.getText());
		driver.quit();
		
	}

}
