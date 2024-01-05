package test_field.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_customerPage {
	WebDriver driver;
	
		

	public Add_customerPage(WebDriver driver) {
		this.driver=driver;
	}



	By mycust=By.xpath("//span[contains(text(),'My Customers')]");
	
	By newcust=By.xpath("//span[contains(text(),'New Customer') and @class='mat-button-wrapper']");

	By custno=By.id("mat-input-46");
	 
	By ref=By.id("mat-input-47");
	
	By contactper=By.id("mat-input-69");
	
	By mobile=By.id("mat-input-70");
	
	By mail=By.id("mat-input-72");
	
	By designation =By.id("mat-input-73");
	
	By address=By.id("mat-input-74");
	
	By search=By.id("mat-input-91");
	
	By btdone=By.xpath("//span[contains(text(),'Done')]//parent::button");
	
	By save=By.xpath("//span[contains(text(),'Save')]");
	
	public void click_on_mycust() {
		driver.findElement(mycust).click();
	}
	
	public void click_on_newCustomer() {
		driver.findElement(newcust).click();
	}
	
	public void set_customerno(String customerNo) {
		driver.findElement(custno).sendKeys(customerNo);
	}
	
	public void set_refId(String refId) {
		driver.findElement(ref).sendKeys(refId);
	}
	public void set_ContactPerson(String contactperson) {
		driver.findElement(contactper).sendKeys(contactperson);
	}
	
	public void set_mobileNo(String mobileNo) {
		driver.findElement(mobile).sendKeys(mobileNo);
	}
	
	public void set_mail(String mailId) {
		driver.findElement(mail).sendKeys(mailId);
		
	}
	
	public void set_designation(String design) {
		driver.findElement(designation).sendKeys(design);
	}
	public void click_adress() {
		driver.findElement(address).click();
	}
	public void set_search(String valueSearch) {
		driver.findElement(search).sendKeys(valueSearch);
	}
	
	public void click_on_button() {
		driver.findElement(btdone).click();
	}
	
	public void click_on_save() {
		driver.findElement(save).click();
	}
}

