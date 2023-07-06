package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/resources/features/"},
glue={"step_definition"},
dryRun = false, 
publish = true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:report/cucumber-reports.html", "json:report/cucumber-reports.json"},
monochrome=true)
public class Runner {
	
}
