package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.IPOBondsPage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IPOBondsPageSteps {
	
	LoginPage login;
	HomePage hmpage;
	IPOBondsPage ipo;
	
	@When("^user clicks on IPO tab$")
	public void user_clicks_on_IPO_tab() throws Throwable {
	   hmpage=new HomePage();
	   ipo=hmpage.clickOnIPOBonds();
	}

	@Then("^user is on IPOBonds Page$")
	public void user_is_on_IPOBonds_Page() throws Throwable {
		ipo.validateTitle();
	}

	@Then("^user verifies top side links$")
	public void user_verifies_top_side_links() throws Throwable {
	   ipo.verifyTopLinks();
	}

	@Then("^user verifies all main links$")
	public void user_verifies_all_main_links() throws Throwable {
	   ipo.verifyAllMainLinks();
	}
	@Then("^user verifies all bottom links$")
	public void user_verifies_all_bottom_links() throws Throwable {
	    ipo.verifyBottomLinks();
	}


}
