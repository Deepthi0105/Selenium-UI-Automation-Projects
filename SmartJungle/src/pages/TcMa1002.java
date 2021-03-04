package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcMa1002 {
	WebDriver driver;

	public TcMa1002(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[3]/a")
	WebElement onClickAccount;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/ul/li[1]/a")
	WebElement onClickEditInfo;
	String urlOfEditInfo="https://www.smartjungle.co.uk/index.php?route=account/edit";

	@FindBy(xpath = "//*[@id=\"edit\"]/div[1]/table/tbody/tr[1]/td[2]/input")
	WebElement editFirstName;

	@FindBy(name = "lastname")
	WebElement editLastName;

	@FindBy(name = "email")
	WebElement editEmail;

	@FindBy(name = "telephone")
	WebElement editTelephone;

	@FindBy(name = "fax")
	WebElement editFax;

	@FindBy(xpath = "//*[@id=\"edit\"]/div[2]/div[2]/a/span")
	WebElement enterContinueButton;
	String urlOfContinue="https://www.smartjungle.co.uk/index.php?route=account/account";

	public void onClickAccount() {
		onClickAccount.click();
	}

	public void onClickEditInfo() {
		onClickEditInfo.click();
	}
	
	public String getUrlOfEditInfo() {
		return urlOfEditInfo;
	}

	public void editFirstName() {
		editFirstName.sendKeys("i");
	}

	public void editLastName() {
		editLastName.sendKeys("y");
	}

	public void editEmail() {
		editEmail.clear();
		editEmail.sendKeys("deepthitesting0105@gmail.com");
	}

	public void editTelephone() {
		editTelephone.sendKeys("6");
	}

	public void editFax(String enteredPWD) {
		editFax.sendKeys(enteredPWD);
	}

	public void enterContinueButton() {
		enterContinueButton.click();
	}
	
	public String getUrlOfContinue() {
		return urlOfContinue;
	}
}
