package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcReg1003 {
	WebDriver driver;

	public TcReg1003(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "newsletter")
	WebElement clickOnRadioButtonYes;

	@FindBy(name = "newsletter")
	WebElement clickOnRadioButtonNo;

	@FindBy(name = "agree")
	WebElement clickOnPrivacyPolicy;

	@FindBy(xpath = "//*[@id=\"register\"]/div[5]/div/a[2]/span")
	WebElement clickOnContinueButton;

	public void clickOnRadioButtonYes() {
		clickOnRadioButtonYes.click();
	}

	public void clickOnRadioButtonNo() {
		clickOnRadioButtonNo.click();
	}

	public void clickOnPrivacyPolicy() {
		clickOnPrivacyPolicy.click();
	}

	public void clickOnContinueButton() {
		clickOnContinueButton.click();
	}
}