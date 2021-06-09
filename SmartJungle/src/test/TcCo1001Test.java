package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcCo1001;
import pages.TcLp1001;

public class TcCo1001Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcCo1001Test.class.getName());
	@Test(priority=0)
	public void loginpage() throws IOException {
		TcLp1001 lp=PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();
		log.info("Done with loginpage");
	}

	@Test(priority=1)
	public void CheckOnnClickCheckOut() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.onClickCheckOut();
		Thread.sleep(3000L);
		log.info("Done with CheckOnClickCheckOut");
}
	@Test(priority=2)
	public void checkOnlickNewAddress() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.onClickNewAddress();
		Thread.sleep(3000L);
		log.info("Done with checkOnlickNewAddress");
	}
	@Test(priority=3)
	public void checkOnClickExistingAddress() throws IOException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.OnClickExistingAddress();
		log.info("Done with checkOnClickExistingAddress");
	}
	
	@Test(priority=4)
	public void checkEnterContinueButton() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.enterContinueButton();
		Thread.sleep(3000L);
		log.info("Done with checkEnterContinueButton");
	}
	@Test(priority=5)
	public void checkOnlickNewAddressForDelivery() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.onlickNewAddressForDelivery();
		Thread.sleep(3000L);
		log.info("Done with checkOnlickNewAddressForDelivery");
	}
	@Test(priority=6)
	public void checkOnClickExistingAddressForDelivery() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.OnClickExistingAddressForDelivery();
		Thread.sleep(3000L);
		log.info("Done with checkOnClickExistingAddressForDelivery");
	}
	@Test(priority=7)
	public void checkEnterContinueButtonForDelivery() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.enterContinueButtonForDelivery();
		Thread.sleep(3000L);
		log.info("Done with checkEnterContinueButtonForDelivery");
	}
	@Test(priority=8)
	public void checkEnterDeliveryMethod() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.enterDeliveryMethod();
		log.info("Done with checkEnterDeliveryMethod");
	}
	@Test(priority=9)
	public void checkEnterContinueButtonOfDeliveryMethod() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.enterContinueButtonOfDeliveryMethod();
		log.info("Done with checkEnterContinueButtonOfDeliveryMethod");
	}
	
	@Test(priority=10)
	public void checkOnClickPaymentMethod() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.onClickPaymentMethod();
		log.info("Done with checkOnClickPaymentMethod");
	}
	@Test(priority=11)
	public void checkEnterConfirmMethod() throws IOException, InterruptedException {
		TcCo1001 co=PageFactory.initElements(driver, TcCo1001.class);
		co.enterConfirmMethod();
		log.info("Done with checkEnterConfirmMethod");
	}
}
