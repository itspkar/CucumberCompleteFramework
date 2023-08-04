package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class EbayHomePage extends BasePage {
	
	public WebDriver driver;
	
	@FindBy(id = "gh-shop-a")
	private WebElement shopbycategory;
	
	@FindBy(xpath = "//a[@title='Your shopping destination for the best selection and value in electronics and accessories']")
	private WebElement Electronics;
	
	@FindBy(xpath = "//a[.='Cell Phones, Smart Watches & Accessories']")
	private WebElement CellPhoneandaccessories;
	
	@FindBy(xpath = "(//a[.='Cell Phones & Smartphones'])[1]")
	private WebElement cellphoneandsmartphone;
	
	@FindBy(xpath = "//span[.='- Shop by Brand']/..")
	private WebElement SeeAll;
	
	
	
	// initialisation
	public EbayHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	
	public void shopbycategory() {
		shopbycategory.click();
		
	}
	
	public void electronicsoptionselection() {
		Electronics.click();
		
	}
	
	public void selectcellphone() {
		CellPhoneandaccessories.click();
	}
	
	public void cellPhoneandmartphonesoptionselection() {
		cellphoneandsmartphone.click();
	}
	
	public void shopbybrand() {
		SeeAll.click();
	}
	

}
