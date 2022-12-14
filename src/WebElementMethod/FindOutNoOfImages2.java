package WebElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOutNoOfImages2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Electronics.click();
		Thread.sleep(15000);
		
		List<WebElement> noOfImages = driver.findElements(By.xpath("//img[@class='kJjFO0 _3DIhEh']"));
		System.out.println(noOfImages.size());
		
		for(WebElement singleImage:noOfImages)
		{
              try
              {   Thread.sleep(5000);
            	  singleImage.click();
                  Thread.sleep(5000);
                  driver.navigate().back();
                  Thread.sleep(5000);
              }
              catch(Exception e)
              {
            	  Thread.sleep(5000);
            	  singleImage.click();
                  Thread.sleep(5000);
                  driver.navigate().back();
                  Thread.sleep(5000);
              }
		}
	}

}
