package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.FirstPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends TestBase{
	
	FirstPage fpage;
	LoginPage login;
	HomePage hmpage;
	
	
	@When("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	 
		fpage=new FirstPage();
		login = fpage.switchToLoginPage();
		String expected="Sharekhan Online Trading Account Login";
		String actual=login.validateTitle();
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	
	}
	@Then("^user validates sharekhan logo$")
	public void user_validates_sharekhan_logo() throws Throwable {
	  boolean b= login.validateLogo();
	  Assert.assertTrue(b);
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
		   login.enterUsername(prop.getProperty("username"));
	}

	@Then("^user clicks on next button$")
	public void user_clicks_on_next_button() throws Throwable {
		login.clickOnNext();
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
	 login.enterPassword(prop.getProperty("password"));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		hmpage=login.clickOnLogin();
	}
	
	
}
