package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.NewsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewsPageSteps {
	
	HomePage hmpage;
	NewsPage news;
	
	@When("^user click on News tab$")
	public void user_click_on_News_tab() throws Throwable {
	hmpage=new HomePage();
	news=hmpage.clickOnNews();
	}

	@Then("^user is on news page$")
	public void user_is_on_news_page() throws Throwable {
	  news.validateTitle();
	}

	@Then("^user verifies all news headings$")
	public void user_verifies_all_news_headings() throws Throwable {
		news.getAllNews();
	}
	
	@Then("^user verifies all links of news page$")
	public void user_verifies_all_links_of_news_page() throws Throwable {
		 news.verifyAllElements();
	}

	@Then("^user verifies all headings of news page$")
	public void user_verifies_all_headings_of_new_page() throws Throwable {
	news.verifyAllHeadings();
	}


}
