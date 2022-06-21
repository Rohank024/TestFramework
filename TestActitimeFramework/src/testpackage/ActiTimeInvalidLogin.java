package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;

import pagepackage.LoginPage;
@Listeners(CustomListner.class)
public class ActiTimeInvalidLogin extends BaseTest{

	@Test
	public void actiTimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
	
		int rc = flib.getrowcount(EXCEL_PATH, "invalidcreds");
		
		Reporter.log(rc+"",true);
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExceldata(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExceldata(EXCEL_PATH, "invalidcreds", i, 1);
	
		
			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
			WebElement errorMsG = lp.getErrorMsg();
			
			boolean status = errorMsG.isDisplayed();
			Assert.assertEquals(status, true);
			
		}
		
	
		
	}
}