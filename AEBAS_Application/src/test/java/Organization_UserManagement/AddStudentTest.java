package Organization_UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import POMRepository.AddStudentData;
import POMRepository.LHSMenu;
import POMRepository.Users;

public class AddStudentTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void addStudent() throws Throwable {
		AddStudentData student = new AddStudentData(driver);
		Excel_Utility elib = new Excel_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();


		Thread.sleep(1000);

		// Move to LHS site
		wlib.moveByOffset(driver, 0, 540);

		Thread.sleep(1000);
		LHSMenu menu = new LHSMenu(driver);
		menu.navigateToLHSUserMngMenu();

		// Click on the '+ Student' button
		Users addStudent = new Users(driver);
		addStudent.clickAddStudent();

		// Generate randam number
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getrandamNum();

		Thread.sleep(1000);
		student.SelectdrpPrifix();
		student.SelectStudentfirstName();
		student.SelectStudentMiddleName();
		student.selectLastName();

		String contactNo = elib.getExcelDataFormatter("Add_Student", 3, 0) + ranNum;
		System.out.println("ContactNo" + contactNo);
		driver.findElement(By.id("contact_no")).sendKeys(contactNo);

		
		student.SelectEmail();

		// Select Dropdown Gender

		student.SelectdrpGender();

		String adharNo = elib.getExcelDataFormatter("Add_Student", 5, 0);
		driver.findElement(By.id("aadhar")).sendKeys(adharNo);

		// Select dropdown StudentCourse

		student.SelectDrpCourse();

		// Select Student Course Year
		student.SelectdrpCourseYear();

		// Select Religion
		student.SelectdrpReligion();

		// Select Category
		student.SelectdrpCategory();
		
		student.SelectJoiningDate();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

//		String permantPinCode = elib.getExcelData("Add_Student", 6, 0);
//		driver.findElement(By.id("permanentpincode")).sendKeys(permantPinCode);
		
		student.getSelectdrppermanentpincodedistrict();



		student.clickAddStudentBtn();


//		String actData = driver
//				.findElement(By.xpath("//div[@class='mat-tooltip-trigger procontname font-size-15 u-link']")).getText();
//		Thread.sleep(2000);
//		System.out.println(actData);
//		{
//			if (actData.contains(student.getStudentFirstName())) {
//				System.out.println("pass");
//			} else {
//				System.out.println("fail");
//			}
//		}
		Thread.sleep(3000);


	}

}
