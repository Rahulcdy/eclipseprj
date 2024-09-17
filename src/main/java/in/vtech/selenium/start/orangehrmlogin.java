package in.vtech.selenium.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogin {

	public static void main(String[] args) throws Exception {
		String chromedriver = "D:\\selenium\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromedriver);
		WebDriver driver;
		driver = new ChromeDriver();

		String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(baseUrl);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		Thread.sleep(5000);

		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");

//		Thread.sleep(2000);

		WebElement loginField = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginField.click();

//		driver.quit();

	}
}
