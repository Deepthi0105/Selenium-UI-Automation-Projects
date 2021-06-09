package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcLp1004 {

	WebDriver driver;

	public TcLp1004(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[1]")
	WebElement onClickLogIn;

	@FindBy(xpath = "//*[@id=\"login\"]/div/div/a")
	WebElement onClickForgottenPassword;

	@FindBy(xpath = "//*[@id=\"forgotten\"]/div[2]/div[2]/a/span")
	WebElement enterContinueButton;

	@FindBy(xpath = "//*[@id=\"forgotten\"]/div[2]/div[1]/a/span")
	WebElement enterBackButton;

	public void onClickLogin() {
		onClickLogIn.click();
	}

	public void onClickForgottenPassword() {
		onClickForgottenPassword.click();
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}

	public void enterBackButton() {
		enterBackButton.click();
	}
}
