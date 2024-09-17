package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchromebrowser {

	public static void main(String[] args) {
		String chromedriver = "D:\\selenium\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromedriver);
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		

	}

}
