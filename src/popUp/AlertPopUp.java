package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		
		Alert alt = driver.switchTo().alert();
		System.out.println("alt text is "+alt.getText());
		
//		alt.accept();
//		
//		String myText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
//		System.out.println(myText);
//		
//		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//		Thread.sleep(7000);
//		alt.accept();
//		
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		Thread.sleep(4000);
//		alt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		Thread.sleep(3000);
		
		
		
		
		
	
		
}
}
