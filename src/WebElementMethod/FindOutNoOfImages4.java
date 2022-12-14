package WebElementMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindOutNoOfImages4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	//	driver.switchTo().frame("courses-iframe");
		
		//WebDriverWait wait= new WebDriverWait(driver, null);
	     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		
//		System.out.println(images.size());
//		
//		for(WebElement i:images)
//		{
//			System.out.println(i.getText());
//		}
//		System.out.println("completed");
		
		driver.switchTo().frame("courses-iframe");
		WebElement courses = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		courses.click();
		Thread.sleep(10000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());
		
		for(WebElement i:images)
		{
			i.click();
			Thread.sleep(3000);
		}
		
		
		
		
		
		
	}

}
