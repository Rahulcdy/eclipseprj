package in.vtech.selenium.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {
	
		public static void main(String[] args) {
			String chromedriver = "D:\\selenium\\chromedriver-win64\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",chromedriver);
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize(); //for maximizing browser
			
			String baseUrl = "https://www.google.com";
			driver.get(baseUrl);
			
			driver.quit(); //it will close all windows
	}

}
