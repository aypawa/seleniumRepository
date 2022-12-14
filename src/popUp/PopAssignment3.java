package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopAssignment3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	// driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	
	
//	 Alert alt=driver.switchTo().alert();
//     System.out.println(alt.getText());
//     Thread.sleep(2000);
//     alt.accept();
    
//     Alert alt = driver.switchTo().alert();
//     System.out.println(alt.getText());
//     alt.dismiss();
//     alt.accept();
     
     Alert alt=driver.switchTo().alert();
     System.out.println(alt.getText());
     alt.accept();
   //  alt.dismiss();
	}

}
