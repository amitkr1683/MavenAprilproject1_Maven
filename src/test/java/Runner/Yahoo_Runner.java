package Runner;

import org.junit.runner.RunWith;
//import org.testng.annotations.AfterSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import frameworkUtils.ReportingUtils;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features/YahooTest.feature", plugin = { "html:target/site/cucumber-pretty",
		"json:target/cucumber.json" }, glue = { "StepDefinition" }, tags = { "@Test" }, monochrome = true)

public class Yahoo_Runner extends io.cucumber.testng.AbstractTestNGCucumberTests {

	public void generateReport() {
		ReportingUtils.generateJVMReport();

	}
}
