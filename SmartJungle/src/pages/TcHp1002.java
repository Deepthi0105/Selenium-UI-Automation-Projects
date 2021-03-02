package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TcHp1002 {
	WebDriver driver;

	public TcHp1002(WebDriver driver) {
		this.driver = driver;

	}

	// Check the functionality of the images
	@FindBy(xpath = "//*[@id=\"banner0\"]/div[1]/a/img")
	WebElement clickImage1;
	String urlOfImage1 = "https://www.smartjungle.co.uk/health-safety/protective-face-masks/buy-kn95-mask-online";

	@FindBy(xpath = "//*[@id=\"banner0\"]/div[2]/a/img")
	WebElement clickImage2;
	String urlOfImage2 = "https://www.smartjungle.co.uk/health-safety/protective-face-masks/disposable-face-mask";

	@FindBy(xpath = "//*[@id=\"banner1\"]/div[3]/a/img")
	WebElement clickImage3;
	String urlOfImage3 = "https://www.smartjungle.co.uk/index.php?route=product/product&path=92_98_114&product_id=132";

	@FindBy(xpath = "//*[@id=\"banner1\"]/div[2]/a/img")
	WebElement clickImage4;
	String urlOfImage4 = "https://www.smartjungle.co.uk/index.php?route=product/product&path=149_150&product_id=824";

	@FindBy(xpath = "//*[@id=\"banner1\"]/div[1]/a/img")
	WebElement clickImage5;
	String urlOfImage5 = "https://www.smartjungle.co.uk/index.php?route=product/product&path=92_98_104&product_id=71";

	public void clickImage1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		clickImage1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"banner0\"]/div[1]/a/img")));
		clickImage1.click();
	}

	public String getUrlOfImage1() {
		return urlOfImage1;
	}

	public void clickImage2() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		clickImage2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"banner0\"]/div[2]/a/img")));
		clickImage2.click();
	}

	public String getUrlOfImage2() {
		return urlOfImage2;
	}

	public void clickImage3() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		clickImage3 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"banner1\"]/div[3]/a/img")));
		clickImage3.click();
	}

	public String getUrlOfImage3() {
		return urlOfImage3;
	}

	public void clickImage4() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		clickImage4 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"banner1\"]/div[2]/a/img")));
		clickImage4.click();
	}

	public String getUrlOfImage4() {
		return urlOfImage4;
	}

	public void clickImage5() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		clickImage5 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"banner1\"]/div[1]/a/img")));
		clickImage5.click();
	}

	public String getUrlOfImage5() {
		return urlOfImage5;
	}
}
