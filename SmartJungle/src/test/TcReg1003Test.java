package test;

import org.openqa.selenium.support.PageFactory;

import pages.TcReg1003;

public class TcReg1003Test extends BaseTest {

	public void buttonfunctionality() {
		TcReg1003 bf = PageFactory.initElements(driver, TcReg1003.class);
		bf.clickOnRadioButtonYes();
		bf.clickOnRadioButtonNo();
		bf.clickOnPrivacyPolicy();
		bf.clickOnContinueButton();
	}
}
