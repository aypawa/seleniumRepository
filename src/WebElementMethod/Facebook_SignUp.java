package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		Thread.sleep(5000);
//		
//		WebElement First_name = driver.findElement(By.xpath("//input[@name='firstname']"));
//		WebElement Sur_name = driver.findElement(By.xpath("//input[@name='lastname']"));
//		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		WebElement Password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//		WebElement RE_Email = driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']"));
//		
//		First_name.sendKeys("Ajinkya");
//		Sur_name.sendKeys("Pawar");
//		Email.sendKeys("ajinkyapawar65@gmail.com");
//		RE_Email.sendKeys("ajinkyapawar65@gmail.com");
//		Password.sendKeys("Ajinkya@65");
//		
//		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
//		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
//		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
//		
//		Select s=new Select(Day);
//		Select s1=new Select(Month);
//		Select s2=new Select(Year);
//		
//		s.selectByIndex(16);
//		s1.selectByVisibleText("Jun");
//		s2.selectByValue("1995");
//		Thread.sleep(5000);
//		
//		WebElement Gender_F = driver.findElement(By.xpath("//label[text()='Female']"));
//		WebElement Gender_M = driver.findElement(By.xpath("//label[text()='Male']"));
//		WebElement Gender_C = driver.findElement(By.xpath("//label[text()='Custom']"));
//		
//		Gender_M.click();
//		Thread.sleep(5000);
//		driver.close();
//		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		firstName.sendKeys("Ajinkya");
		lastName.sendKeys("Pawar");
		email.sendKeys("ajinkyapawar");
		passWord.sendKeys("Ajinkya@65");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(day);
		Select s1=new Select(month);
		Select s2=new Select(year);
		
		s.selectByIndex(16);
		s1.selectByVisibleText("Jan");
		Thread.sleep(2000);
		s2.selectByValue("1995");
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
