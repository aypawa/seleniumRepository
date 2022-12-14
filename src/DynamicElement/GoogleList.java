package DynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("honda");
		Thread.sleep(1000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(result.size());
		
		for(WebElement r:result)
		{
			//System.out.println(r.getText());
		
			String expected="honda bikes";
			   String Actual=r.getText();
			
			   if(expected.equals(Actual))
			   {
				   r.click();
				   break;
			   }
		Thread.sleep(3000);	
		//driver.findElement(By.linkText("Images")).click();			
	     }
		driver.findElement(By.xpath("//*[text()='Images']")).click();
		List<WebElement> allImages = driver.findElements(By.xpath("//*[@class='bRMDJf islir']"));
		for(WebElement singleImage:allImages)
		{
			singleImage.click();
			Thread.sleep(2000);
			//driver.navigate().back();
		}

}
}