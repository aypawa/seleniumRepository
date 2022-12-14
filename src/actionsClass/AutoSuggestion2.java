package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		 WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		 Actions act=new Actions(driver);
		 act.sendKeys(search,"webdriver").perform();
		 
		 List<WebElement> searchlist = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//*[@class='eIPGRd']"));
		 
		 for(WebElement searchresult:searchlist)
		 {
			String value = searchresult.getText();
			System.out.println(value );
			
			 if(value.contains("manager"))
			 {
				 Thread.sleep(4000);
				 searchresult.click();
			 }
		 }
		 
	}

}
