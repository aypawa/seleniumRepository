package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		TakesScreenshot srcshot = (TakesScreenshot)driver;
		File source = srcshot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\ScreenShot\\s1.png");
		FileHandler.copy(source, destination);
	}

}
