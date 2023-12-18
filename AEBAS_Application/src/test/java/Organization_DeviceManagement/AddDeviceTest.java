package Organization_DeviceManagement;

import org.testng.annotations.Test;
import Generic_Utilities.BaseClass;
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

		device.addDeviceName();

		device.addSerialNo();

		device.makeBy();

		device.selectdrpDeviceStatus();

		device.warrantyInYears();

		device.registerDeviceExpiry();

		device.warrantyExpiry();
		Thread.sleep(2000);
		device.addDeviceBTN();

	}

}
