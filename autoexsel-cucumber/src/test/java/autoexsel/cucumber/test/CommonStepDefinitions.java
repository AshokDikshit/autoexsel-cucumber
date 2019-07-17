package autoexsel.cucumber.test;

import static com.autoexsel.webdriver.WebDriverManager.*;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

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
	
}
