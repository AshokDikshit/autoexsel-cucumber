package autoexsel.prebuilt.stepdef;

import static com.autoexsel.test.manager.WebTestManager.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
	
	@Before
	public void beforeTestScenarios(Scenario scenario) throws Exception {
		startTestReport(scenario);
	}

	@After
	public void afterTestScenarios(Scenario scenario) {
		endTestReport();
	}
}
