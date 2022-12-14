package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=3;j++)
			{
				
				if(i==1)
				{
					WebElement value = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/th["+j+"]"));
					System.out.print(value.getText()+" ");
				}
				else
				{
					WebElement value1 = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]"));
					System.out.print(value1.getText()+" ");
				}
			}
			System.out.println();
		}
		
	}

}
