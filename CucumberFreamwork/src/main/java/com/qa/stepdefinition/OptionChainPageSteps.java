package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.OptionChainPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OptionChainPageSteps {

	HomePage hmpage;
	OptionChainPage option;
	
	@When("^user clicks on OptionChain tab$")
	public void user_clicks_on_OptionChain_tab() throws Throwable {
	
		hmpage=new HomePage();
		option=hmpage.clickOnOptionChain();
		
	}

	@Then("^user is on OptionChain page$")
	public void user_is_on_OptionChain_page() throws Throwable {
		try{
			String title=option.verifyTitle();
			Assert.assertEquals("Option Chain - sharekhan.com, your guide to financial jungle", title);
			}catch(Throwable t)
			{
				TestBase.collector.addError(t);
			}
	}

	@Then("^user verifies option chain bar$")
	public void user_verifies_option_chain_bar() throws Throwable {
		option.verifyOptionTab();
	}
	
	@Then("^user verifies all black button$")
	public void user_verifies_all_black_button() throws Throwable {
		option.verifyAllBlackButton();
	}


	
	
}
