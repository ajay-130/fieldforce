package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import test_field.pages.Add_customerPage;
import test_field.pages.LoginPage;

public class BaseTest {
	WebDriver driver;
	LoginPage login;
	Add_customerPage ad;
	@BeforeTest
	public void setup() {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testffc.nimapinfotech.com/");
	ad=new Add_customerPage(driver);
	login=new LoginPage(driver);
	
	
}
	
	@AfterMethod
	public void on_test_failure(ITestResult result) throws Exception
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File f=new File("C:\\Users\\USER\\eclipse-workspace\\test_field\\ScreenShots"+sdf.format(d)+".png");
			
			FileUtils.copyFile(src, f);
			
		}
	}

}
