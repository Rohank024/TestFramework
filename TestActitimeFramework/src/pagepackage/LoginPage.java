package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	@FindBy(xpath="//span[contains(.,'invalid')]") private WebElement errorMsg;
	
	//initialization
	

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getErrorMsg()
	{
		return errorMsg;
	}
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	
	
	//generic reusable method
	
	
	public void actiTimevalidLogin(String validUsername,String validPassword) throws InterruptedException
	{
		Thread.sleep(2000);
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		Thread.sleep(3000);
		usn.clear();
		pass.clear();
		Thread.sleep(2000);
		
	}

	
	
	

}
