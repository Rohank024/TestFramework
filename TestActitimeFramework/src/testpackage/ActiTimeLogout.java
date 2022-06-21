package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class ActiTimeLogout extends BaseTest{
	
	@Test
	public void actiTimeValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readpropertyfile(PROP_PATH, "username");
		String validPassword = flib.readpropertyfile(PROP_PATH, "password");
		lp.actiTimevalidLogin(validUsername, validPassword);
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
		
	}

}
