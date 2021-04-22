package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcLp1003 {
	WebDriver driver;

	public TcLp1003(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[1]")
	WebElement onClickLogIn;

	@FindBy(xpath = "//*[@id=\"login\"]/div/a/span")
	WebElement enterLogInButton;

	public void enterOnClickLogIn() {
		onClickLogIn.click();
	}

	public void enterLoginButton() {
		enterLogInButton.click();
	}

}
