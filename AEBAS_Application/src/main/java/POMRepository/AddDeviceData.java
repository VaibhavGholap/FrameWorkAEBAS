package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Generic_Utilities.Excel_Utility;

public class AddDeviceData {
	
	Excel_Utility elib = new Excel_Utility();
	
	public AddDeviceData(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//driver.findElement(By.xpath("//mat-icon[text()='add']")).click();
	
	@FindBy(xpath = "//mat-icon[text()='add']")
	private WebElement addDevice;
	
	//@FindBy(id = "gender")
	//private WebElement selectdrpgender;
	
	@FindBy(xpath = "//select[@formcontrolname='type']")
	private WebElement selectdrpDeviceType;
	
	@FindBy(xpath = "(//input[contains(@class,'ng-untouched ng-pristine')])[2]")
	private WebElement deviceName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Device Id / Serial No.']")
	private WebElement serialNo;
	
	@FindBy(xpath = "//input[@formcontrolname='make_by']")
	private WebElement makeBy;
	
	@FindBy(xpath = "//select[@formcontrolname='status']")
	private WebElement selectdrpDeviceStatus;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement  warrantyInYears;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	private WebElement  registerDeviceExpiry;
	
	@FindBy(xpath = "(//input[@placeholder='Select Date'])[2]")
	private WebElement warrantyExpiry;

//	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();

	@FindBy(xpath="(//span[text()='Save'])[2]")
	private WebElement addDeviceBTN;
	
	


	public WebElement getAddDeviceBTN() {
		return addDeviceBTN;
	}


	public WebElement getWarrantyExpiry() {
		return warrantyExpiry;
	}



	public WebElement getRegisterDeviceExpiry() {
		return registerDeviceExpiry;
	}



	public WebElement getWarrantyInYears() {
		return warrantyInYears;
	}


	public void setWarrantyInYears(WebElement warrantyInYears) {
		this.warrantyInYears = warrantyInYears;
	}


	public WebElement getSelectdrpDeviceStatus() {
		return selectdrpDeviceStatus;
	}


	public WebElement getMakeBy() {
		return makeBy;
	}

	public WebElement getDeviceName() {
		return deviceName;
	}

	public WebElement getSelectdrpDeviceType() {
		return selectdrpDeviceType;
	}

	public WebElement getAddDevice() {
		return addDevice;
	}
	
	public void addDevice() {
		addDevice.click();
	}
	
	public void selectdrpDeviceType() throws Throwable {
		String deviceType = elib.getExcelData("Add_Device", 1, 1);
		Select drpDeviceType = new Select(selectdrpDeviceType);
		drpDeviceType.selectByVisibleText(deviceType);
	}
	
	
	public void addDeviceName() throws Throwable {
		String selectDeviceName = elib.getExcelData("Add_Device", 2, 1);
		deviceName.sendKeys(selectDeviceName);
	}
	
	public void addSerialNo() throws Throwable {
		String selectDeviceName = elib.getExcelData("Add_Device", 3, 1);
		serialNo.sendKeys(selectDeviceName);
	}
	
	
	public void makeBy() throws Throwable {
		String selectMakeBy=elib.getExcelData("Add_Device", 4, 1);
		makeBy.sendKeys(selectMakeBy);
	}
	
	public void selectdrpDeviceStatus() throws Throwable {
		String deviceStatus = elib.getExcelData("Add_Device", 5, 1);
		Select drpDeviceStatus = new Select(selectdrpDeviceStatus);
		drpDeviceStatus.selectByVisibleText(deviceStatus);
		
	}
	
	public void warrantyInYears() throws Throwable {
		String SelectWarrantyInYears = elib.getExcelData("Add_Device", 7, 1);
		warrantyInYears.sendKeys(SelectWarrantyInYears);
	}
	
	public void registerDeviceExpiry() throws Throwable {
		String SelectregisterDeviceExpiry = elib.getExcelData("Add_Device", 6, 1);
		registerDeviceExpiry.sendKeys(SelectregisterDeviceExpiry);
	}
	
	public void warrantyExpiry() throws Throwable {
		String SelectwarrantyExpiry = elib.getExcelData("Add_Device", 8, 1);
		warrantyExpiry.sendKeys(SelectwarrantyExpiry);
		
	}
	
	public void addDeviceBTN() {
		addDeviceBTN.click();
	}
	

}
