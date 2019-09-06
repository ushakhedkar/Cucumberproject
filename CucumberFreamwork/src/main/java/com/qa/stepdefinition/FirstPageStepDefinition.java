package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.FirstPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FirstPageStepDefinition extends TestBase {
	
	FirstPage fpage;
	@Given("^user opens browser$")
	public void user_opens_browser()
	{
		init();
	}
	
	@Then("^user is on firstpage")
	public void user_is_on_first_page()
	{
		fpage=new FirstPage();
		
		try{
			String title=fpage.validateTitle();
			String expected="Stocks & Shares You Must Have, Best Stocks to Buy - Sharekhan";
			Assert.assertEquals(expected, title);
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
	
	@Then("^user validates logo$")
	public void user_validates_logo() throws Throwable {
		try{
	  boolean b=fpage.validateLogo();
	  Assert.assertTrue(b);
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
}
