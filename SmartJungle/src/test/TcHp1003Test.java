package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcHp1003;

public class TcHp1003Test extends BaseTest {
	
	@Test(priority=0)
	public void checkFacebookClickable() {
		TcHp1003 lchp = PageFactory.initElements(driver, TcHp1003.class);
		lchp.clickOnFacebookLink();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfFaceBook = lchp.getUrlOfFacebook();
		Assert.assertEquals(urlFromBrowser, urlOfFaceBook);
		driver.navigate().back();
	}

	@Test(priority=1)
	public void checkTwitterClickable() {
		TcHp1003 lchp = PageFactory.initElements(driver, TcHp1003.class);
		lchp.clickOnTwitterLink();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfTwitter = lchp.getUrlOfTwitter();
		Assert.assertEquals(urlFromBrowser, urlOfTwitter);
		driver.navigate().back();
	}

	@Test(priority=2)
	public void checkGooglePlusClickable() {
		TcHp1003 lchp = PageFactory.initElements(driver, TcHp1003.class);
		lchp.clickOnGooglePlus();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfGooglePlus = lchp.getUrlOfGooglePlus();
		Assert.assertEquals(urlFromBrowser, urlOfGooglePlus);
	}
}
