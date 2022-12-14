package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot srcshot = (TakesScreenshot)driver;
		File source = srcshot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\ScreenShot\\s1.png");
		FileHandler.copy(source, destination);
	}
}
