package com.CucumberFramework.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testrunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(
	 features = "Feature"
	 ,glue={"com.CucumberFramework.StepDefenitions"}
	 )
	 
	public class TestRunner {
	 
	}

}
