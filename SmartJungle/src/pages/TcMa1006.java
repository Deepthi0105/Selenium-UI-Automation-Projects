package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcMa1006 {
	WebDriver driver;

	public TcMa1006(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/ul/li[1]/a")
	WebElement onClickOrderHistory;
	String urlOfOrderHistory = "https://www.smartjungle.co.uk/index.php?route=account/order";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/ul/li[2]/a")
	WebElement onClickDownloads;
	String urlOfDownoads = "https://www.smartjungle.co.uk/index.php?route=account/download";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/ul/li[3]/a")
	WebElement onClickYourRewards;
	String urlOfYourRewards = "https://www.smartjungle.co.uk/index.php?route=account/reward";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/ul/li[4]/a")
	WebElement onClickYourReturnRequest;
	String urlOfYourReturnRequest = "https://www.smartjungle.co.uk/index.php?route=account/return";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/ul/li[5]/a")
	WebElement onClickTranscations;
	String urlOfTranscations = "https://www.smartjungle.co.uk/index.php?route=account/transaction";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/ul/li/a")
	WebElement onClickNewsletter;
	String urlOfNewLetter = "https://www.smartjungle.co.uk/index.php?route=account/newsletter";

	@FindBy(name = "newsletter")
	WebElement onClickYesOrNoSubscribe;

	@FindBy(xpath = "//*[@id=\"newsletter\"]/div[2]/div[2]/a/span")
	WebElement enterContinue;
	String urlAfterContinue = "https://www.smartjungle.co.uk/index.php?route=account/account";

	public void onClickOrderHistory() {
		onClickOrderHistory.click();
	}

	public String getUrlOfOrderHistory() {
		return urlOfOrderHistory;
	}

	public void onClickDownloads() {
		driver.navigate().back();
		onClickDownloads.click();
	}

	public String getUrlOfDownoads() {
		return urlOfDownoads;
	}

	public void onClickYourRewards() {
		driver.navigate().back();
		onClickYourRewards.click();
	}

	public String getUrlOfYourRewards() {
		return urlOfYourRewards;
	}

	public void onClickYourReturnRequest() {
		driver.navigate().back();
		onClickYourReturnRequest.click();
	}

	public String getUrlOfYourReturnRequest() {
		return urlOfYourReturnRequest;
	}

	public void onClickTranscations() {
		driver.navigate().back();
		onClickTranscations.click();
	}

	public String getUrlOfTranscations() {
		return urlOfTranscations;
	}

	public void onClickNewsletter() {
		driver.navigate().back();
		onClickNewsletter.click();
	}

	public String getUrlOfNewLetter() {
		return urlOfNewLetter;
	}

	public void onClickYesOrNoSubscribe() {
		onClickYesOrNoSubscribe.click();
	}

	public void enterContinue() {
		enterContinue.click();
	}

	public String getUrlAfterContinue() {
		return urlAfterContinue;
	}
}
