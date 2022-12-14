package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
//		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
//		
//		WebElement CheckBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		
//		CheckBox1.click();
//		
//	    WebElement CheckBox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
//	  
//	    CheckBox2.click();
//	    
//	    WebElement CheckBox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
//	 
//	    CheckBox3.click();
//	
		WebElement CheckBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		CheckBox1.click();
		Thread.sleep(1000);
		
		WebElement CheckBox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		CheckBox2.click();
		Thread.sleep(1000);
		
		WebElement CheckBox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		CheckBox3.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
		
		WebElement radio1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		WebElement radio2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		WebElement radio3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
		WebElement radio4 = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		
		radio1.click();
		Thread.sleep(1000);
		radio2.click();
		Thread.sleep(1000);
		radio3.click();
		Thread.sleep(1000);
		radio4.click();
		Thread.sleep(1000);
		
	}

}
