package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TcReg1001;

public class TcReg1001Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcReg1001Test.class.getName());

	@Test
	public void newregister() throws InterruptedException, IOException {
		TcReg1001 nr = PageFactory.initElements(driver, TcReg1001.class);
		nr.onClickSignUpPage();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSignUpPage = nr.getUrlOfSignUpPage();
		Assert.assertEquals(urlFromBrowser, urlOfSignUpPage);
		Thread.sleep(1000L);
		nr.enterFirstName();
		nr.enterLastName();
		nr.enterEmailId();
		nr.enterTelephoneNo();
		nr.enterfax();
		nr.enterCompanyName();
		nr.enterAddressOne();
		nr.enterAddressTwo();
		nr.enterCity();
		nr.enterPostalCode();
		nr.enterCountry();
		Thread.sleep(2000L);
		nr.enterRegion();
		nr.enterPassword();
		nr.enterConfirmPassword();
		Thread.sleep(2000L);
		nr.onClickSubscribe();
		Thread.sleep(2000L);
		nr.clickOnPrivacyPolicy();
		Thread.sleep(2000L);
		nr.enterContinue();
		String urlFromBowserAgain = driver.getCurrentUrl();
		String urlOfAccountCreated = nr.getUrlOfAccountCreated();
		Assert.assertEquals(urlFromBowserAgain, urlOfAccountCreated);
		log.info("Account created complete");
	}
}