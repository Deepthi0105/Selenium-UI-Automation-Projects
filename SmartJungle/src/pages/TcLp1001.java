package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ExcelDataOperations;

public class TcLp1001 {
	WebDriver driver;

	public TcLp1001(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[1]")
	WebElement onClickLogIn;

	@FindBy(name = "email")
	WebElement enterEmailId;

	@FindBy(name = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//*[@id=\"login\"]/div/a/span")
	WebElement onClickLoginButton;

	public void onClickLogin() {
		onClickLogIn.click();
	}

	public void enterEmailId() throws IOException {
		enterEmailId.sendKeys(ExcelDataOperations.readExcel(1, 1, "Login"));
	}

	public void enterPassword() throws IOException {
		enterPassword.sendKeys(ExcelDataOperations.readExcel(2, 1, "Login"));
	}

	public void enterLoginButton() {
		onClickLoginButton.click();
	}
}
