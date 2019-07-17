package autoexsel.cucumber.test;

import static com.autoexsel.webdriver.WebDriverManager.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LaunchAndOpen {
	
	public static String searchButton;

	@Given("^that user opens the google homepage$")
	public void that_user_opens_the_google_homepage() {
		setStepName("Given");
		openURL("http://www.google.com");
	}

	@Then("^verify that google homepage is opened$")
	public void verify_that_google_homepage_is_opened() {
		setStepName("Then");
		captureScreenshot();
		findByAny(searchButton).as("Button").isDisplayed();
	}
	
}
