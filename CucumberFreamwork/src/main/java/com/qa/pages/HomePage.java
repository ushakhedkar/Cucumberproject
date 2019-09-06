package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class HomePage extends TestBase{

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//*[@class='whitelink']
	
	@FindBy(xpath="//a[@class='ng-scope']//img")
	WebElement logo;
	
	
	@FindBy(xpath="//a[@class='hamburgerMenuIcon']")
	WebElement menu;
	
	@FindBy(xpath="//a[@class='blk-sm-button']")
	WebElement switchold;
	
	@FindBy(xpath="//span[contains(text(),'USHA KHEDKAR')]")
	WebElement userpro;
	
	@FindBy(xpath="//a[contains(text(),'HOME')]")
	WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),'ACCOUNTS')]")
	WebElement Account;
	
	@FindBy(xpath="//a[contains(text(),'PROFILE')]")
	WebElement Profile;
	
	@FindBy(xpath="//a[contains(text(),'TRADE NOW')]")
	WebElement TradeNow;
	
	@FindBy(xpath="//a[contains(text(),'REPORTS')]")
	WebElement Report;
	
	@FindBy(xpath="//a[contains(text(),'MARKET WATCH')]")
	WebElement MarketWatch;
	
	@FindBy(xpath="//a[contains(text(),'IPO/BONDS')]")
	WebElement IPO;
	
	@FindBy(xpath="//a[contains(text(),'MUTUAL FUND')]")
	WebElement Mutual;
	
	@FindBy(xpath="//a[contains(text(),'PORTFOLIO')]")
	WebElement Portfolio;
	
	@FindBy(xpath="//a[contains(text(),'OPTION CHAIN')]")
	WebElement OptionChain;
	
	@FindBy(xpath="//a[contains(text(),'NEWS')]")
	WebElement News;
	
	@FindBy(xpath="//a[contains(text(),'RESEARCH')]")
	WebElement Research;
	
	@FindBy(xpath="//a[contains(text(),'CS')]")
	WebElement CS;
	
	public boolean verifyLogo()
	{
		return logo.isDisplayed();
	}
	
	public void clickOnMenu()
	{
		menu.click();
	}
	public void clickOnSwitchToOldSite()
	{
		switchold.click();
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public String verifyUser()
	{
		return userpro.getText();
	}
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	public LogOutPage clickOnLogout()
	{
		logout.click();
		return new LogOutPage();
	}
	public AccountPage clickOnAccounts()
	{
		Assert.assertTrue("Account Tab is Enabled", Account.isEnabled());
				Account.click();
				return new AccountPage();
	}
	public TradeNowPage clickOnTradeNow()
	{
		Assert.assertTrue("Trade Now Tab is Enabled", TradeNow.isEnabled());
			TradeNow.click();
			return new TradeNowPage();
	}
	public ProfilePage clickOnProfile()
	{
		Assert.assertTrue("Profile Tab is Enabled", Profile.isEnabled());
		Profile.click();
		return new ProfilePage();
	}

	public ReportsPage clickOnReports()
	{
		Assert.assertTrue("Reports Tab is Enabled", Report.isEnabled());
		Report.click();
		return new ReportsPage();
	}
	public MarketWatchPage clickOnMarketWatch()
	{
		Assert.assertTrue("Account Tab is Enabled", MarketWatch.isEnabled());
				MarketWatch.click();
				return new MarketWatchPage();
	}
	
	public IPOBondsPage clickOnIPOBonds()
	{
			Assert.assertTrue("IPO Tab is Enabled", IPO.isEnabled());
			IPO.click();
			return new IPOBondsPage();
	}
	
	public MutualFundPage clickOnMutualFunds()
	{
			Assert.assertTrue("MutualFund Tab is Enabled", IPO.isEnabled());
			Mutual.click();
			return new MutualFundPage();
	}
	public PortfolioPage clickOnPortfolio() throws InterruptedException
	{
		Thread.sleep(8000);
			Assert.assertTrue("Portfolio Tab is Enabled", Portfolio.isEnabled());
			Portfolio.click();
			return new PortfolioPage();
	}
	public NewsPage clickOnNews() throws InterruptedException
	{
			Thread.sleep(8000);
			Assert.assertTrue("News Tab is Enabled", News.isEnabled());
			News.click();
			return new NewsPage();
	}
	public ResearchPage clickOnResearch() throws InterruptedException
	{
		Thread.sleep(8000);
			Assert.assertTrue("Research Tab is Enabled", Research.isEnabled());
			Research.click();
			return new ResearchPage();
	}
	public CSPage clickOnCS() throws InterruptedException
	{
		Thread.sleep(8000);
			Assert.assertTrue("CS Tab is Enabled", CS.isEnabled());
			CS.click();
			return new CSPage();
	}
	@FindBy(tagName="h2")
	List<WebElement> allheadings;
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement> elements;
	
	@FindBy(xpath="//a[contains(text(),'View Profile')]")
	WebElement viewprobtn;
	
	public void verifyAllHeadings()
	{
		try{
		for(int i=0;i<allheadings.size();i++)
		{
			allheadings.get(i).isDisplayed();	
			System.out.println(allheadings.get(i).getText()+" heading is displayed");

		}
		}catch(Exception e)
		{
			e.getMessage();
			System.out.println("headings are not displayed");
		}
	}
	public void verifyAllElements()
	{
		try{
			for(int i=0;i<elements.size();i++)
			{
				elements.get(i).isEnabled();			
				System.out.println(elements.get(i).getText()+" is Enabled");
				
			}
			}catch(Throwable e)
			{
				collector.addError(e);		
				System.out.println("headings are not displayed");
			}
	}
	public ViewProfilePage clickOnViewProfile()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

		Assert.assertTrue("ViewProfile button is enabled", viewprobtn.isEnabled());
		viewprobtn.click();
		return new ViewProfilePage();
	}

	public OptionChainPage clickOnOptionChain() throws InterruptedException {
		Thread.sleep(8000);
		OptionChain.click();
		return new OptionChainPage();
	}
	
	
}
