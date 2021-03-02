package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TcHp1005 {
	WebDriver driver;

	public TcHp1005(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "filter_name")
	WebElement enterInSearchTab;

	@FindBy(xpath = "//*[@id=\"search\"]/div[2]")
	WebElement clickOnSearchIcon;
	String urlOfSearchIcon = "https://www.smartjungle.co.uk/index.php?route=product/search";

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/p/input[1]")
	WebElement enterInSearchPage;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/p/select")
	WebElement selectCategories;

	@FindBy(name = "filter_sub_category")
	WebElement selectSubCategory;

	@FindBy(name = "filter_description")
	WebElement selectProductDescription;

	@FindBy(xpath = "//*[@id=\"button-search\"]/span")
	WebElement enterSearchButton;
	String urlOfSearchButton = "https://www.smartjungle.co.uk/index.php?route=product/search&filter_name=Protable%20DVD%20Player&filter_category_id=149&filter_sub_category=true&filter_description=true";

	public void enterInSearchTab() {
		enterInSearchTab.clear();
		enterInSearchTab.sendKeys("Electronics");
	}

	public void clickOnSearchIcon() {
		clickOnSearchIcon.click();
	}

	public String getUrlOfSearchIcon() {
		return urlOfSearchIcon;
	}

	public void enterInSearchPage() {
		enterInSearchPage.clear();
		enterInSearchPage.sendKeys("Protable DVD Player");
	}

	public void selectCategories() {
		Select categories = new Select(selectCategories);
		categories.selectByVisibleText("ELECTRONICS");
	}

	public void selectSubCategory() {
		selectSubCategory.click();
	}

	public void selectProductDescription() {
		selectProductDescription.click();
	}

	public void enterSearchButton() {
		enterSearchButton.click();
	}

	public String getUrlOfSearchButton() {
		return urlOfSearchButton;
	}
}