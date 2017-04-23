package com.stay.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber",
				"json:target/report.json"},
		features="./src/test/resources/com/stay/features",
		glue="com/stay/stepdefs"
		//dryrun
		//tags
		
		
		)
public class CukesRunner {

}
