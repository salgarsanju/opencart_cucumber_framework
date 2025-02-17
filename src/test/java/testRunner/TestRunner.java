package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/"},
        glue = "stepDefinitions", 
        plugin = { "pretty",
		"html:reports/myreport.html" },
         dryRun=true)
public class TestRunner {

}
