package popUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopAssignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/obj_history.asp");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Get Certified'])[3]")).click();
		
         Set<String> IdOfAllPages = driver.getWindowHandles();		
         System.out.println(IdOfAllPages);
         
         Iterator<String> it = IdOfAllPages.iterator();
         String mainPage = it.next();
         String childPage = it.next();
         
         driver.switchTo().window(childPage);
         Thread.sleep(2000);
         WebElement childPageText = driver.findElement(By.xpath("//h1[@class='collection--title']"));
         System.out.println(childPageText.getText());
         
         driver.switchTo().window(mainPage);
         Thread.sleep(2000);
         WebElement mainPageText = driver.findElement(By.xpath("//h2[text()='History Object Properties and Methods']"));
         System.out.println(mainPageText.getText());
		
         ArrayList al=new ArrayList(IdOfAllPages);
         System.out.println(al.get(0));
         System.out.println(al.get(1));
	}

}
