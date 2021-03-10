package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcLp1001;
import pages.TcMa1005;

public class TcMa1005Test extends BaseTest {
	
	private static Logger log = Logger.getLogger(TcMa1005Test.class.getName());
	@Test(priority = 0)
	public void loginpage() throws IOException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();
		log.info("Login Successfull");
	}
	
	@Test(priority = 1)
	public void checkModifyWishList() throws InterruptedException {
		TcMa1005 wl = PageFactory.initElements(driver, TcMa1005.class);
		wl.checkOnClickMaAccount();
		wl.checkOnClickModifyWishList();
		Thread.sleep(2000L);
		wl.checkOnClickDelete();
		Thread.sleep(2000L);
		wl.checkOnClickAddToCart();
		wl.checkEnterContinue();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlAfterEnteringContinue = wl.getUrlAfterEnteringContinue();
		Assert.assertEquals(urlFromBrowser, urlAfterEnteringContinue);
		log.info("Modify Wishlist successful");
	}
}
