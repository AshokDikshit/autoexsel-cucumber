package autoexsel.cucumber.test;

import static com.autoexsel.webdriver.WebDriverManager.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PerformGoogleSearch {

	public static String searchInput = "q";
	public static String searchResult = "//h3[@class='LC20lb']";

	@Given("^that user is on google homepage$")
	public void that_user_is_on_google_homepage() {
//		setStepName("Given");
		findByAny(searchInput).as("Search Field").isDisplayed();
	}

	@Then("^user enters \"([^\"]*)\" in google search box$")
	public void user_enters_in_google_search_box(String arg1) {
//		setStepName("Then");
		findByAny(searchInput).as("Search Field").sendKeys(arg1);
	}

	@When("^user clicks on search button$")
	public void user_clicks_on_search_button() {
//		setStepName("When");
		findByAny("btnK").as("Button").click();
	}

	@Then("^verify that \"([^\"]*)\" is displayed in search result$")
	public void verify_that_given_text_is_displayed_in_search_result(String arg1) {
//		setStepName("Then");
		findByAny(searchResult).as("Search Result").verifyEqualsTo(arg1);
	}
}
