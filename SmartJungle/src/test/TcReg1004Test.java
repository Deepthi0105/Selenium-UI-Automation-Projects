package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcReg1004;

public class TcReg1004Test extends BaseTest {

	@Test
	public void existingdataregister() throws InterruptedException {
		TcReg1004 edr = PageFactory.initElements(driver, TcReg1004.class);
		edr.onClickSignUpLink();
		edr.enterFirstName();
		edr.enterLastName();
		edr.enterEmailId();
		edr.enterTelephoneNo();
		edr.enterfax();
		edr.enterCompanyName();
		edr.enterAddressOne();
		edr.enterAddressTwo();
		edr.enterCity();
		edr.enterPostalCode();
		edr.enterCountry();
		Thread.sleep(2000L);
		edr.enterRegion();
		edr.enterPassword();
		edr.enterConfirmPassword();
		Thread.sleep(2000L);
		edr.onClickSubscribe();
		Thread.sleep(2000L);
		edr.clickOnPrivacyPolicy();
		Thread.sleep(2000L);
		edr.enterContinue();
	}
}
