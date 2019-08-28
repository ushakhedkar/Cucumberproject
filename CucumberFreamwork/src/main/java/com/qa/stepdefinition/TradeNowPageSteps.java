package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.TradeNowPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TradeNowPageSteps {
	
	HomePage hmpage;
	TradeNowPage trade;
	
	@When("^user clicks on TradeNow tab$")
	public void user_clicks_on_TradeNow_tab() throws Throwable {
		hmpage=new HomePage();
		trade=hmpage.clickOnTradeNow();
	}
	@Then("^user clicks on close button$")
	public void user_clicks_on_close_button() throws Throwable {
		trade.clickOnClose();
	}
	@Then("^user is on TradeNow Page$")
	public void user_is_on_TradeNow_Page() throws Throwable {
		String title=trade.verifyTitle();
		   Assert.assertEquals("New Order Form", title);
	}
	@Then("^user verifies all headings of TradeNow tab$")
	public void user_verifies_all_headings_of_TradeNow_tab() throws Throwable {
	   trade.verifyAllHeadings();
	}

	@Then("^user verifies all elements of TradeNow tab$")
	public void user_verifies_all_elements_of_TradeNow_tab() throws Throwable {
	   trade.verifyAllElements();
	}

	@Then("^user verifies all fields of New Order Form$")
	public void user_verifies_all_fields_of_New_Order_Form() throws Throwable {
	   trade.verifyAllFields();
	}
	@Then("^user verifies placeOrder and reset button$")
	public void user_verifies_placeOrder_and_reset_button() throws Throwable {
	  trade.verifyPlaceOrderButton();
	  trade.verifyResetButton();
	}

}
