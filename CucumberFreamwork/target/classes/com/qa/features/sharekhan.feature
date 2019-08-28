Feature: sharekhan website testing

Scenario: Validating IPOBonds Page

When user clicks on IPO tab
Then user is on IPOBonds Page
Then user verifies top side links
Then user verifies all main links
Then user verifies all bottom links

Scenario: Validating Mutual Funds Page

When user clicks on Mutual Funds tab
Then user is on Mutual Funds page
Then user verifies links of page
Then user veries elements of page

Scenario: Validating Portfolio Page

When user clicks on Portfolio tab
Then user is on Portfolio page
Then user verifies my portfolio bar
Then user verifies all black buttons

Scenario: Validating OptionChain Page

When user clicks on OptionChain tab
Then user is on OptionChain page
Then user verifies option chain bar
Then user verifies all black button

Scenario: Validating News Page
When user click on News tab
Then user is on news page
Then user verifies all links of news page
Then user verifies all headings of news page
Then user verifies all news headings

Scenario: Validating Research Page
When user click on Research tab
Then user is on Research page
Then user verifies all links of research page
Then user verifies all research headings

Scenario: Validating CS Page
When user click on CS tab
Then user is on CS page
Then user verifies all label of CS page
Then user verifies all content of CS page