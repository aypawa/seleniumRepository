package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=6;j++)
			{
				
				if(i==1)
				{
					WebElement tr1h1 = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr/th["+i+"]"));
					System.out.print(tr1h1.getText()+" ");
				}
				else
				{
					WebElement data1 = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr["+i+"]/td["+j+"]"));
					System.out.print(data1.getText()+" ");
				}
			}
			System.out.println();
		}
		
	}

}
