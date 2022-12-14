 package UpStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\OneDrive\\Desktop\\Automation velocity\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login-v2.upstox.com/");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        
        //Reading data from Excel
        
        File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\ajinkya1.xlsx");
    
        Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
        
        UpstoxLoginPage login=new UpstoxLoginPage(driver);
        
        login.SendUserID(mysheet.getRow(1).getCell(0).getStringCellValue());
        
        String pwd = mysheet.getRow(1).getCell(1).getStringCellValue();
        
        login.SendPassword(pwd);
        
        login.ClickOnSignButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        
        UpstoxPasscodePage passcode=new UpstoxPasscodePage(driver);
        passcode.EnterPasscode(mysheet.getRow(1).getCell(2).getStringCellValue());
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        UpstoxWelcomePage Welcome=new UpstoxWelcomePage(driver);
        Welcome.ClickOnNoIAmGoodButton();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        UpStoxHomePage Home=new UpStoxHomePage(driver);
        Home.ValidateUserId(driver,mysheet.getRow(1).getCell(3).getStringCellValue());
        Home.ClickOnFundButton();
        
        UpstoxFundPage Fund=new UpstoxFundPage(driver);
        Fund.CheckFunds();
        Home.ClickOnLogOutButton();
        driver.close();
        
        
        
	}

}
