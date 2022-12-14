package WebElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOutNoOfImages3 {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.redbus.in/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println(images.size());
//		
//		for(WebElement i:images)
//		{
//			
//			System.out.println(i.getText());
//		}
//		System.out.println("completed");
//		
//		
//		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.phonepe.com/careers/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		careers.click();
		Thread.sleep(4000);
		
		List<WebElement> noOfImages = driver.findElements(By.xpath("//img[@class='why-phonepe-img']"));
		System.out.println(noOfImages.size());
		
		for(WebElement singleImage:noOfImages)
		{
			singleImage.click();
			Thread.sleep(3000);
			
		}
		System.out.println("completed");
		
		
		
		
		
		
		
		
		
		
	}

}
