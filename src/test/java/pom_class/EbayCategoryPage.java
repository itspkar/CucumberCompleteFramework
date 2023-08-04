package pom_class;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class EbayCategoryPage extends BasePage {

	public WebDriver driver;

	@FindBy(id = "close")
	private WebElement closeoption;

	@FindBy(id = "gh-ac")
	private WebElement searchbar;

//	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
//	private WebElement Searchtab;

	@FindBy(id = "gh-btn")
	private WebElement searchbutton;

	@FindBy(id = "gh-cat")
	private WebElement categoryselectElement;

	public EbayCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void closeoptionselection() {
		closeoption.click();
	}

//	public void clicksearchbar() {
//		searchbar.click();
//	}
	public void searchtabtext(String search) {
		searchbar.sendKeys(search);
	}

	public void submitbutton() {
		searchbutton.click();
	}

	public void computertabletsearchoption() {
		selectbyvisibletext(categoryselectElement, "Computers/Tablets & Networking");
	}

	public void verifyPageLoad() {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		boolean isPageLoaded = ex.executeScript("return document.readyState").equals("complete");

		if (isPageLoaded) {
			Assert.assertTrue(isPageLoaded);
			System.out.println("Page is loaded completely");
		}
	}
	public void verifyStringmatching() {
		String searchString = searchbar.getText();
		String firstResultname = "Apple MacBook Pro 13| Upgraded 256GB SSD +8GB i5| Turbo MacOS Catalina Excellent";
		
		Assert.assertEquals(searchString,firstResultname); // As it doesnot match it will throw comparisionFailure
		System.out.println("Both are matching");
	}

}
