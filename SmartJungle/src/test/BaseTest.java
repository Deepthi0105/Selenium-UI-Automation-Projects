package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.smartjungle.co.uk/index.php?route=common/home");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void Close() {
		driver.quit();
	}

}
