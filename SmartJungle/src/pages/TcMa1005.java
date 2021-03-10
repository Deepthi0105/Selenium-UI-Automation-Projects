package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcMa1005 {
	WebDriver driver;

	public TcMa1005(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[3]/a")
	WebElement onClickMaAccount;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/ul/li[4]/a")
	WebElement onClickModifyWishList;

	@FindBy(xpath = "//*[@id=\"wishlist-row984\"]/tr/td[1]/a/img")
	WebElement onClickDelete;

	@FindBy(xpath = "//*[@id=\"wishlist-row983\"]/tr/td[7]/a/span")
	WebElement onClickAddToCart;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/a/span")
	WebElement enterContinue;
	String urlAfterEnteringContinue = "https://www.smartjungle.co.uk/index.php?route=account/account";

	public void checkOnClickMaAccount() {
		onClickMaAccount.click();
	}

	public void checkOnClickModifyWishList() {
		onClickModifyWishList.click();
	}

	public void checkOnClickDelete() {
		onClickDelete.click();
	}

	public void checkOnClickAddToCart() {
		onClickAddToCart.click();
	}

	public void checkEnterContinue() {
		enterContinue.click();
	}

	public String getUrlAfterEnteringContinue() {
		return urlAfterEnteringContinue;

	}
}
