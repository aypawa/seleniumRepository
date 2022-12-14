package popUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		String IdOfmainPage = driver.getWindowHandle();
		System.out.println(IdOfmainPage);

		Set<String> IdOfAllPages = driver.getWindowHandles();
		System.out.println(IdOfAllPages);
		
		Iterator<String> it = IdOfAllPages.iterator();
		String mainPage = it.next();
		String childPage = it.next();
		Thread.sleep(1000);
		
		driver.switchTo().window(childPage);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Pop Up ex");
		driver.close();
		
		driver.switchTo().window(mainPage);
		Thread.sleep(1000);
		
		String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		System.out.println(myText);
		
		
		ArrayList<Object>al=new ArrayList(IdOfAllPages);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
	}

}
