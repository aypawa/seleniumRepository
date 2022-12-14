package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethodEg2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  
		WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		WebElement HideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		WebElement ShowButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		
//		HideButton.click();
//		Thread.sleep(3000);
//		ShowButton.click();
//		Thread.sleep(3000);
//		TextBox.sendKeys("Good Morning");
		System.out.println(TextBox.isDisplayed());
		
		if(TextBox.isDisplayed())
		{
			
			TextBox.sendKeys("Good Morning");
		}
		else
		{
			ShowButton.click();
			TextBox.sendKeys("Good Evening");
		}
		System.out.println("Completed");
	}

}
