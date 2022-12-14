package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement tr1h1 = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr/th[1]"));
		System.out.println(tr1h1.getText());
		
		WebElement tr1h4 = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr/th[4]"));
		System.out.println(tr1h4.getText());
		
		//for header row
		
		for(int i=1;i<=6;i++)
		{
			WebElement tr1th = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr/th["+i+"]"));
			System.out.print(tr1th.getText()+" ");
		}
		System.out.println();
		
		//for 4th row
		for(int i=1;i<=6;i++)
		{
			WebElement tr3td = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr[3]/td["+i+"]"));
			System.out.print(tr3td.getText()+" ");
		}
	}

}
