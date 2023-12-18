package Generic_Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	/**
	 * This method is used for the maximizing the window
	 * @param driver
	 * @author Vaibhav
	 */

	public void maximizeWindow(WebDriver driver) {

		driver.manage().window().maximize();

	}

	/**
	 * This method will the element to load in GUI
	 * @param driver
	 * @author Vaibhav
	 */

	@SuppressWarnings("deprecation")
	public void implicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	/**
	 * After every action it will for next action to perform
	 * @param driver
	 */
	
	
	@SuppressWarnings("deprecation")
	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
	}

	/**
	 * This method is used for accept the alert
	 * @param driver
	 * @author Vaibhav
	 */

	public void switchToalertAndAccept(WebDriver driver) {

		driver.switchTo().alert().accept();
		
	}

	/**
	 * This method is used for the dismiss the alert
	 * @param driver
	 * @author Vaibhav
	 */
	public void switchToalertAndDismiss(WebDriver driver) {

		driver.switchTo().alert().dismiss();
	}
	/**
	 * This methos is used for the Mouse over on the element
	 * @param driver
	 * @param element
	 * @author Vaibhav
	 */

	public void mouseOverOnElement(WebDriver driver,WebElement element) {
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	/**
	 * This method is used for the Move to element by using the Offset
	 * @param driver
	 * @param x
	 * @param y
	 */
	
	public void moveByOffset(WebDriver driver,int x,int y) {
		Actions act = new Actions(driver);
		act.moveByOffset(x,y).click().build().perform();
	}
	
	
	
	
	
}
