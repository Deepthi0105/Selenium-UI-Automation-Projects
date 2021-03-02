package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcHp1003 {
	WebDriver driver;

	public TcHp1003(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/ul/li[1]/a")
	WebElement clickOnFacebookLink;
	String urlOfFacebook = "https://www.facebook.com/";

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/ul/li[2]/a")
	WebElement clickOnTwitterLink;
	String urlOfTwitter = "https://twitter.com/smartjungleuk";

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/ul/li[3]/a")
	WebElement clickOnGooglePlus;
	String urlOfGooglePlus = "https://plus.google.com/u/0/102697849898560466354/posts";

	public void clickOnFacebookLink() {
		clickOnFacebookLink.click();
	}

	public String getUrlOfFacebook() {
		return urlOfFacebook;
	}

	public void clickOnTwitterLink() {
		clickOnTwitterLink.click();
	}

	public String getUrlOfTwitter() {
		return urlOfTwitter;
	}

	public void clickOnGooglePlus() {
		clickOnGooglePlus.click();
	}

	public String getUrlOfGooglePlus() {
		return urlOfGooglePlus;
	}
}
