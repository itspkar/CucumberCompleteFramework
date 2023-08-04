package pom_class;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class SeeAllPage extends BasePage {

	public WebDriver driver;

	@FindBy(xpath = "//span[.='Screen Size']")
	private WebElement screensizeoption;

	@FindBy(xpath = "(//input[@class='checkbox__control'])[1]")
	private WebElement checkbox1;

	@FindBy(xpath = "//div[@data-aspecttitle='price']")
	private WebElement pricefilter;

	@FindBy(xpath = "//input[@aria-label='Minimum Value, US Dollar']")
	private WebElement MinimumValue;

	@FindBy(xpath = "//input[@aria-label='Maximum Value, US Dollar']")
	private WebElement MaximumValue;

	@FindBy(xpath = "//span[.='Item Location']")
	private WebElement selectlocation;

	@FindBy(xpath = "//input[@value='US Only']")
	private WebElement locationradiobutton;

	@FindBy(xpath = "//button[@class='x-overlay-footer__apply-btn btn btn--primary']")
	private WebElement applybutton;

	@FindBy(xpath = "//span[.='3 filters applied']")
	private WebElement filterappliedtext;

	// Initialisation

	public SeeAllPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Utilisation

	public void screensizefilter() {
		javascriptclick(driver , screensizeoption);

	}

	public void selectscreensize() {
		visibilityofelementlocated(driver, screensizeoption);
		javascriptclick(driver , checkbox1);
		visibilityofelementlocated(driver, screensizeoption);
	}

	public void selectpricefilter() {
		visibilityofelementlocated(driver, screensizeoption);
		pricefilter.click();
		visibilityofelementlocated(driver, screensizeoption);
	}

	public void selectpricerange(String value1, String value2) {

		MinimumValue.sendKeys(value1);
		visibilityofelementlocated(driver, screensizeoption);
		MaximumValue.sendKeys(value2);
		visibilityofelementlocated(driver, screensizeoption);
	}

	public void locationselection() {
		visibilityofelementlocated(driver, screensizeoption);
		selectlocation.click();
		visibilityofelementlocated(driver, screensizeoption);
	}

	public void selectrequiredlocation() {
		visibilityofelementlocated(driver, screensizeoption);
		locationradiobutton.click();
		visibilityofelementlocated(driver, screensizeoption);
	}

	public void applybutton() {
		visibilityofelementlocated(driver, screensizeoption);
		applybutton.click();
		visibilityofelementlocated(driver, screensizeoption);
	}

	public void verifyfilterapplied() {
		visibilityofelementlocated(driver, screensizeoption);
		String expectedtext ="3 filters applied";
		String actualtext = filterappliedtext.getText();
		Assert.assertEquals(expectedtext,actualtext);
		System.out.println("All the filters are applied");
	}

}