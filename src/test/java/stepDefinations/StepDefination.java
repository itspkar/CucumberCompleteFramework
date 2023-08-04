package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import generics.AutoConstant;
import generics.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_class.EbayHomePage;
import pom_class.SeeAllPage;



public class StepDefination extends BasePage implements AutoConstant { 
	public WebDriver driver;
	
	@Given("I am on the eBay homepage")
	public void i_am_on_the_e_bay_homepage() {
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("I navigate to Electronics > Cell Phones & Accessories")
	public void i_navigate_to_electronics_cell_phones_accessories(){
		
	   EbayHomePage homepage = new EbayHomePage(driver);
	   homepage.shopbycategory(); 
	   homepage.electronicsoptionselection();
	   homepage.selectcellphone();
	   
	}

	@When("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
		
		EbayHomePage homepage = new EbayHomePage(driver);
		homepage.cellPhoneandmartphonesoptionselection();
	
		
	}

	@When("I click on {string} under {string} or {string}")
	public void i_click_on_under_or(String string, String string2, String string3) throws InterruptedException {
		EbayHomePage homepage = new EbayHomePage(driver);
		homepage.shopbybrand();
		Thread.sleep(3000);
	}

	@When("I apply filters for screen size, Price, and Item location")
	public void i_apply_filters_for_screen_size_price_and_item_location() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SeeAllPage option = new SeeAllPage(driver);
		//Thread.sleep(10000);
		option.screensizefilter();
        option.selectscreensize();
        option.selectpricefilter();
        option.selectpricerange("500","600");
        option.locationselection();
        option.selectrequiredlocation();
        option.applybutton();
	    
	}

	@Then("I should see the filter tags applied")
	public void i_should_see_the_filter_tags_applied() {
		
		SeeAllPage verify = new SeeAllPage(driver);
		verify.verifyfilterapplied();
		
		
	    
	}



}
