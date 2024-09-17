package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openFirefox {
	public static void main(String[] args) {
		String firefoxdriver = "D:\\selenium\\geckodriver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",firefoxdriver);
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
System.out.println();
}}
