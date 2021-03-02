package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TcHp1004 {

	WebDriver driver;

	public TcHp1004(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[1]/a")
	WebElement homePageClickable;
	String urlOfHomePage = "https://www.smartjungle.co.uk/index.php?route=common/home";

	@FindBy(xpath = "//*[@id=\"wishlist-total\"]")
	WebElement wishListClickable;
	String urlOfWishListPage = "https://www.smartjungle.co.uk/index.php?route=account/login";

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[3]/a")
	WebElement myAccountClickable;
	String urlOfMyAccount = "https://www.smartjungle.co.uk/index.php?route=account/login";

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[4]/a")
	WebElement shoppingCartClickable;
	String urlOfShoppingCart = "https://www.smartjungle.co.uk/index.php?route=checkout/cart";

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/ul/li[5]/a")
	WebElement checkOutClickable;
	String urlOfCheckOutPage = "https://www.smartjungle.co.uk/index.php?route=checkout/cart";

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[1]\r\n" + "")
	WebElement checkLogInClickable;
	String urlOfLogInPage = "https://www.smartjungle.co.uk/index.php?route=account/login";

	@FindBy(xpath = "//*[@id=\"welcome\"]/a[2]")
	WebElement checkSignUpClickable;
	String urlOfSignUpPage = "https://www.smartjungle.co.uk/index.php?route=account/register";

	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/div/div/div/ul/li[1]/a")
	WebElement checkHealthSafetyClickable;
	String urlOfHealthAndSafety = "https://www.smartjungle.co.uk/index.php?route=common/home";

	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/div/div/div/ul/li[1]/ul/li/a")
	WebElement checkProtectiveFaceMaskClickable;
	String urlOfProtectiveFaceMask = "https://www.smartjungle.co.uk/health-safety/protective-face-masks";

	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/div/div/div/ul/li[2]/a")
	WebElement checkElectronicsClickable;
	String urlOfElectronics = "https://www.smartjungle.co.uk/index.php?route=common/home";

	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/div/div/div/ul/li[2]/ul/li/a")
	WebElement checkPortableDvdPlayerClickable;
	String urlOfPortableDvdPlayer = "https://www.smartjungle.co.uk/index.php?route=product/category&path=149_172";

	@FindBy(xpath = "//*[@id=\"column-left\"]/div[2]/div[1]")
	WebElement checkSpecialProductClickable;
	String urlOfSpecialProduct = "https://www.smartjungle.co.uk/index.php?route=product/category&path=149_172";

	@FindBy(xpath = "//*[@id=\"search\"]/div[1]")
	WebElement checkContactNoClickable;
	String urlOfContactNo = "https://www.smartjungle.co.uk/index.php?route=product/category&path=149_172";

	@FindBy(xpath = "//*[@id=\"logo\"]/div/font")
	WebElement checkLiveSupportClickable;
	String urlOfLiveSupport = "https://www.smartjungle.co.uk/index.php?route=product/category&path=149_172";

	@FindBy(xpath = "//*[@id=\"currency\"]/a[1]/span")
	WebElement checkEuroClickable;
	String urlOfEuro = "https://www.smartjungle.co.uk/index.php?route=common/home";

	@FindBy(xpath = "//*[@id=\"currency\"]/a[2]/span")
	WebElement checkPoundClickable;
	String urlOfPound = "https://www.smartjungle.co.uk/index.php?route=common/home";

	@FindBy(xpath = "//*[@id=\"currency\"]/a[3]/span")
	WebElement checkUsDollarClickable;
	String urlOfUsDollar = "https://www.smartjungle.co.uk/index.php?route=common/home";

	@FindBy(xpath = "//*[@id=\"logo\"]/a/img")
	WebElement checkSmartJungleLogoClickable;
	String urlOfSmartJungleLogo = "https://www.smartjungle.co.uk/index.php?route=common/home";

	public void checkHomePageClickable() {
		homePageClickable.click();
	}

	public String getUrlOfHomePage() {
		return urlOfHomePage;
	}

	public void checkWishListClickable() {
		wishListClickable.click();
	}

	public String getUrlOfWishListPage() {
		return urlOfWishListPage;
	}

	public void checkMyAccountClickable() {
		myAccountClickable.click();
	}

	public String getUrlOfMyAccount() {
		return urlOfMyAccount;
	}

	public void checkShoppingCartClickable() {
		shoppingCartClickable.click();

	}

	public String getUrlOfShoppingCart() {
		return urlOfShoppingCart;
	}

	public void checkCheckOutClickable() {
		checkOutClickable.click();
	}

	public String geturlOfCheckOutPage() {
		return urlOfCheckOutPage;
	}

	public void checkLogInClickable() {
		checkLogInClickable.click();
	}

	public String getUrlOfLogInPage() {
		return urlOfLogInPage;
	}

	public void checkSignUpClickable() {
		checkSignUpClickable.click();
	}

	public String getUrlOfSignUpPage() {
		return urlOfSignUpPage;
	}

	public void checkHealthSafetyClickable() {
		checkHealthSafetyClickable.click();
	}

	public String getUrlOfHealthAndSafety() {
		return urlOfHealthAndSafety;
	}

	public void checkProtectiveFaceMaskClickable() {
		checkProtectiveFaceMaskClickable.click();
	}

	public String getUrlOfProtectiveFaceMask() {
		return urlOfProtectiveFaceMask;
	}

	public void checkElectronicsClickable() {
		checkElectronicsClickable.click();
	}

	public String getUrlOfElectronics() {
		return urlOfElectronics;
	}

	public void checkPortableDvdPlayerClickable() {
		checkPortableDvdPlayerClickable.click();
	}

	public String getUrlOfPortableDvdPlayer() {
		return urlOfPortableDvdPlayer;
	}

	public void checkSpecialProductClickable() {
		checkSpecialProductClickable.click();
	}

	public String getUrlOfSpecialProduct() {
		return urlOfSpecialProduct;
	}

	public void checkContactNoClickable() {
		checkContactNoClickable.click();
	}

	public String getUrlOfContactNo() {
		return urlOfContactNo;
	}

	public void checkLiveSupportClickable() {
		checkLiveSupportClickable.click();
	}

	public String getUrlOfLiveSupport() {
		return urlOfLiveSupport;
	}

	public void checkEuroClickable() {
		checkEuroClickable.click();
	}

	public String getUrlOfEuro() {
		return urlOfEuro;
	}

	public void checkPoundClickable() {
		checkPoundClickable.click();
	}

	public String getUrlOfPound() {
		return urlOfPound;
	}

	public void checkUsDollarClickable() {
		checkUsDollarClickable.click();
	}

	public String getUrlOfUsDollar() {
		return urlOfUsDollar;
	}

	public void checkSmartJungleLogoClickable() {
		checkSmartJungleLogoClickable.click();
	}

	public String getUrlOfSmartJungleLogo() {
		return urlOfSmartJungleLogo;
	}
}
