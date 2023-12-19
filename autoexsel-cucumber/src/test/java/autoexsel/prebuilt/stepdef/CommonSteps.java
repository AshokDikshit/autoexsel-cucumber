package autoexsel.prebuilt.stepdef;

import static com.autoexsel.web.driver.WebUITestManager.*;
import static com.autoexsel.web.driver.WebUITestManager.setStepName;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.Given;


public class CommonSteps{
	
	@Given("^that user opens the google homepage$")
	public void that_user_opens_the_google_homepage() {
		setStepName(StepDetails.stepName);
		openURL("http://www.google.com");
	}
	
}
