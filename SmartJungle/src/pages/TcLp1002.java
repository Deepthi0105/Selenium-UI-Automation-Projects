package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ExcelDataOperations;

public class TcLp1002 {
	WebDriver driver;

	public TcLp1002(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[1]")
	WebElement onClickLogin;

	@FindBy(name = "email")
	WebElement enterEmailId;

	@FindBy(name = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//*[@id=\"login\"]/div/a/span")
	WebElement enterLogin;

	public void onClickLogin() {
		onClickLogin.click();

	}

	public void enterEmailID() throws IOException {
		enterEmailId.sendKeys(ExcelDataOperations.readExcel(4, 1, "Login"));
	}

	public void enterPassword() throws IOException {
		enterPassword.sendKeys(ExcelDataOperations.readExcel(5, 1, "Login"));

	}

	public void enterLogin() {
		enterLogin.click();
	}

}
