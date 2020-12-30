package cucumberRunner;

import static com.autoexsel.webdriver.WebDriverManager.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "features/", glue = "autoexsel/cucumber/", tags = { "@verifyStepDef" })
public class WebTestRunner extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void setup() throws Exception {
//		printMissingLocators(LocatorType.XPath);
//		String dbPassword = db().getEncryptedPassword("TEST_PASSWORD");
//		System.out.println("dbPassword: " + dbPassword);
	}

	@AfterSuite
	public void teardown() {
		closeExecution();
	}
}
