package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class ActiTimeValidLogin extends BaseTest{
	
	@Test
	public void actiTimeValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readpropertyfile(PROP_PATH, "username");
		String validPassword = flib.readpropertyfile(PROP_PATH, "password");
		lp.actiTimevalidLogin(validUsername, validPassword);
		
		
		
	}

}
