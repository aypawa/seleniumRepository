package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//		
//		Actions act=new Actions(driver);
//		
//		act.clickAndHold(source).moveToElement(destination).release().build().perform();
//		Thread.sleep(5000);
//		
//		act.dragAndDrop(source, destination).perform();
//		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
	  Actions act=new Actions(driver);
	  
	  act.dragAndDrop(source, destination).build().perform();
	  Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
	}

}
