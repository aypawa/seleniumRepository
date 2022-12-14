package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(2000);
//		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		
//		Select s=new Select(dropDown); 
//		
//		s.selectByVisibleText("Option3");
//		Thread.sleep(1000);
//		
//		s.selectByIndex(1);
//		Thread.sleep(1000);
//		
//		s.selectByValue("option1");
	    
	 WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	 
	 Select s=new Select(dropDown);
	 
	 s.selectByIndex(1);
	 Thread.sleep(1000);
	 
	s.selectByValue("option1");
	Thread.sleep(1000);
	
	s.selectByVisibleText("Option3");
	Thread.sleep(1000);
			 
	}

}
