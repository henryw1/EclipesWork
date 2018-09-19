package com.qa.PassionTea;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

import junit.framework.TestSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features = "classpath")

public class TestRunner {
	
	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(TestSuite.class);
		
		for (Failure fail : res.getFailures()) {
			System.out.println(fail.toString());
		}
		
		System.out.println(res.wasSuccessful());
	}

}
