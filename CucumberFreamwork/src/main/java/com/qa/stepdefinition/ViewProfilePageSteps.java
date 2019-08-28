package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.ViewProfilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ViewProfilePageSteps {

	HomePage hmpage;
	ViewProfilePage profile;
	
	@When("^user clicks on viewprofile button$")
	public void user_clicks_on_viewprofile_button() throws Throwable {
		hmpage=new HomePage();
		profile= hmpage.clickOnViewProfile();
	}

	@Then("^user is on viewprofile page$")
	public void user_is_on_viewprofile_page() throws Throwable {
	   String title=profile.verifyTitle();
	   Assert.assertEquals("View Profile", title);
	}

	@Then("^user verifies all headings of viewprofile page$")
	public void user_verifies_all_headings_of_viewprofile_page() throws Throwable {
	   profile.verifyAllHeadings();
	}

	@Then("^user verifies all elements of viewprofile page$")
	public void user_verifies_all_elements_of_viewprofile_page() throws Throwable {
	  profile.verifyAllElements();
	}
	
	@Then("^user verifies all fields of form$")
	public void user_verifies_all_fields_of_form()
	{
		profile.verifyAllFields();
	}

}
