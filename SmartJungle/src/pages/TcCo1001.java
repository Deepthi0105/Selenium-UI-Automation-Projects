package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TcCo1001 {
	WebDriver driver;

	public TcCo1001(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[5]/a")
	WebElement onClickCheckOut;

	@FindBy(xpath = "//*[@id=\"payment-address-new\"]")
	WebElement onClickNewAddress;

	@FindBy(xpath = "//*[@id=\"payment-address-existing\"]")
	WebElement OnClickExistingAddress;

	@FindBy(xpath = "//*[@id=\"button-payment-address\"]/span")
	WebElement enterContinueButton;

	@FindBy(xpath = "//*[@id=\"shipping-address-new\"]")
	WebElement onlickNewAddressForDelivery;

	@FindBy(xpath ="//*[@id=\"shipping-address-existing\"]")
	WebElement onClickExistingAddressForDelivery;

	@FindBy(xpath = "//*[@id=\"button-shipping-address\"]/span")
	WebElement enterContinueButtonForDelivery;

	@FindBy(xpath = "//*[@id=\"shipping-method\"]/div[2]/textarea")
	WebElement enterDeliveryMethod;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement goToMyAccount;

	@FindBy(xpath = "//*[@id=\"button-shipping-method\"]/span")
	WebElement enterContinueButtonOfDeliveryMethod;

	@FindBy(xpath = "//*[@id=\"payment-method\"]")
	WebElement onClickPaymentMethod;

	@FindBy(xpath = "//*[@id=\"confirm\"]/div[1]/div")
	WebElement enterConfirmMethod;

	public void onClickCheckOut() {
		onClickCheckOut.click();
	}

	public void onClickNewAddress() {
		onClickNewAddress.click();
	}

	public void OnClickExistingAddress() {
		OnClickExistingAddress.click();
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}

	public void onlickNewAddressForDelivery() {
		onlickNewAddressForDelivery.click();
	}

	public void OnClickExistingAddressForDelivery() {
		onClickExistingAddressForDelivery.click();
	}
	
	public void enterContinueButtonForDelivery() {
		Actions actions = new Actions(driver);
		actions.moveToElement(goToMyAccount).perform();
		enterContinueButtonForDelivery.click();
	}

	public void enterDeliveryMethod() {
		enterDeliveryMethod.sendKeys("Cash On Delivery");
	}

	public void enterContinueButtonOfDeliveryMethod() {
		enterContinueButtonOfDeliveryMethod.click();
	}

	public void onClickPaymentMethod() {
		onClickPaymentMethod.click();
	}

	public void enterConfirmMethod() {
		enterConfirmMethod.click();
	}

}
