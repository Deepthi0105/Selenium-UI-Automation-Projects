package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcMa1003 {

	WebDriver driver;

	public TcMa1003(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[3]/a")
	WebElement onClickMyAccount;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/ul/li[2]/a")
	WebElement onClickChangePassword;
	String urlOfChangePassword = "https://www.smartjungle.co.uk/index.php?route=account/password";

	@FindBy(name = "password")
	WebElement enterPassword;

	@FindBy(name = "confirm")
	WebElement enterConfirmPassword;

	@FindBy(xpath = "//*[@id=\"password\"]/div[2]/div[2]/a/span")
	WebElement enterContinueButton;
	String urlOfContinue = "https://www.smartjungle.co.uk/index.php?route=account/account";

	public void onClickMyAccount() {
		onClickMyAccount.click();
	}

	public void onClickChangePassword() {
		onClickChangePassword.click();
	}

	public String getUrlOfChangePassword() {
		return urlOfChangePassword;
	}

	public void enterPassword(String password) {
		enterPassword.clear();
		enterPassword.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		enterConfirmPassword.clear();
		enterConfirmPassword.sendKeys(confirmPassword);
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}

	public String getUrlOfContinue() {
		return urlOfContinue;
	}
}
