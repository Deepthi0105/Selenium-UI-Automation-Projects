package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TcReg1004 {
	WebDriver driver;

	public TcReg1004(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[2]")
	WebElement signUpLink;

	@FindBy(name = "firstname")
	WebElement firstName;

	@FindBy(name = "lastname")
	WebElement lastName;

	@FindBy(name = "email")
	WebElement emailId;

	@FindBy(name = "telephone")
	WebElement telephone;

	@FindBy(name = "fax")
	WebElement fax;

	@FindBy(name = "company")
	WebElement companyName;

	@FindBy(name = "address_1")
	WebElement addressOne;

	@FindBy(name = "address_2")
	WebElement addressTwo;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "postcode")
	WebElement postalCode;

	@FindBy(name = "country_id")
	WebElement selectCountry;

	@FindBy(name = "zone_id")
	WebElement selectRegion;

	@FindBy(name = "password")
	WebElement enterPassword;

	@FindBy(name = "confirm")
	WebElement enterConfirmPassword;

	@FindBy(name = "newsletter")
	WebElement subscribe;

	@FindBy(xpath = "//*[@id=\"register\"]/div[5]/div/input")
	WebElement clickOnPrivacyPolicy;

	@FindBy(xpath = "//*[@id=\"register\"]/div[5]/div/a[2]/span")
	WebElement enterContinue;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement account;

	public void onClickSignUpLink() {
		signUpLink.click();
	}

	public void enterFirstName() {
		firstName.sendKeys("Deepthi");
	}

	public void enterLastName() {
		lastName.sendKeys("Shetty");
	}

	public void enterEmailId() {
		emailId.sendKeys("Deepthis0105@gmail.com");

	}

	public void enterTelephoneNo() {
		telephone.sendKeys("7353921204");
	}

	public void enterfax() {
		fax.sendKeys("08242441");
	}

	public void enterCompanyName() {
		companyName.sendKeys("LandTrades");

	}

	public void enterAddressOne() {
		addressOne.sendKeys("Milagres");
	}

	public void enterAddressTwo() {
		addressTwo.sendKeys("Falnir");
	}

	public void enterCity() {
		city.sendKeys("Mangalore");
	}

	public void enterPostalCode() {
		postalCode.sendKeys("575001");

	}

	public void enterCountry() {

		Select country = new Select(selectCountry);
		country.selectByVisibleText("India");
	}

	public void enterRegion() {
		Select region = new Select(selectRegion);
		System.out.println("Hi");
		System.out.println(region);
		region.selectByVisibleText("Karnataka");
	}

	public void enterPassword() {
		enterPassword.sendKeys("Deeps123*");
	}

	public void enterConfirmPassword() {
		enterConfirmPassword.sendKeys("Deeps123*");
	}

	public void onClickSubscribe() {

		Actions actions = new Actions(driver);
		actions.moveToElement(subscribe).click().perform();
	}

	public void clickOnPrivacyPolicy() {
		Actions actions = new Actions(driver);
		actions.moveToElement(account).perform();
		clickOnPrivacyPolicy.click();
	}

	public void enterContinue() {
		Actions actions = new Actions(driver);
		actions.moveToElement(account).perform();
		enterContinue.click();
	}
}
