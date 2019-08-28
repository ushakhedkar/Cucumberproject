package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.PortfolioPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PortofoilPageSteps {
	
	HomePage hmpage;
	PortfolioPage portfolio;
	
	
	@When("^user clicks on Portfolio tab$")
	public void user_clicks_on_Portfolio_tab() throws Throwable {
	  hmpage=new HomePage();
	  portfolio=hmpage.clickOnPortfolio();
	}
	@Then("^user is on Portfolio page$")
	public void user_is_on_Portfolio_page() throws Throwable {
		try{
		String title=portfolio.verifyTitle();
		Assert.assertEquals("My Portfolio - sharekhan.com, your guide to financial jungle", title);
		}catch(Throwable t)
		{
			TestBase.collector.addError(t);
		}
	}

	@Then("^user verifies my portfolio bar$")
	public void user_verifies_my_portfolio_bar() throws Throwable {
		portfolio.verifyMyPortfolio();
	}

	@Then("^user verifies all black buttons$")
	public void user_verifies_all_black_buttons() throws Throwable {
		portfolio.verifyAllBlackButton();
	}



}
