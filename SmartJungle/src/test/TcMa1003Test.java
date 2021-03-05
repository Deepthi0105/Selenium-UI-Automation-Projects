package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcLp1001;
import pages.TcMa1003;

public class TcMa1003Test extends BaseTest {

	@Test(priority = 0)
	public void loginpage() throws IOException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();

	}

	@Test(priority = 1)
	public void checkOnClickMyAccount() throws InterruptedException {
		TcMa1003 cma = PageFactory.initElements(driver, TcMa1003.class);
		cma.onClickMyAccount();
		Thread.sleep(1000L);
	}

	@Test(priority = 2)
	public void checkOnClickChangePassword() {
		TcMa1003 cma = PageFactory.initElements(driver, TcMa1003.class);
		cma.onClickChangePassword();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfChangePassword = cma.getUrlOfChangePassword();
		Assert.assertEquals(urlFromBrowser, urlOfChangePassword);
	}

	@Test(priority = 3)
	public void checkWithBlankPassword() throws InterruptedException {
		TcMa1003 cma = PageFactory.initElements(driver, TcMa1003.class);
		String getUrlFromBrowserBefore = driver.getCurrentUrl();
		cma.enterPassword("");
		cma.enterConfirmPassword("");
		cma.enterContinueButton();
		String getUrlFromBrowserAfter = driver.getCurrentUrl();
		Assert.assertEquals(getUrlFromBrowserBefore, getUrlFromBrowserAfter);
		Thread.sleep(3000L);
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void checkWithDiffPasswords()  {
		TcMa1003 cma = PageFactory.initElements(driver, TcMa1003.class);
		String getUrlFromBrowserBefore = driver.getCurrentUrl();
		cma.enterPassword("Deeps123*");
		cma.enterConfirmPassword("Deeps");
		cma.enterContinueButton();
		String getUrlFromBrowserAfter = driver.getCurrentUrl();
		Assert.assertEquals(getUrlFromBrowserBefore, getUrlFromBrowserAfter);
		driver.navigate().back();
		
	}

	@Test(priority = 5)
	public void checkWithValidPassword() {
		TcMa1003 cma = PageFactory.initElements(driver, TcMa1003.class);
		cma.enterPassword("Deeps123*");
		cma.enterConfirmPassword("Deeps123*");
		cma.enterContinueButton();
		String getUrlFromBrowser = driver.getCurrentUrl();
		String urlOfContinue = cma.getUrlOfContinue();
		Assert.assertEquals(getUrlFromBrowser, urlOfContinue);
	}
}
