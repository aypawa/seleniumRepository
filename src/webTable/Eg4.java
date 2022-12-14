package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement tr1h1 = driver.findElement(By.xpath("//table[@id='customers']//tr[1]/th[1]"));
		System.out.print(tr1h1.getText()+" ");
		
        WebElement tr1h2 = driver.findElement(By.xpath("//table[@id='customers']//tr[1]/th[2]"));
        System.out.print(tr1h2.getText()+" ");
        
        WebElement tr1h3 = driver.findElement(By.xpath("//table[@id='customers']//tr[1]/th[3]"));
        System.out.println(tr1h3.getText()+" ");
        System.out.println("===========================");
        
        //for header row 
        for(int i=1;i<=3;i++)
        {
        	WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']//tr/th["+i+"]"));
        	System.out.print(data1.getText()+" ");
        }
        System.out.println();
        //for 4th row
        for(int i=1;i<=3;i++)
        {
        	WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td["+i+"]"));
        	System.out.print(data1.getText()+" ");
        }
	}

}
