package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.LogOutPage;

import cucumber.api.java.en.Then;

public class LogOutPageStepDefinition {
	
	HomePage hmpage;
	LogOutPage logout;
	
	@Then("^user clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
		hmpage=new HomePage();
		logout=hmpage.clickOnLogout();
		}
	@Then("^user close the browser")
	public void user_close_the_browser()
	{
		logout.closeBrowser();
	}
}
