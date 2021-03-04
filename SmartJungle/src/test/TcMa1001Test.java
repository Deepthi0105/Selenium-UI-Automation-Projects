package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcMa1001;

public class TcMa1001Test extends BaseTest {
	@Test(priority = 0)

	public void checkMyAccountForNotLoggedInCust() {
		TcMa1001 ma = PageFactory.initElements(driver, TcMa1001.class);
		ma.onClickMyAccount();
	}
	
	@Test(priority = 1)

	public void checkEnterContinueButton() {
		TcMa1001 ma = PageFactory.initElements(driver, TcMa1001.class);
		ma.enterContinueButton();
		String urlFromBrowser=driver.getCurrentUrl();
		String urlOfRegisterPage=ma.getUrlOfRegisterPage();
		Assert.assertEquals(urlFromBrowser, urlOfRegisterPage);
	}
}
