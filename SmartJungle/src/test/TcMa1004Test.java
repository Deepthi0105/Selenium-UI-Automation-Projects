package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcLp1001;
import pages.TcMa1004;

public class TcMa1004Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcMa1004Test.class.getName());

	@Test(priority = 0)
	public void loginpage() throws IOException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();
		log.info("Login complete");
	}

	@Test(priority = 1)
	public void checkModifyAddressBook() throws InterruptedException {
		TcMa1004 ma = PageFactory.initElements(driver, TcMa1004.class);
		ma.onClickMyAccount();
		ma.onClickModifyAddressBook();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlAfterEnteringContinue = ma.getUrlAfterEnteringContinue();
		Assert.assertEquals(urlFromBrowser, urlAfterEnteringContinue);
		ma.onClickEdit();
		ma.enterFirstName();
		ma.enterLastName();
		ma.enterCompany();
		ma.enterAddress1();
		ma.enterAddress2();
		ma.enterCity();
		ma.enterPostalCode();
		ma.enterCountry();
		ma.enterRegion();
		ma.onClickYes();
		Thread.sleep(5000L);
		ma.enterContinue();
		String urlFromBrowserAfterContinue = driver.getCurrentUrl();
		String urlAfterEnteringContinue1 = ma.getUrlAfterEnteringContinue();
		Assert.assertEquals(urlFromBrowserAfterContinue, urlAfterEnteringContinue1);
		log.info("Modify Address Complete");
	}

	@Test(priority = 2)
	public void checkAddNewAddress() throws InterruptedException {
		TcMa1004 ma = PageFactory.initElements(driver, TcMa1004.class);
		ma.onClickNewAddress();
		ma.enterFirstNameForNewAdd();
		ma.enterLastNameForNewAdd();
		ma.enterCompanyForNewAdd();
		ma.enterAddress1ForNewAdd();
		ma.enterAddress2ForNewAdd();
		ma.enterCityForNewAdd();
		ma.enterPostalCodeForNewAdd();
		ma.enterCountryForNewAdd();
		Thread.sleep(2000L);
		ma.enterRegionForNewAdd();
		ma.enterNoForDefaultNewAdd();
		ma.enterContinueForNewAdd();
		log.info("New Address added successfully");
	}

	@Test(priority = 3)
	public void checkAddNewAddressWithBlankDetails() throws InterruptedException {
		TcMa1004 ma = PageFactory.initElements(driver, TcMa1004.class);
		ma.onClickMyAccount();
		ma.onClickModifyAddressBook();
		ma.onClickNewAddressToCheckBlankDetails();
		ma.enterLastNameWithBlankDetails();
		ma.enterLastNameWithBlankDetails();
		ma.enterCompanyWithBlankDetails();
		ma.enterAddress1WithBlankDetails();
		ma.enterAddress2WithBlankDetails();
		ma.enterCityWithBlankDetails();
		ma.enterPostalCodeWithBlankDetails();
		ma.enterCountryWithBlankDetails();
		Thread.sleep(2000L);
		ma.enterRegionWithBlankDetails();
		ma.enterNoForDefault();
		ma.enterContinueWithBlankDetails();
		String getUrlFromBowserForBlankDetails = driver.getCurrentUrl();
		String urlAfterContinueWithBlankDetails = ma.getUrlAfterContinueWithBlankDetails();
		Assert.assertEquals(getUrlFromBowserForBlankDetails, urlAfterContinueWithBlankDetails);
		log.info("New Address with blank details complete");
	}

	@Test(priority = 4)
	public void checkAddNewAddressWithInvalidDetails() throws InterruptedException {
		TcMa1004 ma = PageFactory.initElements(driver, TcMa1004.class);
		ma.onClickMyAccount();
		ma.onClickModifyAddressBook();
		ma.onClickNewAddressToCheckInvalidDetails();
		ma.enterInvalidFirstName();
		ma.enterInvalidLastName();
		ma.enterInvalidCompany();
		ma.enterInvalidAddress1();
		ma.enterInvalidAddress2();
		ma.enterInvalidCity();
		ma.enterInvalidPostalCode();
		ma.enterAnyCountry();
		Thread.sleep(2000L);
		ma.enterDifferentRegion();
		ma.enterNoForDefaultAdd();
		ma.enterContinueForInvalidDetails();
		String getUrlFromBowserForInvalidDetails = driver.getCurrentUrl();
		String urlAfterContinueForInvalidDetails = ma.getUrlAfterContinueForInvalidDetails();
		Assert.assertEquals(getUrlFromBowserForInvalidDetails, urlAfterContinueForInvalidDetails);
		log.info("New address with invalid details successfull");
	}

	@Test(priority = 5)
	public void checkOnClickDelete() {
		TcMa1004 ma = PageFactory.initElements(driver, TcMa1004.class);
		ma.onClickMyAccount();
		ma.onClickModifyAddressBook();
		ma.checkOnClickDelete();
		log.info("Delete Address Successful");
		ma.checkOnClickBack();
	}
}