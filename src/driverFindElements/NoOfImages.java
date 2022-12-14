package driverFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("images");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		images.click();
		Thread.sleep(10000);
		
		List<WebElement> noOfImages = driver.findElements(By.xpath("//img[@jsname='Q4LuWd']"));
		//System.out.println(noOfImages);
		for(WebElement singleImage:noOfImages)
		{
			singleImage.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
		}
	}

	}


