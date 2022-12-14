package WebElementMethod;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(2000);
	//	WebElement CheckBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		boolean result1 = Checkbox1.isSelected();
//		System.out.println(result1);
//		
//		Checkbox1.click();
//		
//		boolean result2 = Checkbox1.isSelected();
//		System.out.println(result2);
		
//		WebElement CheckBox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
//		WebElement CheckBox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
//		
//		CheckBox1.click();
//		Thread.sleep(1000);
//		CheckBox2.click();
//		Thread.sleep(1000);
//		CheckBox3.click();
//		Thread.sleep(2000); 
//		
//		driver.close();
		
	  WebElement CheckBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	  CheckBox1.click();
	  
	  System.out.println(CheckBox1.isSelected());
		
		WebElement CheckBox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		System.out.println(CheckBox2.isSelected());
		
		WebElement CheckBox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		System.out.println(CheckBox3.isSelected());
	}

}
