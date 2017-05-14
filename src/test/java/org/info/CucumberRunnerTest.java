package org.info;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:src/test/output/LoginReport", "json:src/test/output/cucumber.json", 
		"pretty:src/test/output/cucumber-pretty.txt", "usage:src/test/output/cucumber-usage.json",
		"junit:src/test/output/cucumber-results.xml" }, 
features = "classpath:features/cucumberJava.feature", glue = {"classpath: stepDefinition"})
public class CucumberRunnerTest {

}
