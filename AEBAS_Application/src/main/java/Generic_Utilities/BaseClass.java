package Generic_Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import POMRepository.HomePage;
import POMRepository.LHSMenu;
import POMRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	LHSMenu menu=new LHSMenu(driver);
	public static WebDriver driver;
	
	File_Utility flib = new File_Utility();
	

	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void beforeSuite() {
		System.out.println("DataBase connection");
	}

	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void beforeTest() {
		System.out.println("Parallele execution");
	}

	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void beforeClss() throws IOException {
		System.out.println("Launching the browser");
		File_Utility flib = new File_Utility();

		String BROWSER = flib.getKeyAndValue("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

	}

	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("Login in to apllication");
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizeWindow(driver);

		wlib.implicitlyWait(driver);

		String url = flib.getKeyAndValue("URL");
		String USERNAME = flib.getKeyAndValue("username");
		String PASSWORD = flib.getKeyAndValue("password");
		driver.get(url);

		LoginPage login = new LoginPage(driver);
		login.loginToAEBAS(USERNAME, PASSWORD);
		System.out.println("Successfully Login");

	}

	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void afterMethod() {
		System.out.println("Logout from Application");
		HomePage home = new HomePage(driver);
		home.clickONOrganization();
		home.clickOnLogout();

	}

	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void afterClass() {
		System.out.println("Close Browser");
	}

	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void afterTest() {
		System.out.println("Paraller execution closed");
	}

	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void afterSuit() {
		System.out.println("Data base connection closed");
	}

}
