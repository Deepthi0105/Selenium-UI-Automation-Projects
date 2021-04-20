package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1001;

public class TcLp1001Test extends BaseTest {

	@Test
	public void loginpage() throws IOException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();
	}
}
