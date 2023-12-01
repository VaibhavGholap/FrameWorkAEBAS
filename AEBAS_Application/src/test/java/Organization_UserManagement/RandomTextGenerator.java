package Organization_UserManagement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomTextGenerator {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		FileInputStream fis = new FileInputStream("./src/test/resources/comman.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("URl");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);

		driver.findElement(By.xpath("//input[@formcontrolname='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(PASSWORD);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='  Administrative ']")).click();

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println("Successfully Login");
		Thread.sleep(1000);
		// Move to LHS site
		Actions action = new Actions(driver);
		action.moveByOffset(0, 540).click().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='User Management']")).click();
		Thread.sleep(2000);
	
		// Click on the '+ Student' button
		driver.findElement(By.xpath("//span[text()=' Student ']")).click();
		
		
		WebElement textField = driver.findElement(By.id("aadhar")); // Replace "yourTextFieldId" with the
																				// actual ID of your text field
		String randomText = generateRandomText(10); // Generate a random string of 10 characters
		textField.sendKeys(randomText); // Enter the random text into the text field

//		driver.quit();
	}

	// Method to generate random text
	public static String generateRandomText(int length) {
		String characters = "865235265324";
		StringBuilder randomText = new StringBuilder();

		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			randomText.append(characters.charAt(index));
		}

		return randomText.toString();
	}

}
