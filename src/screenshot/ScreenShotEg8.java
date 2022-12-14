package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg8 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String s=net.bytebuddy.utility.RandomString.make(4);
		File destination=new File("C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\ScreenShot\\trip"+s+".png");
		
		FileHandler.copy(source, destination);
		driver.close();
	}

}
