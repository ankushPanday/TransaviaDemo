package Cucumber.feature;

import org.openqa.selenium.WebDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageABooking {
	
	WebDriver driver = null;

	@When("^User clicks on Manage your Booking$")
	public void user_clicks_on_Manage_your_Booking() throws Throwable {
		System.out.println("Outbound and Inbound 14");
	}

	@When("^Clicks on View your Booking$")
	public void clicks_on_View_your_Booking() throws Throwable {
		System.out.println("Outbound and Inbound 15");
	}

	@Then("^User lands up on View Booking and LogIn Page$")
	public void user_lands_up_on_View_Booking_and_LogIn_Page() throws Throwable {
		System.out.println("Outbound and Inbound 16");
	}

	@When("^Check the drop down list in FROM field contains Country or city names$")
	public void check_the_drop_down_list_in_FROM_field_contains_Country_or_city_names() throws Throwable {
		System.out.println("Outbound and Inbound 17");
	}

	@Then("^Check the mesage displayed after selecting the value$")
	public void check_the_mesage_displayed_after_selecting_the_value() throws Throwable {
		System.out.println("Outbound and Inbound 18");
	}

	@When("^Check the drop down list in TO field contains Country or city names$")
	public void check_the_drop_down_list_in_TO_field_contains_Country_or_city_names() throws Throwable {
		System.out.println("Outbound and Inbound 19");
	}

	
	
}
