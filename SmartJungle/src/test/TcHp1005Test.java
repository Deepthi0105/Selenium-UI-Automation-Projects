package test;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcHp1005;

public class TcHp1005Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcHp1005Test.class.getName());

	@Test(priority = 0)
	public void checkValidDataInSearchTab() {
		TcHp1005 hp = PageFactory.initElements(driver, TcHp1005.class);
		hp.enterInSearchTab();
		hp.clickOnSearchIcon();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSearchIcon = hp.getUrlOfSearchIcon();
		Assert.assertEquals(urlFromBrowser, urlOfSearchIcon);
		log.info("Valid Data in Search Tab Complete");

	}

	@Test(priority = 1)
	public void checkValidDataInSearchPage() throws InterruptedException {
		TcHp1005 hp = PageFactory.initElements(driver, TcHp1005.class);
		Thread.sleep(3000L);
		hp.enterInSearchPage();
		log.info("Valid Data in Search Page Complete");
	}

	@Test(priority = 2)
	public void checkSelectRelatedCategories() {
		TcHp1005 hp = PageFactory.initElements(driver, TcHp1005.class);
		hp.selectCategories();
		log.info("Select Related Categories Complete");
	}

	@Test(priority = 3)
	public void checkSelectSubCategory() {
		TcHp1005 hp = PageFactory.initElements(driver, TcHp1005.class);
		hp.selectSubCategory();
		log.info("Select Sub Categories Complete");
	}

	@Test(priority = 4)
	public void checkSelectProductDescription() throws InterruptedException {
		TcHp1005 hp = PageFactory.initElements(driver, TcHp1005.class);
		hp.selectProductDescription();
		log.info("Select Product Description Complete");
	}

	@Test(priority = 5)
	public void checkSearchButton() throws InterruptedException {
		TcHp1005 hp = PageFactory.initElements(driver, TcHp1005.class);
		Thread.sleep(3000L);
		hp.enterSearchButton();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSearchButton = hp.getUrlOfSearchButton();
		Assert.assertEquals(urlFromBrowser, urlOfSearchButton);
		log.info("Search button Clickable Complete");
	}
}
