package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {

	public Users(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()=' Student ']")
	private WebElement addStudents;
	
	@FindBy(xpath="//span[text()='Device Management']")
	private WebElement addDevice;

	public WebElement getAddDevice() {
		return addDevice;
	}

	public WebElement getAddStudents() {
		return addStudents;
	}

	public void clickAddStudent() {

		addStudents.click();
	}
	public void clickDeviceManagement() {
		addDevice.click();
	}

}
