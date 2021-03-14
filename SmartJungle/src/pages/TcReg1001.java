package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.ExcelDataOperations;

public class TcReg1001 {
	WebDriver driver;

	public TcReg1001(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[2]")
	WebElement signUpPage;
	String urlOfSignUpPage = "https://www.smartjungle.co.uk/index.php?route=account/register";

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
	String urlOfAccountCreated = "https://www.smartjungle.co.uk/index.php?route=account/success";

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement account;

	public void onClickSignUpPage() {
		signUpPage.click();
	}

	public String getUrlOfSignUpPage() {
		return urlOfSignUpPage;
	}

	public void enterFirstName() throws IOException {
		firstName.sendKeys(ExcelDataOperations.readExcel(0, 1, "RegisterPage"));
	}

	public void enterLastName() throws IOException {
		lastName.sendKeys(ExcelDataOperations.readExcel(1, 1, "RegisterPage"));
	}

	public void enterEmailId() throws IOException {
		emailId.sendKeys(ExcelDataOperations.readExcel(2, 1, "RegisterPage"));

	}

	public void enterTelephoneNo() throws IOException {
		telephone.sendKeys(ExcelDataOperations.readExcel(3, 1, "RegisterPage"));
	}

	public void enterfax() throws IOException {
		fax.sendKeys(ExcelDataOperations.readExcel(4, 1, "RegisterPage"));
	}

	public void enterCompanyName() throws IOException {
		companyName.sendKeys(ExcelDataOperations.readExcel(5, 1, "RegisterPage"));

	}

	public void enterAddressOne() throws IOException {
		addressOne.sendKeys(ExcelDataOperations.readExcel(6, 1, "RegisterPage"));
	}

	public void enterAddressTwo() throws IOException {
		addressTwo.sendKeys(ExcelDataOperations.readExcel(7, 1, "RegisterPage"));
	}

	public void enterCity() throws IOException {
		city.sendKeys(ExcelDataOperations.readExcel(8, 1, "RegisterPage"));
	}

	public void enterPostalCode() throws IOException {
		postalCode.sendKeys(ExcelDataOperations.readExcel(9, 1, "RegisterPage"));
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

	public void enterPassword() throws IOException {
		enterPassword.sendKeys(ExcelDataOperations.readExcel(10, 1, "RegisterPage"));
	}

	public void enterConfirmPassword() throws IOException {
		enterConfirmPassword.sendKeys(ExcelDataOperations.readExcel(11, 1, "RegisterPage"));
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

	public String getUrlOfAccountCreated() {
		return urlOfAccountCreated;
	}
}
