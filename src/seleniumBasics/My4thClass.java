package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My4thClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.get("https://www.ajio.com/");
		driver.get("https://www.reliancedigital.in/page/HP-Laptop?gclid=CjwKCAjwsfuYBhAZEiwA5a6CDOO22bc1tUD2oGIHOsB2LPgF3v0VAIBhlO99wN5QYAc84mmh-erdNBoCk1gQAvD_BwE");
	}

}
