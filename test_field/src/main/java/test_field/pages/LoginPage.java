package test_field.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By user=By.xpath("//input[@id='mat-input-59']");
	
	By pass=By.xpath("//input[@id='mat-input-60']");
	
	By captchaim=By.id("captcahCanvas");
	By captchatext=By.xpath("//input[@formcontrolname='captchaValue']");
	
	By log=By.id("kt_login_signin_submit");
	
	public void setUsename(String username) {
		driver.findElement(user).sendKeys(username);
		
	}
	
	public void setPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	
	public void captcha_handle() throws Exception {
		WebElement imageEl = driver.findElement(captchaim);
		
		File src=imageEl.getScreenshotAs(OutputType.FILE);
		
		String path ="C:\\Users\\USER\\eclipse-workspace\\test_field\\captchaimage\\captcha.png";
	
		
		FileHandler.copy(src, new File(path));
		
		Thread.sleep(2000);
		
		ITesseract image=new Tesseract();
		image.setDatapath("C:\\Users\\USER\\eclipse-workspace\\test_field\\TessData");
		String str=image.doOCR(new File(path));
		
		
		driver.findElement(captchatext).sendKeys(str);
		
	}
	
	public void click_on_login() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(log)
		.click();
	}

}
