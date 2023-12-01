package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LHSMenu {
	

	public LHSMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='User Management']")
	private WebElement userManagement;
	
	@FindBy(xpath = "//span[text()='Device Management']")
	private WebElement deviceManagement;

	public WebElement getUserManagement() {
		return userManagement;
	}

	public WebElement getDeviceManagement() {
		return deviceManagement;
	}

	public void navigateToLHSUserMngMenu() {

		userManagement.click();
	}

	public void navigateToLHSDeviceMngMenu() {

		deviceManagement.click();
	}

}
