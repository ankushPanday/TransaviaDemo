package Cucumber.feature;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.jetty.html.Select;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAFlight {

	WebDriver driver = null;
	private String today;

	@Given("^User is on Transavia HomePage$")
	public void user_is_on_Transavia_HomePage() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.transavia.com/en-NL/home/");
	}

	@When("^Choose OutBound and InBound Locations$")
	public void OutBoundandInBoundLocations() throws Throwable {
		System.out.println("Outbound and Inbound");
		Thread.sleep(18000);
		WebElement mySelectElement = driver.findElement(By.xpath(
				"//div[@class='panel_section panel_section--secondary panel_section--photography panel_section--content-button']//select[@id='routeSelectionMobile_ArrivalStation']"));
		// ("routeSelectionMobile_ArrivalStation"));
		Select dropdown = new Select(mySelectElement);
		// dropdown.selectByVisibleText("Agadir, Morocco");
		dropdown.selectByIndex(3);
	}

	@And("^Choose Inbound and Outbound Dates$")
	public void datePickerTest() {
       
        //Get Today's number
        today = getCurrentDay();
        System.out.println("Today's number: " + today + "\n");
 
        //Click and open the datepickers
        driver.findElement(By.xpath(".//*[@class= 'HV-gu--bp10--y1-1 HV-gu--bp10--x1-2 HV-gu--bp10--50p']/[@class = 'field-datepicker h6'].click();
 
        
        WebElement dateWidgetFrom = driver.findElement(By.xpath(".//*[@id='calendar-100000000']/div[3]/table/tbody"));
 
        
 
        
        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("option"));
 
        
        for (WebElement cell: columns) {
            
            if (cell.getText().equals(today)) {
                cell.click();
                break;
            }
        }
 
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	// Get The Current Day
	private String getCurrentDay() {
		// Create a Calendar Object
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Day as a number
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: " + todayInt + "\n");

		// Integer to String Conversion
		String todayStr = Integer.toString(todayInt);
		System.out.println("Today Str: " + todayStr + "\n");

		return todayStr;
	}

	@Then("^Click Search button$")
	public void click_Search_button() throws Throwable {
		System.out.println("Outbound and Inbound 3");
		driver.findElement(By.className("icon-font icon-search")).click();
	}

	@When("^Choose wrong OutBound and InBound Locations$")
	public void choose_wrong_OutBound_and_InBound_Locations() throws Throwable {
		System.out.println("Outbound and Inbound 4");
	}

	@And("^Click the Search button$")
	public void click_the_Search_button() throws Throwable {
		System.out.println("Outbound and Inbound 5");
		driver.findElement(By.className("icon-font icon-search")).click();
	}

	@Then("^Check the Landing Page$")
	public void ChecktheLandingPage() throws Throwable {
		System.out.println("Outbound and Inbound 6");
		Assert.assertTrue(driver.getTitle().equals("Inspiration for your next trip | Transavia"));
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
