package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    WebElement data = driver.findElement(By.xpath("//table[@id=\"product\"]//tr/th[1]"));
		System.out.println(data.getText());
		
		//for header row
		for(int i=1;i<=3;i++)
		{
			WebElement data1 = driver.findElement(By.xpath("//table[@id=\"product\"]//tr/th["+i+"]"));
			System.out.print(data1.getText()+" ");
		}
		//for 4th row
		System.out.println();
		
		for(int i=1;i<=3;i++)
		{
			WebElement data2 = driver.findElement(By.xpath("//table[@id=\"product\"]//tr[4]/td["+i+"]"));
			System.out.print(data2.getText()+" ");
		}
	}

}
