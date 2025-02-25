package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles\\LoginPage.feature",glue = "StepDefinitions",dryRun = false)
public class TestRunner {
	

}
