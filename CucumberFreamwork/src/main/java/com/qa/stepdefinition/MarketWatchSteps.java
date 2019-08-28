package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.MarketWatchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MarketWatchSteps {

	HomePage hmpage;
	MarketWatchPage market;
	
	@When("^user clicks on MarketWatch Tab$")
	public void user_clicks_on_MarketWatch_Tab() throws Throwable {
	  
		hmpage=new HomePage();
		market=hmpage.clickOnMarketWatch();
	}

	@Then("^user is on MarketWatch Page$")
	public void user_is_on_MarketWatch_Page() throws Throwable {
		String title=market.verifyTitle();
		Assert.assertEquals("Market Watch - sharekhan.com, your guide to financial jungle", title);
	}

	@Then("^user verifies top links$")
	public void user_verifies_top_links()  {
	    market.verifyAllLinks();
	}

	@Then("^user verifies top picks  button$")
	public void user_verifies_top_picks_button() throws Throwable {
		market.verifyTopPickBtn();
	}

	@Then("^user verifies all orange button on the page$")
	public void user_verifies_all_orange_button_on_the_page() throws Throwable {
		market.verifyAllOrangeButton();
	}

	@Then("^user verifies all black button on the page$")
	public void user_verifies_all_black_button_on_the_page() throws Throwable {
		market.verifyAllBlackButton();
	}
	
}
