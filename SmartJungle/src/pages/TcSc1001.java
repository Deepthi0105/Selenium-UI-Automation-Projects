package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcSc1001 {
	WebDriver driver;

	public TcSc1001(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[4]/a")
	WebElement onClickShoppingCart;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/a/span")
	WebElement enterContinueBtn;

	@FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div/ul/li[3]/div/div[5]/a/span")
	WebElement clickAddToCart;

	@FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div/ul/li[4]/div/div[5]/a/span")
	WebElement clickAddToCart2;

	@FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div/ul/li[5]/div/div[5]/a/span")
	WebElement clickAddToCart3;

	@FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div/ul/li[1]/div/div[5]/a/span")
	WebElement clickAddToCartSameItem;

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[4]/a")
	WebElement onClickShoppingCartAgain;

	@FindBy(name = "quantity[988]")
	WebElement increaseQuantity;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/table/tbody/tr/td[4]/input[2]")
	WebElement clickOnRefresh;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/table/tbody/tr/td[4]/a/img")
	WebElement clickOnDelete;

	@FindBy(name = "next")
	WebElement clickOnCouponCode;

	@FindBy(name = "coupon")
	WebElement enterCouponCode;

	@FindBy(xpath = "//*[@id=\"coup\"]/a/span")
	WebElement clickOnApply;

	@FindBy(xpath = "//*[@id=\"content\"]/div[5]/div[2]/div[1]/a/span")
	WebElement enterCheckOut;

	public void onClickShoppingCart() {
		onClickShoppingCart.click();
	}

	public void enterContinueBtn() {
		enterContinueBtn.click();
	}

	public void clickAddToCart() {
		clickAddToCart.click();
	}

	public void clickAddToCart2() {
		clickAddToCart2.click();
	}

	public void clickAddToCart3() {
		clickAddToCart3.click();
	}

	public void clickAddToCartSameItem() {
		clickAddToCartSameItem.click();
	}

	public void onClickShoppingCartAgain() {
		onClickShoppingCartAgain.click();
	}

	public void increaseQuantity() {
		increaseQuantity.clear();
		increaseQuantity.sendKeys("10");
	}

	public void clickOnRefresh() {
		clickOnRefresh.click();
	}

	public void clickOnDelete() {
		clickOnDelete.click();
	}

	public void clickOnCouponCode() {
		clickOnCouponCode.click();
	}

	public void enterCouponCode() {
		enterCouponCode.sendKeys("Deep");
	}

	public void clickOnApply() {
		clickOnApply.click();
	}

	public void enterCheckOut() {
		enterCheckOut.click();
	}
}
