package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1006;

public class TcLp1006Test extends BaseTest {
	@Test
	public void forgottenPasswordUnregisteredEmail() throws IOException {
		TcLp1006 fpu = PageFactory.initElements(driver, TcLp1006.class);
		fpu.onClickLogin();
		fpu.onClickForgottenPassword();
		fpu.enterEmailId();
		fpu.enterContinueButton();

	}
}
