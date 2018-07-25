package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = "@temp",
		features = "src/test/resources/features",
		plugin = {"pretty","html:target/cucumber-report"},
		glue = "steps"
		//,dryRun = true
		)

public class CukesRunner{

}
