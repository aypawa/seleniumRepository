package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//		
//	    driver.get("https://vctcpune.com/selenium/practice.html");
//	    Thread.sleep(2000);
//		
//		WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//	    WebElement HideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//	    WebElement ShowButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
//   
//       // HideButton.click();
//      //  Thread.sleep(3000);
//       // ShowButton.click();
//	    
//	    
//	    if(TextBox.isDisplayed())
//	    {
//	    	TextBox.sendKeys("Good Morning");
//	    }
//	    else
//	    {
//	    	ShowButton.click();
//	    	TextBox.sendKeys("Good Evening");
//	    }
//	    
         driver.manage().window().maximize();
         driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(3000);
         
        WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        WebElement HideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	    WebElement ShowButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
	    
//	    Text.sendKeys("Good Morning");
//	    Thread.sleep(3000);
//	    HideButton.click();
//	    Thread.sleep(3000);
//	    ShowButton.click();
//	    Thread.sleep(3000);
	   
	    if(TextBox.isDisplayed())
	    {
	    	System.out.println("Good Morning");
	    	
	    }
	    else
	    {
	    	ShowButton.click();
	    	System.out.println("Good Evening");
	    }
	}

}
