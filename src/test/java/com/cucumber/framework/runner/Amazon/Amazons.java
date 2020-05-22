package com.cucumber.framework.runner.Amazon;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefile/Amazon/Amazon_Televison.feature"}, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\cucumber-pretty",
	    "rerun:target/rerun1.txt"}

)
public class Amazons extends AbstractTestNGCucumberTests  
{

}
 