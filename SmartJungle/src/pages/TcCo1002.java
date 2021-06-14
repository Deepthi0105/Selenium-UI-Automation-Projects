package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcCo1002 {
	WebDriver driver;

	public TcCo1002(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[5]/a")
	WebElement onClickCheckOut;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/a/span")
	WebElement enterContinueButton;

	@FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div/ul/li[3]/div/div[5]/a/span")
	WebElement enterAddToCart;

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[5]/a")
	WebElement onClickCheckOutAgain;

	@FindBy(id = "register")
	WebElement onClickRegisterAccount;

	@FindBy(xpath = "//*[@id=\"button-account\"]/span")
	WebElement enterContinueButtonForRegister;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]/div[1]/a")
	WebElement onClickModify;

	@FindBy(id = "guest")
	WebElement onClickGuestCheckOut;

	@FindBy(xpath = "//*[@id=\"button-account\"]/span")
	WebElement enterContinueButtonForGuestCheckOut;

	public void onClickCheckOut() {
		onClickCheckOut.click();
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}

	public void enterAddToCart() {
		enterAddToCart.click();
	}

	public void onClickCheckOutAgain() {
		onClickCheckOutAgain.click();
	}

	public void onClickRegisterAccount() {
		onClickRegisterAccount.click();
	}

	public void enterContinueButtonForRegister() {
		enterContinueButtonForRegister.click();
	}
	public void onClickModify() {
		onClickModify.click();
	}

	public void onClickGuestCheckOut() {
		onClickGuestCheckOut.click();
	}

	public void enterContinueButtonForGuestCheckOut() {
		enterContinueButtonForGuestCheckOut.click();
	}
}
