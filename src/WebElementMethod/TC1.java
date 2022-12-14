package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
////		driver.get("https://paytm.com/");
////		
////		
////		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'App')]"));
////		String ActualResult=text.getText();
////		driver.close();
////		System.out.println(ActualResult);
////		
////		String ExpectedResult="India's Most-loved Payments App";
////		
////		if(ActualResult.equals(ExpectedResult))
////		{
////			System.out.println("Result is matching,TC is passed");
////		}
////		else
////		{
////			System.out.println("Result is not matching,TC is failed");
////		}
//	
//		
//		
//           driver.manage().window().maximize();
//		driver.get("https://vctcpune.com/selenium/practice.html");
//		Thread.sleep(5000);
//		WebElement text = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
//		
//       String ActualResult=text.getText();
//		
//		System.out.println(ActualResult);
//	
//		String ExpectedResult="VELOCITY CORPORATE TRAINING CENTER";
//		
//		if(ActualResult.equals(ExpectedResult))
//	{
//			System.out.println("Result is mathing,TC is passed");
//		}
//	   else
//		{
//		System.out.println("Result is not matching,Tc is failed");
//		}
		
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		
		WebElement Text = driver.findElement(By.xpath("//h1[text()='Recharge & Pay Bills on Paytm.']"));
		
		String ActualResult= Text.getText();
		
		String ExpectedResult="Recharge & Pay Bills on Paytm.";
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Result is matching & TC is passed");
		}
		else
		{
			System.out.println("Result is not matching TC is failed");
		}
		
		
	}
	
	
	
	
	
	
	
	

}
