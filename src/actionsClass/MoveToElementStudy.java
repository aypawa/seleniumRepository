package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		 
		WebElement AboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		//AboutUs.click();
		Thread.sleep(5000);
		
	//	act.moveToElement(AboutUs).perform();
	//	act.click().perform();
		
	//	act.moveToElement(AboutUs).click().build().perform();
		
		//act.click(AboutUs).perform();
		
		WebElement RadioButton = driver.findElement(By.xpath("//input[@type='radio']"));
		
//		act.moveToElement(RadioButton).perform();
//		act.click().perform();
		
	//	act.moveToElement(RadioButton).click().build().perform();
		act.click(RadioButton).perform();
		
	}

}
