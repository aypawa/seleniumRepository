package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()='Upgrade'])[3]")).click();
		driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]")).click();
		
		String mainPage = driver.getWindowHandle();
		Set<String> allPageId = driver.getWindowHandles();
		
		int numberOfWindow = allPageId.size();
		System.out.println(numberOfWindow);
		
		String[]wind=new String[numberOfWindow];
		int i=0;
		for(String id:allPageId)
		{
			wind[i]=id;
			i++;
		}
	//to print the array
		for(String w:wind)
		{
			System.out.println(w);
		}
		driver.switchTo().window(wind[1]);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		
		driver.switchTo().window(wind[2]);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement mainPageText = driver.findElement(By.xpath("//h2[text()='SQL Exercises']"));
		System.out.println(mainPageText.getText());
		
	}

}
