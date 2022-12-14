package verificationUsingTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTC {
  @Test
  public void verifyCheckBox () throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Thread.sleep(2000);
	  
	  WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	  checkBox.click();
	  
//	  if(checkBox.isSelected())
//	  {
//		  Reporter.log("checkBox is selected hence tc is passed",true);
//	  }
//	  else
//	  {
//		  Reporter.log("checkBox is not selected hence tc is failed",true);
//	  }
	 Assert.assertTrue(checkBox.isSelected(),"checkBox is not selected hence tc is failed");
  }
}
