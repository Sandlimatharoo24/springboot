package org.info;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/output/LoginReport", "json:target/output/cucumber.json", 
		"pretty:target/output/cucumber-pretty.txt", "usage:target/output/cucumber-usage.json",
		"junit:target/output/cucumber-results.xml" }, 
features = "src/test/javafeatures/cucumbava.feature", glue = {"stepdefinition"})
public class CucumberRunnerTest {

}
