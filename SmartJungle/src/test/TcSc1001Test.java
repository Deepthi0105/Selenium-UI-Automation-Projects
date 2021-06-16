package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1001;
import pages.TcSc1001;

public class TcSc1001Test extends BaseTest {

	@Test(priority = 0)
	public void loginpage() throws IOException {
		TcLp1001 lp = PageFactory.initElements(driver, TcLp1001.class);
		lp.onClickLogin();
		lp.enterEmailId();
		lp.enterPassword();
		lp.enterLoginButton();

	}

	@Test(priority = 1)
	public void shoppingCartLoggedInCust() throws InterruptedException {
		TcSc1001 sc = PageFactory.initElements(driver, TcSc1001.class);
		sc.onClickShoppingCart();
		sc.enterContinueBtn();
		sc.clickAddToCart();
		sc.clickAddToCart2();
		sc.clickAddToCart3();
		sc.clickAddToCartSameItem();
		sc.onClickShoppingCartAgain();
		sc.increaseQuantity();
		Thread.sleep(2000L);
		sc.clickOnRefresh();
		Thread.sleep(2000L);
		sc.clickOnDelete();
		Thread.sleep(2000L);
		sc.clickOnCouponCode();
		Thread.sleep(2000L);
		sc.enterCouponCode();
		Thread.sleep(2000L);
		sc.clickOnApply();
		sc.enterCheckOut();
	}
}
