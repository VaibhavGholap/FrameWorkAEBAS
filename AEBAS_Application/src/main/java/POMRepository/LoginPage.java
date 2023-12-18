package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Declaration
	

	
//	@FindBy(xpath = "//span[text()='I Consent']")
//	private WebElement IConcentButton;

	@FindBy(xpath = "//label[text()='  Administrative ']")
	private WebElement administrativeRedioButton;

	@FindBy(xpath = "//input[@formcontrolname='user_name']")
	private WebElement userTextField;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement passwordTextField;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	
//	public WebElement getIConcentButton() {
//		return IConcentButton;
//	}

	public WebElement getAdministrativeRedioButton() {
		return administrativeRedioButton;
	}

	public void setAdministrativeRedioButton(WebElement administrativeRedioButton) {
		this.administrativeRedioButton = administrativeRedioButton;
	}

	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	// Business Logic

	public void loginToAEBAS(String username, String password) throws InterruptedException {
		Thread.sleep(1000);
//		IConcentButton.click();
//		administrativeRedioButton.click();
		Thread.sleep(1000);

		userTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
