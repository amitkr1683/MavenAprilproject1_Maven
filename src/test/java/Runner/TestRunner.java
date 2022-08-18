package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import frameworkUtils.ReportingUtils;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="./features/Login.feature",
        plugin ={"html:target/site/cucumber-pretty", "json:target/cucumber.json"},
        glue={"StepDefinition"},
        tags={"@Test"},
        monochrome = true
        )

public class TestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests{

        @AfterSuite
        public void generateReport(){
                ReportingUtils.generateJVMReport();
        }


}