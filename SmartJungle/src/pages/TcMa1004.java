
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TcMa1004 {

	WebDriver driver;

	public TcMa1004(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[3]/a")
	WebElement onClickMyAccount;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/ul/li[3]/a")
	WebElement onClickModifyAddressBook;
	String urlOfModifyAddressBook = "https://www.smartjungle.co.uk/index.php?route=account/address";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/table/tbody/tr/td[2]/a[1]/span")
	WebElement onClickEdit;

	@FindBy(name = "firstname")
	WebElement enterFirstName;

	@FindBy(name = "lastname")
	WebElement enterLastName;

	@FindBy(name = "company")
	WebElement enterCompany;

	@FindBy(name = "address_1")
	WebElement enterAddress1;

	@FindBy(name = "address_2")
	WebElement enterAddress2;

	@FindBy(name = "city")
	WebElement enterCity;

	@FindBy(name = "postcode")
	WebElement enterPostalCode;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[8]/td[2]/select")
	WebElement enterCountry;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[9]/td[2]/select")
	WebElement enterRegion;

	@FindBy(name = "default")
	WebElement onClickYes;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement goToAccount;

	@FindBy(xpath = "//*[@id=\"address\"]/div[2]/div[2]/a/span")
	WebElement enterContinue;
	String urlAfterEnteringContinue = "https://www.smartjungle.co.uk/index.php?route=account/address";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[2]/a/span")
	WebElement onClickNewAddress;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[1]/td[2]/input")
	WebElement enterFirstNameForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[2]/td[2]/input")
	WebElement enterLastNameForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[3]/td[2]/input")
	WebElement enterCompanyForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[4]/td[2]/input")
	WebElement enterAddress1ForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[5]/td[2]/input")
	WebElement enterAddress2ForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[6]/td[2]/input")
	WebElement enterCityForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[7]/td[2]/input")
	WebElement enterPostalCodeForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[8]/td[2]/select")
	WebElement enterCountryNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[9]/td[2]/select")
	WebElement enterRegionForNewAdd;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[8]/td[2]/select")
	WebElement enterNoForDefaultNewAdd;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement goToMyAccount;

	@FindBy(xpath = "//*[@id=\"address\"]/div[2]/div[2]/a/span")
	WebElement enterContinueForNewAdd;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/a/span")
	WebElement onClickNewAddressToCheckBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[1]/td[2]/input")
	WebElement enterFirstNameWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[2]/td[2]/input")
	WebElement enterLastNameWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[3]/td[2]/input")
	WebElement enterCompanyWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[4]/td[2]/input")
	WebElement enterAddress1WithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[5]/td[2]/input")
	WebElement enterAddress2WithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[6]/td[2]/input")
	WebElement enterCityWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[7]/td[2]/input")
	WebElement enterPostalCodeWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[8]/td[2]/select")
	WebElement enterCountryWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[9]/td[2]/select")
	WebElement enterRegionWithBlankDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[8]/td[2]/select")
	WebElement enterNoForDefault;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement scrollToMyAccount;

	@FindBy(xpath = "//*[@id=\"address\"]/div[2]/div[2]/a/span")
	WebElement enterContinueWithBlankDetails;
	String urlAfterContinueWithBlankDetails = "https://www.smartjungle.co.uk/index.php?route=account/address/insert";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/a/span")
	WebElement onClickNewAddressToCheckInvalidDetails;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[1]/td[2]/input")
	WebElement enterInvalidFirstName;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[2]/td[2]/input")
	WebElement enterInvalidLastName;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[3]/td[2]/input")
	WebElement enterInvalidCompany;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[4]/td[2]/input")
	WebElement enterInvalidAddress1;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[5]/td[2]/input")
	WebElement enterInvalidAddress2;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[6]/td[2]/input")
	WebElement enterInvalidCity;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[7]/td[2]/input")
	WebElement enterInvalidPostalCode;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[8]/td[2]/select")
	WebElement enterAnyCountry;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[9]/td[2]/select")
	WebElement enterDifferentRegion;

	@FindBy(xpath = "//*[@id=\"address\"]/div[1]/table/tbody/tr[9]/td[2]/select")
	WebElement enterNoForDefaultAdd;

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[4]/ul/li[1]/a")
	WebElement scrollToMyAccountAgain;

	@FindBy(xpath = "//*[@id=\"address\"]/div[2]/div[2]/a/span")
	WebElement enterContinueForInvalidDetails;
	String urlAfterContinueForInvalidDetails = "https://www.smartjungle.co.uk/index.php?route=account/address/insert";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/table/tbody/tr/td[2]/a[2]/span")
	WebElement onClickDelete;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[1]/a/span")
	WebElement onClickBack;

	public void onClickMyAccount() {
		onClickMyAccount.click();
	}

	public void onClickModifyAddressBook() {
		onClickModifyAddressBook.click();
	}

	public String getUrlOfModifyAddressBook() {
		return urlOfModifyAddressBook;
	}

	public void onClickEdit() {
		onClickEdit.click();
	}

	public void enterFirstName() {
		enterFirstName.sendKeys("i");
	}

	public void enterLastName() {
		enterLastName.sendKeys("y");
	}

	public void enterCompany() {
		enterCompany.sendKeys(" Builders");
	}

	public void enterAddress1() {
		enterAddress1.sendKeys(" Hampankatta");
	}

	public void enterAddress2() {
		enterAddress2.sendKeys(" Road");
	}

	public void enterCity() {
		enterCity.sendKeys("e");
	}

	public void enterPostalCode() {
		enterPostalCode.sendKeys("6");
	}

	public void enterCountry() {
		Select country = new Select(enterCountry);
		country.selectByVisibleText("India");
	}

	public void enterRegion() {
		Select region = new Select(enterRegion);
		region.selectByVisibleText("Andhra Pradesh");
	}

	public void onClickYes() {
		onClickYes.click();
	}

	public void enterContinue() {
		Actions actions = new Actions(driver);
		actions.moveToElement(goToAccount).perform();
		enterContinue.click();
	}

	public String getUrlAfterEnteringContinue() {
		return urlAfterEnteringContinue;
	}

	public void onClickNewAddress() {
		onClickNewAddress.click();
	}

	public void enterFirstNameForNewAdd() {
		enterFirstNameForNewAdd.sendKeys("Deepali");
	}

	public void enterLastNameForNewAdd() {
		enterLastNameForNewAdd.sendKeys("Shet");
	}

	public void enterCompanyForNewAdd() {
		enterCompanyForNewAdd.sendKeys(" Amazon");
	}

	public void enterAddress1ForNewAdd() {
		enterAddress1ForNewAdd.sendKeys(" Mg Road");
	}

	public void enterAddress2ForNewAdd() {
		enterAddress2ForNewAdd.sendKeys(" 4th cross");
	}

	public void enterCityForNewAdd() {
		enterCityForNewAdd.sendKeys("Moodbidri");
	}

	public void enterPostalCodeForNewAdd() {
		enterPostalCodeForNewAdd.sendKeys("575 008");
	}

	public void enterCountryForNewAdd() {
		Select country = new Select(enterCountryNewAdd);
		country.selectByVisibleText("India");
	}

	public void enterRegionForNewAdd() {
		Select region = new Select(enterRegionForNewAdd);
		region.selectByVisibleText("Andhra Pradesh");
	}

	public void enterNoForDefaultNewAdd() {
		enterNoForDefaultNewAdd.click();
	}

	public void enterContinueForNewAdd() {
		Actions actions = new Actions(driver);
		actions.moveToElement(goToAccount).perform();
		enterContinueForNewAdd.click();
	}

	public void onClickNewAddressToCheckBlankDetails() {
		onClickNewAddressToCheckBlankDetails.click();
	}

	public void enterFirstNameWithBlankDetails() {
		enterFirstNameWithBlankDetails.sendKeys("");
	}

	public void enterLastNameWithBlankDetails() {
		enterLastNameWithBlankDetails.sendKeys("");
	}

	public void enterCompanyWithBlankDetails() {
		enterCompanyWithBlankDetails.sendKeys(" ");
	}

	public void enterAddress1WithBlankDetails() {
		enterAddress1WithBlankDetails.sendKeys(" ");
	}

	public void enterAddress2WithBlankDetails() {
		enterAddress2WithBlankDetails.sendKeys(" ");
	}

	public void enterCityWithBlankDetails() {
		enterCityWithBlankDetails.sendKeys("");
	}

	public void enterPostalCodeWithBlankDetails() {
		enterPostalCodeWithBlankDetails.sendKeys("");
	}

	public void enterCountryWithBlankDetails() {
		Select country = new Select(enterCountryWithBlankDetails);
		country.selectByVisibleText(" --- Please Select --- ");
	}

	public void enterRegionWithBlankDetails() {
		Select region = new Select(enterRegionWithBlankDetails);
		region.selectByVisibleText(" --- Please Select --- ");
	}

	public void enterNoForDefault() {
		enterNoForDefault.click();
	}

	public void enterContinueWithBlankDetails() {
		Actions actions = new Actions(driver);
		actions.moveToElement(scrollToMyAccount).perform();
		enterContinueWithBlankDetails.click();
		driver.navigate().back();
	}

	public String getUrlAfterContinueWithBlankDetails() {
		return urlAfterContinueWithBlankDetails;
	}

	public void onClickNewAddressToCheckInvalidDetails() {
		onClickNewAddressToCheckInvalidDetails.click();
	}

	public void enterInvalidFirstName() {
		enterInvalidFirstName.sendKeys("Abc");
	}

	public void enterInvalidLastName() {
		enterInvalidLastName.sendKeys("xyz");
	}

	public void enterInvalidCompany() {
		enterInvalidCompany.sendKeys("jjkk ");
	}

	public void enterInvalidAddress1() {
		enterInvalidAddress1.sendKeys("kjhgh ");
	}

	public void enterInvalidAddress2() {
		enterInvalidAddress2.sendKeys(" jhjkk");
	}

	public void enterInvalidCity() {
		enterInvalidCity.sendKeys("hhjj");
	}

	public void enterInvalidPostalCode() {
		enterInvalidPostalCode.sendKeys("kkk445");
	}

	public void enterAnyCountry() {
		Select country = new Select(enterAnyCountry);
		country.selectByVisibleText("India");
	}

	public void enterDifferentRegion() {
		Select region = new Select(enterDifferentRegion);
		region.selectByVisibleText("Bihar");
	}

	public void enterNoForDefaultAdd() {
		enterNoForDefaultAdd.click();
	}

	public void enterContinueForInvalidDetails() {
		Actions actions = new Actions(driver);
		actions.moveToElement(scrollToMyAccountAgain).perform();
		enterContinueForInvalidDetails.click();
	}

	public String getUrlAfterContinueForInvalidDetails() {
		return urlAfterContinueForInvalidDetails;
	}

	public void checkOnClickDelete() {
		onClickDelete.click();
	}

	public void checkOnClickBack() {
		onClickBack.click();
	}
}
