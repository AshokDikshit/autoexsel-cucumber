package autoexsel.prebuilt.stepdef;

import static com.autoexsel.test.manager.WebTestManager.*;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class AssertionStepDef{

	@Then("^I verify \"(.+)\" is equals to \"(.+)\" on \"(.+)\" page$")
	public void IVerifyOnPage(String element, String value, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).verifyEqualsTo(value);
	}
	
	@And("^I verify \"(.+)\" is equals to \"(.+)\"$")
	public void IVerifyOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@Then("^I verify testdata \"(.+)\" is equals to \"(.+)\" on \"(.+)\" page$")
	public void IVerifyTestDataOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify testdata \"(.+)\" is equals to \"(.+)\"$")
	public void IVerifyTestDataOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}
	
	@Then("^I verify runtime \"(.+)\" is equals to \"(.+)\" on \"(.+)\" page$")
	public void IVerifyRuntimeOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify runtime \"(.+)\" is equals to \"(.+)\"$")
	public void IVerifyRuntimeOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@Then("^^I verify \"(.+)\" is (visible|not visible) on \"(.+)\" page$$")
	public void IVerifyVisibleOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		System.out.println(element);
		System.out.println(usecase);
		System.out.println(page);
//		findElement(element, page).click();
	}
	
	@And("^I verify \"(.+)\" is visible$")
	public void IVerifyVisibleOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@Then("^I verify \"(.+)\" is( not) enabled on \"(.+)\" page$")
	public void IVerifyEnabledOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify \"(.+)\" is enabled$")
	public void IVerifyEnabledOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@Then("^I verify \"(.+)\" is( not) selected on \"(.+)\" page$")
	public void IVerifyselectedOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I verify \"(.+)\" is selected$")
	public void IVerifyselectedOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@Then("^I wait for \"(.+)\" to be( not) visible on \"(.+)\" page$")
	public void IVerifyWaitOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I wait for \"(.+)\" to be( not) visible$")
	public void IVerifyWaitOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@Then("^I wait for \"(.+)\" to be( not) enabled on \"(.+)\" page$")
	public void IVerifyWaitEnabledOnPage(String element, String usecase, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I wait for \"(.+)\" to be( not) enabled$")
	public void IVerifyWaitEnabledOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}
}
