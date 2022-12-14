package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg9 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   System.out.println(src);
	   
	   String s=net.bytebuddy.utility.RandomString.make(4);
	   File destination=new File("C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\ScreenShot\\Google"+s+".png");
		System.out.println(destination);
		
		FileHandler.copy(src, destination);
		driver.close();
	}

}
