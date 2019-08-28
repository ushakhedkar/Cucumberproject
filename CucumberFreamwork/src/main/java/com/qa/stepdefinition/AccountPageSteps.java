package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountPageSteps {

	HomePage hmpage;
	AccountPage acpage;
	
	@When("^user clicks on Account tab$")
	public void user_clicks_on_Account_tab() throws Throwable {
		hmpage=new HomePage();
	  acpage=hmpage.clickOnAccounts();
	}

	@Then("^user is on Account Page$")
	public void user_is_on_Account_Page() throws Throwable {
		
	String title=acpage.validateAccountTitle();
	Assert.assertEquals("Fund Transfer - sharekhan.com, your guide to financial jungle", title);
	}
	
	@Then("^user checks all panel headings of Account Tab$")
	public void user_checks_all_panel_headings_of_account_tab() throws Throwable {
		acpage.verifyAllHeadings();
	}
	@Then("^user checks all panel elements of Account Tab$")
	public void user_checks_all_panel_elements_of_account_tab() throws Throwable {
	   acpage.verifyAllElements();
	}
	@Then("^user verifies all fields of form of Fund Transfer")
	public void user_verifies_all_fields_of_form_of_Fund_Transfer()
	{
		acpage.verifyAllFields();
	}
	@Then("^user verifies submit button$")
	public void user_verifies_submit_button()
	{
		acpage.verifySubmitButton();
	}
	
}
