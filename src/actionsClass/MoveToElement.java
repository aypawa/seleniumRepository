package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		WebElement admintab = driver.findElement(By.xpath("//span[text()='Admin']"));
		act.moveToElement(admintab).perform();	
		admintab.click();
		Thread.sleep(3000);
		
		WebElement qualification = driver.findElement(By.xpath("//span[text()='Qualifications ']"));
  	   
		act.moveToElement(qualification).build().perform();

		
	}

	

}
