package com.qa.PassionTea;

import org.junit.runner.RunWith;

//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;
//
//import junit.framework.TestSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/TeaTesting.feature")

public class TestRunner {	

}
