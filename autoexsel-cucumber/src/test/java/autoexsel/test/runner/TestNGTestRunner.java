package autoexsel.test.runner;

import static com.autoexsel.test.manager.WebTestManager.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "features/web/", 
		glue = { 
				"autoexsel/prebuilt/stepdef", 
				"com/custom/stepdef" 
				}, 
		tags = "@SauceDemo", 
		dryRun = false,
		plugin = { 
				"pretty",
				"json:target/cucumber-reports/report.json",
				"html:target/cucumber-reports/report.html",
				"autoexsel.plugins.wrapper.StepDetails"
				}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void setup() throws Exception {
//		printMissingLocators(LocatorType.XPath);
//		String dbPassword = db().getEncryptedPassword("TEST_PASSWORD");
//		System.out.println("dbPassword: " + dbPassword);
	}

	@AfterSuite
	public void teardown() {
		closeTestExecution();
	}
}