package autoexsel.cucumber.test;

import static com.autoexsel.webdriver.WebDriverManager.*;
import static com.autoexsel.mobile.driver.AppiumDriverManager.launchMobileApplication;
import com.autoexsel.mobile.driver.AppiumDriverBase.AppType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CommonStepDefinitions {
	
	@Before
	public void startTestReport(Scenario scenario) throws Exception {
		startTest(scenario.getName());
	}

	@After
	public void endTestReport(Scenario scenario) {
		System.out.println(scenario.getName()+" :"+scenario.getStatus().toUpperCase()+"\n");
		endTest();
	}
	
	@Given("^launch mobile application on IOS$")
	public void launch_mobile_application_on_IOS() throws Throwable {
		setStepName("Given");
		launchMobileApplication(AppType.IOSAPP, "0.0.0.0:4723");
	} 
	
}
