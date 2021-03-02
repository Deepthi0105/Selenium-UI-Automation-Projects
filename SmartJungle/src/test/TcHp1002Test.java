package test;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TcHp1002;

public class TcHp1002Test extends BaseTest {
	private static Logger log = Logger.getLogger(TcHp1002Test.class.getName());

	@Test
	public void checkHomePageImage1Clickable() throws InterruptedException {
		TcHp1002 hp = PageFactory.initElements(driver, TcHp1002.class);
		hp.clickImage1();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfImage1 = hp.getUrlOfImage1();
		Assert.assertEquals(urlFromBrowser, urlOfImage1);
		log.info("Image1 is clickable");
		driver.navigate().back();
	}

	@Test
	public void checkHomePageImage2Clickable() throws InterruptedException {
		TcHp1002 hp = PageFactory.initElements(driver, TcHp1002.class);
		hp.clickImage2();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfImage2 = hp.getUrlOfImage2();
		Assert.assertEquals(urlFromBrowser, urlOfImage2);
		log.info("Image2 is clickable");
		driver.navigate().back();

	}

	@Test
	public void checkHomePageImage3Clickable() throws InterruptedException {
		TcHp1002 hp = PageFactory.initElements(driver, TcHp1002.class);
		hp.clickImage3();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfImage3 = hp.getUrlOfImage3();
		Assert.assertEquals(urlFromBrowser, urlOfImage3);
		log.info("Image3 is clickable");
		driver.navigate().back();
	}

	@Test
	public void checkHomePageImage4Clickable() throws InterruptedException {
		TcHp1002 hp = PageFactory.initElements(driver, TcHp1002.class);
		hp.clickImage4();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfImage4 = hp.getUrlOfImage4();
		Assert.assertEquals(urlFromBrowser, urlOfImage4);
		log.info("Image4 is clickable");
		driver.navigate().back();

	}

	@Test
	public void checkHomePageImage5Clickable() throws InterruptedException {
		TcHp1002 hp = PageFactory.initElements(driver, TcHp1002.class);
		hp.clickImage5();
		String urlFromBrowser = driver.getCurrentUrl();
		String urlOfImage5 = hp.getUrlOfImage5();
		Assert.assertEquals(urlFromBrowser, urlOfImage5);
		log.info("Image5 is clickable");
		driver.navigate().back();
	}
}