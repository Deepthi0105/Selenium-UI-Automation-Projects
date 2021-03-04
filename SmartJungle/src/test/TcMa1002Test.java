package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcLp1001;
import pages.TcMa1002;

public class TcMa1002Test extends BaseTest {

	@Test(priority = 0)
	public void loginpage() throws IOException, InterruptedException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();
		Thread.sleep(3000L);
	}

	@Test(priority = 1)
	public void checkOnClickAccount() throws InterruptedException {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.onClickAccount();
		Thread.sleep(1000L);
	}

	@Test(priority = 2)
	public void checkOnClickEditInfo() throws InterruptedException {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.onClickEditInfo();
		Thread.sleep(1000L);
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfEditInfoPage = ma.getUrlOfEditInfo();
		Assert.assertEquals(urlFromBrowser, urlOfEditInfoPage);
	}

	@Test(priority = 3)
	public void checkEditFirstName() {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.editFirstName();
	}

	@Test(priority = 4)
	public void checkEditLastName() {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.editLastName();
	}

	@Test(priority = 5)
	public void checkEditEmail() {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.editEmail();
	}

	@Test(priority = 6)
	public void checkEditTelephone() {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.editTelephone();
	}

	@Test(priority = 7)
	public void checkEditFax() {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.editFax("5");
	}

	@Test(priority = 8)
	public void checkEnterContinueButton() {
		TcMa1002 ma = PageFactory.initElements(driver, TcMa1002.class);
		ma.enterContinueButton();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfContinue = ma.getUrlOfContinue();
		Assert.assertEquals(urlFromBrowser, urlOfContinue);
	}

}