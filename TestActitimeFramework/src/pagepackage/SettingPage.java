package pagepackage;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage {
	
	@FindBy(linkText = "Settings") private WebElement settingsLink;
	@FindBy(name="firstHierarchyLevelCode") private WebElement TopgroupinglevelDRopDown;
	@FindBy(name="secondHierarchyLevelCode") private WebElement MiddlegroupinglevelDropdown;
	@FindBy(name="thirdHierarchyLevelCode") private WebElement TimeentrylevelDropdown;
	
	
	
	
	
	public SettingPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	public WebElement getSettingsLink() {
		return settingsLink;
	}
	public WebElement getTopgroupinglevelDRopDown() {
		return TopgroupinglevelDRopDown;
	}
	public WebElement getMiddlegroupinglevelDropdown() {
		return MiddlegroupinglevelDropdown;
	}
	public WebElement getTimeentrylevelDropdown() {
		return TimeentrylevelDropdown;
	}
	
	public void clickSettingsLink()
	{
		settingsLink.click();
	}
	
	
	
}
