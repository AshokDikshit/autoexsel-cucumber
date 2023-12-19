package autoexsel.prebuilt.stepdef;

import static com.autoexsel.web.driver.WebUITestManager.*;
import static com.autoexsel.web.driver.WebUITestManager.setStepName;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ActionsStepDef{

	@When("^I click {string} on (string) page$")
	public void IClickOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I click (string)$")
	public void IClickOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@When("^I enter {string} in (string) on (string) page$")
	public void IEnterValueOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).sendKeys(page);
	}
	
	@And("^I enter (string) in (string)$")
	public void IEnterValueOn(String value, String element) {
		setStepName(StepDetails.stepName);
		findElement(element).sendKeys(value);
	}
	
	@When("^I enter testdata {string} in (string) on (string) page$")
	public void IEnterTestDataValueOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).sendKeys(page);
	}
	
	@And("^I enter testdata (string) in (string)$")
	public void IEnterTestDataValueOn(String value, String element) {
		setStepName(StepDetails.stepName);
		findElement(element).sendKeys(value);
	}
	
	@When("^I enter runtime value of {string} in (string) on (string) page$")
	public void IEnterRunTimeValueOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).sendKeys(page);
	}
	
	@And("^I enter runtime value of (string) in (string)$")
	public void IEnterRunTimeValueOn(String value, String element) {
		setStepName(StepDetails.stepName);
		findElement(element).sendKeys(value);
	}
	
	@And("^I save runtime value of {string} in (string)$")
	public void ISetRunTimeValue(String type, String value) {
		setStepName(StepDetails.stepName);
	}
	
}
