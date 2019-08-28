package com.qa.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.qa.util.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="H:\\Documents\\java projects\\CucumberFreamwork\\src\\main\\java\\com\\qa\\features",//the path of features file
	glue={"com/qa/stepdefinition"},//the path of step definition file
	//tags={"@SmokeTest","@RegressionTest","@EndToEndTest"},
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:BDDControlCenterTools/target/Reports/cucumber-report.html"},
	format ={"pretty","html: test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
	monochrome=true , //display the console in a readable format
	strict = true, //it will check if any step is not defined in step definition file
	dryRun=false)


public class MyRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
	
}
