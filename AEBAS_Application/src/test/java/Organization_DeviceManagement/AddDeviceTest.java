package Organization_DeviceManagement;

import org.testng.annotations.Test;
import Generic_Utilities.BaseClass;
import Generic_Utilities.WebDriver_Utility;
import POMRepository.AddDeviceData;
import POMRepository.LHSMenu;
import POMRepository.Users;

public class AddDeviceTest extends BaseClass {

	@Test(groups = "regressionTest")
	public void addDevice() throws Throwable {

		Thread.sleep(1000);
		Users deviceManagement = new Users(driver);
		AddDeviceData device = new AddDeviceData(driver);
		LHSMenu menu = new LHSMenu(driver);
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizeWindow(driver);		
		wlib.implicitlyWait(driver);
		Thread.sleep(2000);

		// Navigate to the LHS
		menu.navigateToLHSDeviceMngMenu();

		// Click on the Device management
		deviceManagement.clickDeviceManagement();
		Thread.sleep(2000);

		// Click on the '+ Device' button
		device.addDevice();
		Thread.sleep(1000);

		device.selectdrpDeviceType();
		Thread.sleep(2000);


		device.addDeviceName();
		Thread.sleep(2000);


		device.addSerialNo();
		Thread.sleep(2000);


		device.makeBy();
		Thread.sleep(2000);


		device.selectdrpDeviceStatus();
		Thread.sleep(2000);


		device.warrantyInYears();
		Thread.sleep(2000);


		device.registerDeviceExpiry();
		Thread.sleep(2000);


		device.warrantyExpiry();
		Thread.sleep(2000);
		device.addDeviceBTN();

	}

}
