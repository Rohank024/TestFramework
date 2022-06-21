package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath ="//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(linkText = "Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	@FindBy(xpath="//td[.='Enter Time-Track']") private WebElement enterTimeTrack;
	
	//initialization
	
	


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSettings() {
		return settings;
	}
	
	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}
	
	public WebElement getEnterTimeTrack() {
		return enterTimeTrack;
	}

	
	
	
	//operational method
	
	


	public void clickLogout()
	{
		logoutLink.click();
	}
	
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}


