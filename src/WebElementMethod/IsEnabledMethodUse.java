package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodUse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/home");
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
//		Thread.sleep(5000);
//		
//		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
//		boolean result1 = getOtpButton.isEnabled();
//		System.out.println(result1);
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8668392460");
//		Thread.sleep(5000);
//		getOtpButton.click();
//		Thread.sleep(20000);
//		
//		driver.findElement(By.id("//input[@id='OTP']")).sendKeys("8668");
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		//System.out.println(getOtpButton.isEnabled());
		boolean result = getOtpButton.isEnabled();
		System.out.println(result);
		
		WebElement mobileNo = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
	    
		mobileNo.sendKeys("8668392460");
		getOtpButton.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	}

}
