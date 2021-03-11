package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TcLp1001;
import pages.TcMa1006;

public class TcMa1006Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcMa1005Test.class.getName());

	@Test(priority = 0)
	public void loginpage() throws IOException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();
		log.info("Login Complete");

	}

	@Test(priority = 1)
	public void checkOnClickOrderHistory() {
		TcMa1006 oh = PageFactory.initElements(driver, TcMa1006.class);
		oh.onClickOrderHistory();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfOrderHistory = oh.getUrlOfOrderHistory();
		Assert.assertEquals(urlFromBrowser, urlOfOrderHistory);
		log.info("Order History Complete");
	}
	
	@Test(priority = 2)
	public void checkOnClickDownloads() {
		TcMa1006 ocd = PageFactory.initElements(driver, TcMa1006.class);
		ocd.onClickDownloads();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfDownoads = ocd.getUrlOfDownoads();
		Assert.assertEquals(urlFromBrowser, urlOfDownoads);
		log.info("Downloads Complete");
	}
	
	@Test(priority = 3)
	public void checkOnClickYourRewards() {
		TcMa1006 yr = PageFactory.initElements(driver, TcMa1006.class);
		yr.onClickYourRewards();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfYourRewards = yr.getUrlOfYourRewards();
		Assert.assertEquals(urlFromBrowser, urlOfYourRewards);
		log.info("Your Rewards Complete");
	}
	
	@Test(priority = 4)
	public void checkOnClickYourReturnRequest() {
		TcMa1006 yrr = PageFactory.initElements(driver, TcMa1006.class);
		yrr.onClickYourReturnRequest();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfYourReturnRequest = yrr.getUrlOfYourReturnRequest();
		Assert.assertEquals(urlFromBrowser, urlOfYourReturnRequest);
		log.info("Your Returns Complete");
	}
	@Test(priority = 5)
	public void checkOnClickTranscations() {
		TcMa1006 ct = PageFactory.initElements(driver, TcMa1006.class);
		ct.onClickTranscations();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfTranscations = ct.getUrlOfTranscations();
		Assert.assertEquals(urlFromBrowser, urlOfTranscations);
		log.info("Your Transcations Complete");
	}
	@Test(priority = 6)
	public void checkOnClickNewsletter() {
		TcMa1006 cnl = PageFactory.initElements(driver, TcMa1006.class);
		cnl.onClickNewsletter();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfNewLetter = cnl.getUrlOfNewLetter();
		Assert.assertEquals(urlFromBrowser, urlOfNewLetter);
		cnl.onClickYesOrNoSubscribe();
		log.info("Newsletter Complete");
	}
	@Test(priority = 7)
	public void checkEnterContinue() {
		TcMa1006 ec = PageFactory.initElements(driver, TcMa1006.class);
		ec.enterContinue();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlAfterContinue = ec.getUrlAfterContinue();
		Assert.assertEquals(urlFromBrowser, urlAfterContinue);
		log.info("Continue Complete");
	}
}
