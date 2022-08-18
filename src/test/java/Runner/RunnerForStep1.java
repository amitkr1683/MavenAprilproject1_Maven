package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import frameworkUtils.ReportingUtils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",glue={"StepDefinition"},
		features="./features/Login1.feature",glue={"StepDefinition"}, dryRun= false,
		plugin ={"html:target/site/cucumber-pretty", "json:target/cucumber.json"},
		tags={"@Test"},
		monochrome = true	
	)

public class RunnerForStep1 extends AbstractTestNGCucumberTests {
	@AfterSuite
	public void generateReport(){
	        ReportingUtils.generateJVMReport();
	}	
}
  