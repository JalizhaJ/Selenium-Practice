package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Resources/features/hooks.feature",
		glue={"stepDefinitions"},
		format= {"pretty", "html:test-output"},
		dryRun = false,
		strict = true,
		monochrome = true
		//tags = {"@SmokeTest, @RegressionTest"}
		)

public class TestRunner {

}


/*
dryRun - check the mapping of feature file and step definition
features - path of the feature file
glue - path of the step definition
format - to get the output in required format
strict - fail the run if any step is not defined in step definition
monochrome - to get output in proper readable format
tags - 
*/