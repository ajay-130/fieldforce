package testCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@Parameters({"username","password"})
	@Test(priority=0)
	public void verify_login(String username,String password) throws Exception {
		String expected_res="";
		String actual_res=driver.getTitle();
		login.setUsename(username);
		login.setPassword(password);
		login.captcha_handle();
		login.click_on_login();
		Assert.assertEquals(actual_res, expected_res);
		
	}
	
	

}
