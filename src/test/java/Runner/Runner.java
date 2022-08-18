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
		features="./features/Mytest.feature",glue={"StepDefinition"},
		plugin ={"html:target/site/cucumber-pretty", "json:target/cucumber.json"},
		tags={"@Test"},
		monochrome = true	
	)

public class Runner extends AbstractTestNGCucumberTests {
	@AfterSuite
	public void generateReport(){
	        ReportingUtils.generateJVMReport();
	}	
}



