package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcHp1006;

public class TcHp1006Test extends BaseTest {
	@Test(priority = 0)
	public void checkInvalidDataInSearchTab() {
		TcHp1006 hp = PageFactory.initElements(driver, TcHp1006.class);
		hp.enterInSearchTab();
		hp.clickOnSearchIcon();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSearchIcon = hp.getUrlOfSearchIcon();
		Assert.assertEquals(urlFromBrowser, urlOfSearchIcon);
		
	}

	@Test(priority = 1)
	public void chechInvalidDataInSearchPage() throws InterruptedException {
		TcHp1006 hp = PageFactory.initElements(driver, TcHp1006.class);
		Thread.sleep(3000L);
		hp.enterInSearchPage();
	}

	@Test(priority = 2)
	public void checkNonRelatedSelectCategories() {
		TcHp1006 hp = PageFactory.initElements(driver, TcHp1006.class);
		hp.selectCategories();
	}
	
	@Test(priority = 3)
	public void checkSearchButton() throws InterruptedException {
		TcHp1006 hp = PageFactory.initElements(driver, TcHp1006.class);
		Thread.sleep(3000L);
		hp.enterSearchButton();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSearchButton = hp.getUrlOfSearchButton();
		Assert.assertEquals(urlFromBrowser, urlOfSearchButton);
	}
}


