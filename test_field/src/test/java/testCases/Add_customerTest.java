 package testCases;

import org.testng.annotations.Test;

public class Add_customerTest extends BaseTest{

	@Test(priority=1)
	public void verify_save(String design,String searchcity) {
		ad.click_on_mycust();
		ad.click_on_newCustomer();
		ad.set_customerno("123445");
		ad.set_refId("167ye1te");
		ad.set_ContactPerson("Abcd");
		ad.set_mobileNo("88893324");
		ad.set_mail("xyz123@gmail.com");
		ad.set_designation(design);
		ad.click_adress();
		ad.set_search(searchcity);
		ad.click_on_button();
		ad.click_on_save();
	}
	
}
