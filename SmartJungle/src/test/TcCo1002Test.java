package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcCo1002;

public class TcCo1002Test extends BaseTest {

	@Test(priority = 0)

	public void checkOnClickCheckOut() {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.onClickCheckOut();
	}

	@Test(priority = 1)

	public void checkEnterContinueButton() {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.enterContinueButton();
	}

	@Test(priority = 2)

	public void checkEnterAddToCart() {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.enterAddToCart();
	}

	@Test(priority = 3)

	public void checkOnClickCheckOutAgain() throws InterruptedException {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.onClickCheckOutAgain();
		Thread.sleep(1000L);
	}

	@Test(priority = 4)

	public void checkOnClickRegisterAccount() throws InterruptedException {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.onClickRegisterAccount();
		Thread.sleep(1000L);
	}

	@Test(priority = 5)

	public void checkEnterContinueButtonForRegister() throws InterruptedException {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.enterContinueButtonForRegister();
		Thread.sleep(1000L);
	}

	@Test(priority = 6)

	public void checkOnClickModify() throws InterruptedException {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.onClickModify();
		Thread.sleep(1000L);
	}
	
	@Test(priority = 7)

	public void checkOnClickGuestCheckOut() throws InterruptedException {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.onClickGuestCheckOut();
		Thread.sleep(1000L);
	}

	@Test(priority = 8)

	public void checkEnterContinueButtonForGuestCheckOut() {
		TcCo1002 co = PageFactory.initElements(driver, TcCo1002.class);
		co.enterContinueButtonForGuestCheckOut();
	}
}
