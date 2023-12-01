package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generic_Utilities.Excel_Utility;

public class AddStudentData {
	Excel_Utility elib = new Excel_Utility();

	public AddStudentData(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement studentFirstName;

	@FindBy(id = "middle_name")
	private WebElement studentMiddleName;

	@FindBy(id = "last_name")
	private WebElement studentlastName;

	@FindBy(id = "joining_date")
	private WebElement selectjoiningDate;

	@FindBy(id = "contact_no")
	private WebElement contactNo;

	@FindBy(id = "email")
	private WebElement selectemailId;

	public WebElement getContactNo() {
		return contactNo;
	}

	@FindBy(id = "prefix")
	private WebElement selectdrpPrifix;

	public WebElement getDrpPrifix() {
		return selectdrpPrifix;
	}

	public WebElement getEmail() {
		return selectemailId;
	}

	public WebElement getJoiningDate() {
		return selectjoiningDate;
	}

	public WebElement getLastName() {
		return studentlastName;
	}

	public WebElement getMiddleName() {
		return studentMiddleName;
	}

	@FindBy(xpath = "//span[text()='Add']")
	private WebElement Add;

	@FindBy(id = "gender")
	private WebElement selectdrpgender;

	@FindBy(id = "studcourse")
	private WebElement selectdrpCourse;

	@FindBy(id = "studcourse_year")
	private WebElement selectdrpCourseYear;
	
	@FindBy(id ="religion" )
	private WebElement selectdrpReligion;
	
	@FindBy(id="category")
	private WebElement selectdrpCategory;
	
	@FindBy(id = "permanentpincodedistrict")
	private WebElement selectdrppermanentpincodedistrict;

	
	
	
	
	
	
	public WebElement getSelectdrppermanentpincodedistrict() {
		return selectdrppermanentpincodedistrict;
	}

	public WebElement getSelectdrpCourseYear() {
		return selectdrpCourseYear;
	}

	public WebElement getSelectdrpReligion() {
		return selectdrpReligion;
	}

	public WebElement getSelectdrpCourse() {
		return selectdrpCourse;
	}

	public WebElement getSelectdrpgender() {
		return selectdrpgender;
	}

	public WebElement getStudentFirstName() {
		return studentFirstName;
	}

	public WebElement getAdd() {
		return Add;
	}

	public void clickAddStudentBtn() {
		Add.click();
	}

	public void SelectStudentfirstName() throws Throwable {
				
		String FirstName = elib.getExcelData("Add_Student", 0, 0);
		studentFirstName.sendKeys(FirstName);
	}

	public void SelectStudentMiddleName() throws Throwable {
		
		String MiddleName = elib.getExcelData("Add_Student", 1, 0);
		studentMiddleName.sendKeys(MiddleName);
	}

	public void selectLastName() throws Throwable {
		
		String LastName = elib.getExcelData("Add_Student", 2, 0);
		studentlastName.sendKeys(LastName);
		
	}

	public void SelectJoiningDate() throws Throwable {
		
		
		String joiningDate = elib.getExcelData("Add_Student", 7, 0);
		
		selectjoiningDate.sendKeys(joiningDate);
	}

	public void SelectContactNo(String contactNo2) {
		contactNo.sendKeys(contactNo2);

	}

	public void SelectEmail() throws Throwable {
		String email = elib.getExcelData("Add_Student", 4, 0);		
		selectemailId.sendKeys(email);

	}

	public void SelectdrpPrifix() throws Throwable {

		String drpPrifix = elib.getExcelData("Add_Student", 8, 0);
		Select drpPrifix1 = new Select(selectdrpPrifix);
		drpPrifix1.selectByVisibleText(drpPrifix);
	}

	public void SelectdrpGender() throws Throwable {
		String Gender = elib.getExcelData("Add_Student", 9, 0);
		Select drpGender = new Select(selectdrpgender);
		drpGender.selectByVisibleText(Gender);

	}

	public void SelectDrpCourse() throws Throwable {

		String course = elib.getExcelData("Add_Student", 10, 0);
		Select drpCourse = new Select(selectdrpCourse);
		drpCourse.selectByVisibleText(course);

	}

	public void SelectdrpCourseYear() throws Throwable{
		String courseYear = elib.getExcelData("Add_Student", 11, 0);
		Select drpCourseYear = new Select(selectdrpCourseYear);
		drpCourseYear.selectByVisibleText(courseYear);
	}
	
	public void SelectdrpReligion() throws Throwable {
	String religion = elib.getExcelData("Add_Student", 12, 0);
	Select drpReligion = new Select(selectdrpReligion);
	drpReligion.selectByVisibleText(religion);
	}
	
	public void SelectdrpCategory() throws Throwable {
		String category = elib.getExcelData("Add_Student", 13, 0);
		Select drpCategory = new Select(selectdrpCategory);
		drpCategory.selectByVisibleText(category);
	}
	public void Selecdrppermanentpincodedistrict() throws Throwable {
	String permanentpincodedistrict = elib.getExcelData("Add_Student", 14, 0);
	Select drpPermanentpincodedistrict = new Select(selectdrppermanentpincodedistrict);
	drpPermanentpincodedistrict.selectByVisibleText(permanentpincodedistrict);
	}
}
