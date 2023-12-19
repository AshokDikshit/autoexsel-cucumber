package autoexsel.prebuilt.stepdef;

import static com.autoexsel.web.driver.WebUITestManager.*;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class AssertionStepDef{

	@Then("^I verify {string} is equals to (string) on {string} page$")
	public void IVerifyOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify {string} is equals to (string)$")
	public void IVerifyOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@Then("^I verify testdata {string} is equals to (string) on {string} page$")
	public void IVerifyTestDataOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify testdata {string} is equals to (string)$")
	public void IVerifyTestDataOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}
	
	@Then("^I verify runtime {string} is equals to (string) on {string} page$")
	public void IVerifyRuntimeOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify runtime {string} is equals to (string)$")
	public void IVerifyRuntimeOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@Then("^I verify {string} is( not) visible on {string} page$")
	public void IVerifyVisibleOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify {string} is visible$")
	public void IVerifyVisibleOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@Then("^I verify {string} is( not) enabled on {string} page$")
	public void IVerifyEnabledOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify {string} is enabled$")
	public void IVerifyEnabledOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@Then("^I verify {string} is( not) selected on {string} page$")
	public void IVerifyselectedOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify {string} is selected$")
	public void IVerifyselectedOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@Then("^I wait for {string} to be( not) visible on {string} page$")
	public void IVerifyWaitOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I wait for {string} to be( not) visible$")
	public void IVerifyWaitOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}

	@Then("^I wait for {string} to be( not) enabled on {string} page$")
	public void IVerifyWaitEnabledOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I wait for {string} to be( not) enabled$")
	public void IVerifyWaitEnabledOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element).click();
	}
}
