package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class OptionChainPage extends TestBase{

	public OptionChainPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='inpButtonStyle black button1']")
	List<WebElement> allblackbtn;
	@FindBy(xpath="//*[@class='ps2']")
	List<WebElement> optiontab;
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public void verifyAllBlackButton()
	{
		try
		{
			for(int i=0;i<allblackbtn.size();i++)
			{
				if(allblackbtn.get(i).isEnabled())
					System.out.println(allblackbtn.get(i).getText()+" is Enabled");
				else
					System.out.println(allblackbtn.get(i).getText()+" is Disabled");		
			}
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
	public void verifyOptionTab()
	{
		try
		{
			for(int i=0;i<optiontab.size();i++)
			{
				if(optiontab.get(i).isDisplayed()==true)
					System.out.println(optiontab.get(i).getText()+" is Enabled");
				else
					System.out.println(optiontab.get(i).getText()+" is Disabled");		
			}
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
}
