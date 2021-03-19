package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcReg1002;

public class TcReg1002Test extends BaseTest {

	private static Logger log = Logger.getLogger(TcReg1001Test.class.getName());

	@Test

	public void registerinvalid() throws InterruptedException, IOException {
		TcReg1002 ri = PageFactory.initElements(driver, TcReg1002.class);
		ri.onClickSignUpPage();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfSignUpPage = ri.getUrlOfSignUpPage();
		Assert.assertEquals(urlFromBrowser, urlOfSignUpPage);
		ri.enterFirstName();
		ri.enterLastName();
		ri.enterEmailId();
		ri.enterTelephoneNo();
		ri.enterfax();
		ri.enterCompanyName();
		ri.enterAddressOne();
		ri.enterAddressTwo();
		ri.enterCity();
		ri.enterPostalCode();
		ri.enterCountry();
		Thread.sleep(2000L);
		ri.enterRegion();
		ri.enterPassword();
		ri.enterConfirmPassword();
		Thread.sleep(3000L);
		ri.onClickSubscribe();
		Thread.sleep(2000L);
		ri.clickOnPrivacyPolicy();
		Thread.sleep(2000L);
		ri.enterContinue();
		String urlFromBowserAgain = driver.getCurrentUrl();
		String urlAfterContinue = ri.getUrlAfterContinue();
		Assert.assertEquals(urlFromBowserAgain, urlAfterContinue);
		log.info("Account not created complete");
	}
}
