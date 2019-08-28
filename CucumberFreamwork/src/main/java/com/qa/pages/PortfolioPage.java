package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class PortfolioPage extends TestBase{
	
	public PortfolioPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	@FindBy(xpath="//div[contains(text(),'My Portfolio')]")
	WebElement portfolio;
	@FindBy(xpath="//*[@class='inpButtonStyle black button1']")
	List<WebElement> allBlackBtn;
	//*[@class='orgbg1']
	public void verifyMyPortfolio()
	{
		portfolio.getText();
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
