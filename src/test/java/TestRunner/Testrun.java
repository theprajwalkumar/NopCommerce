package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { ".//FeatureFile" }, 
glue="AddCustomerStepDefination", 
dryRun = false, monochrome = true,
plugin = {
		"pretty", "html:target/Cucumber-report/Register1.html" },

		tags = "@tag1"

)

//the cucumber file will always be empty

public class Testrun {

}
