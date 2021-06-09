package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ExcelDataOperations;

public class TcLp1005 {
	WebDriver driver;

	public TcLp1005(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[1]")
	WebElement onClickLogIn;

	@FindBy(xpath = "//*[@id=\"login\"]/div/div/a")
	WebElement onClickForgottenPassword;

	@FindBy(name = "email")
	WebElement enterEmailId;

	@FindBy(xpath = "//*[@id=\"forgotten\"]/div[2]/div[2]/a/span")
	WebElement enterContinueButton;

	public void onClickLogin() {
		onClickLogIn.click();
	}

	public void onClickForgottenPassword() {
		onClickForgottenPassword.click();
	}

	public void enterEmailId() throws IOException {
		enterEmailId.sendKeys(ExcelDataOperations.readExcel(1, 1, "Login"));
		
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}
}
