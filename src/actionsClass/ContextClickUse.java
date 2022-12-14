package actionsClass;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.Screenshot;

public class ContextClickUse {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement prompt = driver.findElement(By.xpath("//input[@name='prompt']"));
		
		Actions act=new Actions(driver);
		
//		act.contextClick(prompt).perform();
//		
//		WebElement subMenu = driver.findElement(By.xpath("//button[@id='sub-menu']"));
//		act.moveToElement(subMenu).perform();
//		Thread.sleep(2000);
//		
//		WebElement fileuploader = driver.findElement(By.xpath("//input[@name='upload']"));
//		fileuploader.sendKeys("C:\\Users\\ajink\\OneDrive\\Desktop\\Syllabus For Software Testing.docx");
//		
       WebElement doubleclickbutton = driver.findElement(By.xpath("//input[@id='double-click']"));
       act.doubleClick(doubleclickbutton).perform();
       
//       Alert alt = driver.switchTo().alert();
//       System.out.println(alt.getText());
//       alt.accept();
       driver.switchTo().alert().accept();
	}


}
