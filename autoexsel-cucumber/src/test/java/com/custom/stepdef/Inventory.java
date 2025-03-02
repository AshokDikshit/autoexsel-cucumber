package com.custom.stepdef;

import static com.autoexsel.test.manager.WebTestManager.findElement;
import static com.autoexsel.test.manager.WebTestManager.openURL;
import static com.autoexsel.test.manager.WebTestManager.setStepName;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Inventory{
	
	public static String menuButton;
	public static String logout;

	@Then("^I logout from SauceDemo app$")
	public void verify_that_google_homepage_is_opened() {
		setStepName(StepDetails.stepName);
		findElement(menuButton).click();
		findElement(logout).click();
	}

}
