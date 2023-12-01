package POMRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()=' demo org ']")
	private WebElement nvgToOrganizationName;

	public WebElement getNvgToOrganizationName() {
		return nvgToOrganizationName;
	}

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement Logout;

	public void clickONOrganization() {
		nvgToOrganizationName.click();

	}

	public void clickOnLogout() {
		Logout.click();

	}
}
