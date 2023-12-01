package Organization_UserManagement;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.WebDriver_Utility;
import POMRepository.LHSMenu;

public class EditStudent extends BaseClass{

	@Test
	public void EditStudent() throws InterruptedException{
		
		WebDriver_Utility wlib = new WebDriver_Utility();
		Thread.sleep(1000);

		// Move to LHS site
		wlib.moveByOffset(driver, 0, 540);

		Thread.sleep(1000);
		LHSMenu menu = new LHSMenu(driver);
		menu.navigateToLHSUserMngMenu();
		Thread.sleep(1000);

	}

}
