package popUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopUpAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
//		Thread.sleep(3000);	
//		Set<String> allPageId = driver.getWindowHandles();
//		
//		for(String a:allPageId)
//		{
//			System.out.println(a);
//		}	
//		
//	   Iterator<String> it = allPageId.iterator();
//	   
//	   String mainPage = it.next();
//	   String childPage = it.next();  
//	   
//       driver.switchTo().window(childPage);   
//       
//	   WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));   
//	   
//	   Select s=new Select(dropDown);
//	   s.selectByIndex(1);
//	   Thread.sleep(3000); 
//	   s.selectByVisibleText("Option3");
//	   Thread.sleep(3000); 
//	   driver.close();
//	   
//	   driver.switchTo().window(mainPage);
//	   
//	   String mainPageText = driver.findElement(By.xpath("//h3[@style='font-weight:bold;']")).getText();
//	   System.out.println(mainPageText);
	   
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> allPageId = driver.getWindowHandles();
		
		for(String a:allPageId)
		{
			System.out.println(a);
		}
		
		Iterator<String> it = allPageId.iterator();
		
		String mainPage = it.next();
		String childPage = it.next();
		
		
		driver.switchTo().window(childPage);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select s=new Select(dropDown);
		
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByVisibleText("Option3");
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(mainPage);
		
		String mainPageText = driver.findElement(By.xpath("//h3[@style='font-weight:bold;']")).getText();
		
		System.out.println(mainPageText);
		driver.quit();
		
		
		ArrayList<Object>al=new ArrayList(allPageId);
		
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		
		
		
		
		
		
		
		
		
		
		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
	   
	   
	   
	   
		
		
		
		
		
		
		
		
		
	}

}
