Feature: sharekhan website test

Scenario: LoginPage of ShareKhan

Given user opens browser
Then user is on login page
Then user validates sharekhan logo
Then user enters username
Then user clicks on next button
Then user enters password
Then user clicks on login button

Scenario: Homepage verification

When user is on new Homepage
Then user clicks on menu button
Then user clicks on switch to old site button
Then user is on homepage
Then user verifies the user profile
Then user checks all panel headings of Home Tab 
Then user checks all panel elements of Home Tab

Scenario: ViewProfile Page Verification

When user clicks on viewprofile button
Then user is on viewprofile page
Then user verifies all headings of viewprofile page
Then user verifies all elements of viewprofile page
Then user verifies all fields of form


Scenario: Account Page Verification

When user clicks on Account tab
Then user is on Account Page
Then user checks all panel headings of Account Tab
Then user checks all panel elements of Account Tab
Then user verifies all fields of form of Fund Transfer
Then user verifies submit button

Scenario: Profile Page Verification

When user clicks on Profile Tab
Then user is on Profile Page
Then user verifies all headings of Profile tab
Then user verifies all elements of Profile tab
Then user verifies all fields of Trading Profile


Scenario: TradeNow Verification

When user clicks on TradeNow tab
Then user clicks on close button
Then user is on TradeNow Page
Then user verifies all headings of TradeNow tab
Then user verifies all elements of TradeNow tab
Then user verifies all fields of New Order Form
Then user verifies placeOrder and reset button

Scenario: Reports Page Verification

When user clicks on Reports Tab
Then user is on Reports Page
Then user verifies all report links
Then user verifies all headings of Report Page
Then user verifies all elements of Report Page


Scenario: Market Watch Page Verification

When user clicks on MarketWatch Tab
Then user is on MarketWatch Page
Then user verifies top links
Then user verifies top picks  button
Then user verifies all orange button on the page
Then user verifies all black button on the page