package cucumberRunner;

import static com.autoexsel.webdriver.WebDriverManager.*;
import org.testng.annotations.AfterSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "features/", glue = "autoexsel/cucumber/", tags = { "@verifyStepDef" }
)
public class WebTestRunner extends AbstractTestNGCucumberTests {
	@AfterSuite
	public void teardown() {
		closeExecution();
	}
}
