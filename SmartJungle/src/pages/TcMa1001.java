package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcMa1001 {
	WebDriver driver;

	public TcMa1001(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[3]/a")
	WebElement onClickMyAccount;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div[1]/div/a/span")
	WebElement enterContinueButton;
	String urlOfRegisterPage = "https://www.smartjungle.co.uk/index.php?route=account/register";

	public void onClickMyAccount() {
		onClickMyAccount.click();
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}

	public String getUrlOfRegisterPage() {
		return urlOfRegisterPage;
	}
}
