package Cucumber.feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAFlight {
	
	WebDriver driver = null;

	@Given("^User is on Transavia HomePage$")
	public void user_is_on_Transavia_HomePage() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.transavia.com/en-NL/home/");
	}

	@When("^Choose OutBound and InBound Locations$")
	public void OutBoundandInBoundLocations() throws Throwable {
	 System.out.println("Outbound and Inbound");
	}
	
	@And("^Choose Inbound and Outbound Dates$")
	public void choose_Inbound_and_Outbound_Dates() throws Throwable {
		System.out.println("Outbound and Inbound 2");
	}

	@Then("^Click Search button$")
	public void click_Search_button() throws Throwable {
		System.out.println("Outbound and Inbound 3");
	}

	@When("^Choose wrong OutBound and InBound Locations$")
	public void choose_wrong_OutBound_and_InBound_Locations() throws Throwable {
		System.out.println("Outbound and Inbound 4");
	}

	@And("^Click the Search button$")
	public void click_the_Search_button() throws Throwable {
		System.out.println("Outbound and Inbound 5");
	}
	
	@Then("^Check the Landing Page$")
	public void ChecktheLandingPage() throws Throwable {
		System.out.println("Outbound and Inbound 6");
	}

	@And("^Choose Departure Date$")
	public void choose_Departure_Date() throws Throwable {
		System.out.println("Outbound and Inbound 7");
	}

	@And("^Uncheck Return on Checkbox$")
	public void uncheck_Return_on_Checkbox() throws Throwable {
		System.out.println("Outbound and Inbound 8");
	}

	@When("^User Navigates to Advanced Search Tab and clicks it$")
	public void user_Navigates_to_Advanced_Search_Tab_and_clicks_it() throws Throwable {
		System.out.println("Outbound and Inbound 9");
	}

	@Then("^Advanced Search Page Lands up$")
	public void advanced_Search_Page_Lands_up() throws Throwable {
		System.out.println("Outbound and Inbound 10");
	}

	@Given("^User is on Advanced Search Page$")
	public void user_is_on_Advanced_Search_Page() throws Throwable {
		System.out.println("Outbound and Inbound 11");
	}

	@And("^Enter the budget amount in MyBudget Textbox$")
	public void enter_the_budget_amount_in_MyBudget_Textbox() throws Throwable {
		System.out.println("Outbound and Inbound 12");
	}

	@Then("^Click Search to see the results$")
	public void click_Search_to_see_the_results() throws Throwable {
		System.out.println("Outbound and Inbound 13");
	}

	
	
}
