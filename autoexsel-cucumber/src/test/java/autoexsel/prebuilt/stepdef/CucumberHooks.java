package autoexsel.prebuilt.stepdef;

import static com.autoexsel.web.driver.WebUITestManager.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
