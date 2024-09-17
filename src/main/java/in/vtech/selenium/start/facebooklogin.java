package in.vtech.selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public static void main(String[] args) {
		String chromedriver = "D:\\selenium\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromedriver);
		WebDriver driver;
		driver = new ChromeDriver();
		
		String baseUrl="https://www.facebook.com/";
		driver.get(baseUrl);
		
		//type username
		driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		//type password
		//click login
		driver.findElement(By.name("login")).click();
		
		
	}

}
