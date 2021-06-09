package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1004;

public class TcLp1004Test extends BaseTest {

	@Test

	public void checkforgottenpassword() throws InterruptedException {
		TcLp1004 cfp = PageFactory.initElements(driver, TcLp1004.class);
		cfp.onClickLogin();
		Thread.sleep(2000L);
		cfp.onClickForgottenPassword();
		Thread.sleep(2000L);
		cfp.enterContinueButton();
		Thread.sleep(2000L);
		cfp.enterBackButton();
	}

}
