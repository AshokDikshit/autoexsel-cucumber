package com.custom.stepdef;

import static com.autoexsel.web.driver.WebUITestManager.findElement;
import static com.autoexsel.web.driver.WebUITestManager.openURL;
import static com.autoexsel.web.driver.WebUITestManager.setStepName;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LaunchAndOpen{
	
	public static String searchButton;

	@Then("^verify that google homepage is opened$")
	public void verify_that_google_homepage_is_opened() {
		setStepName(StepDetails.stepName);
		findElement(searchButton).as("Button").isDisplayed();
	}
	
}
