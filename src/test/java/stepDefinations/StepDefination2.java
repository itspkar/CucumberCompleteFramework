package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generics.AutoConstant;
import generics.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_class.EbayCategoryPage;

public class StepDefination2 extends BasePage implements AutoConstant{
	
	public WebDriver driver;
	
	@Given("I am navigating to the Ebay website")
	public void i_am_navigating_to_the_ebay_website() {
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@When("I type {string} in the search bar")
	public void i_type_in_the_search_bar(String string) throws InterruptedException {
		
		EbayCategoryPage page = new EbayCategoryPage(driver);

		page.searchtabtext("MacBook");
	    
	}

	@When("I change the Search category to {string}")
	public void i_change_the_search_category_to(String string) {
		
		EbayCategoryPage page = new EbayCategoryPage(driver);
		page.computertabletsearchoption();
	}

	@When("I click the Search button")
	public void i_click_the_search_button() {
		
		EbayCategoryPage homepage = new EbayCategoryPage(driver);
		homepage.submitbutton();
	    
	}

	@Then("the page should load completely")
	public void the_page_should_load_completely() {
		
		EbayCategoryPage homepage = new EbayCategoryPage(driver);
		homepage.verifyPageLoad();
	}

	@Then("the first result name should match {string}")
	public void the_first_result_name_should_match(String string) {
	 
		EbayCategoryPage homepage = new EbayCategoryPage(driver);
	    homepage.verifyStringmatching();
	}

}
