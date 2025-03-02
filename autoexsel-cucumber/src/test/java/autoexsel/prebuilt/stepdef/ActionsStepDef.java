package autoexsel.prebuilt.stepdef;

import static com.autoexsel.test.manager.WebTestManager.*;

import autoexsel.plugins.wrapper.StepDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ActionsStepDef{

	@Given("^I open application under test$")
	public void that_user_opens_the_google_homepage() {
		setStepName(StepDetails.stepName);
		openURL("https://www.saucedemo.com/");
	}
	
	@When("^I click \"(.+)\" on \"(.+)\" page$")
	public void IClickOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).click();
	}
	
	@And("^I click \"(.+)\"$")
	public void IClickOn(String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").click();
	}

	@When("^I enter \"(.+)\" in \"(.+)\" on \"(.+)\" page$")
	public void IEnterValueOnPage(String value, String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).sendKeys(value);
	}
	
	@And("^I enter \"(.+)\" in \"(.+)\"$")
	public void IEnterValueOn(String value, String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").sendKeys(value);
	}
	
	@When("^I enter testdata \"(.+)\" in \"(.+)\" on \"(.+)\" page$")
	public void IEnterTestDataValueOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).sendKeys(page);
	}
	
	@And("^I enter testdata \"(.+)\" in \"(.+)\"$")
	public void IEnterTestDataValueOn(String value, String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").sendKeys(value);
	}
	
	@When("^I enter runtime value of \"(.+)\" in \"(.+)\" on \"(.+)\" page$")
	public void IEnterRunTimeValueOnPage(String element, String page) {
		setStepName(StepDetails.stepName);
		findElement(element, page).sendKeys(page);
	}
	
	@And("^I enter runtime value of \"(.+)\" in \"(.+)\"$")
	public void IEnterRunTimeValueOn(String value, String element) {
		setStepName(StepDetails.stepName);
		findElement(element, "null").sendKeys(value);
	}
	
	@And("^I save runtime value of \"(.+)\" in \"(.+)\"$")
	public void ISetRunTimeValue(String type, String value) {
		setStepName(StepDetails.stepName);
	}
	
}
