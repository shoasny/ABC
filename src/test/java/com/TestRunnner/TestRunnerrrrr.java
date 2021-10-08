package com.TestRunnner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utiliti.TestBase_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDeff",tags= {"@Ali"})

public class TestRunnerrrrr extends AbstractTestNGCucumberTests{
	
	
@BeforeTest
public void OpenURL() {
	TestBase_Base open= new TestBase_Base();
	open.intz();
}
@AfterTest
public void CloseURL() {
	TestBase_Base close= new TestBase_Base();
	close.driver.quit();
	

}
}
