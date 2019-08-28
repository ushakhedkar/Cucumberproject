package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class MarketWatchPage extends TestBase{

	public MarketWatchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='optionfont select']")
	List<WebElement> TopLinks;
	
	@FindBy(linkText="Top Picks Basket")
	WebElement TopPicksBtn;
	
	@FindBy(xpath="//*[@class='inpButtonStyle orange button1']")
	List<WebElement> allOrageBtn;
	
	@FindBy(xpath="//*[@class='inpButtonStyle black button1']")
	List<WebElement> allBlackBtn;
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void verifyAllLinks()
	{
		try{
			for(int i=0;i<TopLinks.size();i++)
			{
				if(TopLinks.get(i).isEnabled()==true)			
					System.out.println(TopLinks.get(i).getText()+" is Enabled");
				else
					System.out.println(TopLinks.get(i).getText()+" is Disabled");
			}
			}catch(Throwable e)
			{
				collector.addError(e);
				System.out.println("headings are not displayed");
			}
	}
	public void verifyTopPickBtn()
	{
		try
		{
		if(TopPicksBtn.isDisplayed()==true)
		{
			if(TopPicksBtn.isEnabled()==true)
				System.out.println("Top Picks Button is Enabled");
			else
				System.out.println("Top Picks Button is Disabled");
		}
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
	
	public void verifyAllOrangeButton()
	{
		try
		{
			for(int i=0;i<allOrageBtn.size();i++)
			{
				if(allOrageBtn.get(i).isEnabled())
					System.out.println(allOrageBtn.get(i).getText()+" is Enabled");
				else
					System.out.println(allOrageBtn.get(i).getText()+" is Disabled");		
			}
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
	public void verifyAllBlackButton()
	{
		try
		{
			for(int i=0;i<allBlackBtn.size();i++)
			{
				if(allBlackBtn.get(i).isEnabled())
					System.out.println(allBlackBtn.get(i).getText()+" is Enabled");
				else
					System.out.println(allBlackBtn.get(i).getText()+" is Disabled");		
			}
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
			
}
