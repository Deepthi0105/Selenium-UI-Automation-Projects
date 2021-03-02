package test;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcHp1004;

public class TcHp1004Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcHp1004Test.class.getName());

	@Test(priority = 0)
	public void checkHomePageClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkHomePageClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfHomePage = hp.getUrlOfHomePage();
		Assert.assertEquals(urlFromBrowser, urlOfHomePage);
		log.info("HomePage Clickable complete");
	}

	@Test(priority = 1)
	public void checkWishListClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkWishListClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfWishListPage = hp.getUrlOfWishListPage();
		Assert.assertEquals(urlFromBrowser, urlOfWishListPage);
		log.info("WishList Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void checkMyAccountClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkMyAccountClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfMyAccountPage = hp.getUrlOfMyAccount();
		Assert.assertEquals(urlFromBrowser, urlOfMyAccountPage);
		log.info("MyAccount Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void checkShoppingCartClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkShoppingCartClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfShoppingCart = hp.getUrlOfShoppingCart();
		Assert.assertEquals(urlFromBrowser, urlOfShoppingCart);
		log.info("ShoppingCart Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void checkCheckOutCartClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkCheckOutClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfCheckOutPage = hp.geturlOfCheckOutPage();
		Assert.assertEquals(urlFromBrowser, urlOfCheckOutPage);
		log.info("CheckOut Cart Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 5)
	public void checkLogInClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkLogInClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfLogInPage = hp.getUrlOfLogInPage();
		Assert.assertEquals(urlFromBrowser, urlOfLogInPage);
		log.info("LogIn Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 6)
	public void checkSignUpClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkSignUpClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSignUpPage = hp.getUrlOfSignUpPage();
		Assert.assertEquals(urlFromBrowser, urlOfSignUpPage);
		log.info("SignUp Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void checkHealthSafetyClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkHealthSafetyClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfHealthAndSafety = hp.getUrlOfHealthAndSafety();
		Assert.assertEquals(urlFromBrowser, urlOfHealthAndSafety);
		log.info("Health and Safety Clickable complete");
	}

	@Test(priority = 8)
	public void checkProtectiveFaceMaskClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkProtectiveFaceMaskClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfProtectiveFaceMask = hp.getUrlOfProtectiveFaceMask();
		Assert.assertEquals(urlFromBrowser, urlOfProtectiveFaceMask);
		log.info("Protective Face Mask Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 9)
	public void checkElectronicsClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkElectronicsClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfElectronics = hp.getUrlOfElectronics();
		Assert.assertEquals(urlFromBrowser, urlOfElectronics);
		log.info("Electronics Clickable complete");
	}

	@Test(priority = 10)
	public void checkPortableDvdPlayerClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkPortableDvdPlayerClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfPortableDvdPlayer = hp.getUrlOfPortableDvdPlayer();
		Assert.assertEquals(urlFromBrowser, urlOfPortableDvdPlayer);
		log.info("Portable DVD Player Clickable complete");
		driver.navigate().back();
	}

	@Test(priority = 11)
	public void checkSpecialProductClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkSpecialProductClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfPortableDvdPlayer = hp.getUrlOfPortableDvdPlayer();
		Assert.assertEquals(urlFromBrowser, urlOfPortableDvdPlayer);
		log.info("Special Product Clickable complete");
	}

	@Test(priority = 12)
	public void checkContactNoClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkContactNoClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfContactNo = hp.getUrlOfContactNo();
		Assert.assertEquals(urlFromBrowser, urlOfContactNo);
		log.info("Contact No Clickable complete");
	}

	@Test(priority = 13)
	public void checkLiveSupportClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkLiveSupportClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfLiveSupport = hp.getUrlOfLiveSupport();
		Assert.assertEquals(urlFromBrowser, urlOfLiveSupport);
		log.info("Live Support Clickable complete");
	}

	@Test(priority = 14)
	public void checkEuroClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkEuroClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfEuro = hp.getUrlOfEuro();
		Assert.assertEquals(urlFromBrowser, urlOfEuro);
		log.info("Euro Clickable complete");
	}

	@Test(priority = 15)
	public void checkPoundClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkPoundClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfPound = hp.getUrlOfPound();
		Assert.assertEquals(urlFromBrowser, urlOfPound);
		log.info("Pound Clickable complete");
	}

	@Test(priority = 16)
	public void checkUsDollarClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkUsDollarClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfUsDollar = hp.getUrlOfUsDollar();
		Assert.assertEquals(urlFromBrowser, urlOfUsDollar);
		log.info("Us Dollar Clickable complete");
	}

	@Test(priority = 17)
	public void checkSmartJungleLogoClickable() throws InterruptedException {
		TcHp1004 hp = PageFactory.initElements(driver, TcHp1004.class);
		hp.checkSmartJungleLogoClickable();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSmartJungleLogo = hp.getUrlOfSmartJungleLogo();
		Assert.assertEquals(urlFromBrowser, urlOfSmartJungleLogo);
		log.info("Smart Jungle Logo Clickable complete");
	}
}
