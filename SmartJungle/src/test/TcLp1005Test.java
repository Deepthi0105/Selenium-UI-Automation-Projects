package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1005;

public class TcLp1005Test extends BaseTest {
	
	@Test
	public void forgottenPasswordLink() throws IOException {
		TcLp1005 fpl=PageFactory.initElements(driver, TcLp1005.class);
		fpl.onClickLogin();
		fpl.onClickForgottenPassword();
		fpl.enterEmailId();
		fpl.enterContinueButton();
		
		
	}

}
