package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1003;

public class TcLp1003Test extends BaseTest {
	@Test
	public void checkloginbutton() {
		TcLp1003 lb = PageFactory.initElements(driver, TcLp1003.class);
		lb.enterOnClickLogIn();
		lb.enterLoginButton();

	}
}
