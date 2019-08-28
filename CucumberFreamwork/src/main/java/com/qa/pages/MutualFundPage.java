package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class MutualFundPage extends TestBase {

	public MutualFundPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="h1")
	List<WebElement> link;
	
	@FindBy(xpath="//h2[contains(text(),'MUTUAL FUND')]")
	WebElement title;
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement> elements;
	
	public void validateTitle()
	{
		try{
		    String actual=title.getText();
		    Assert.assertEquals("MUTUAL FUND", actual);
			}catch(Throwable t)
			{
				collector.addError(t);
			}	
	}
	public void verifyAllElements()
	{
		try{
			for(int i=0;i<elements.size();i++)
			{
				if(elements.get(i).isEnabled())
				{
					System.out.println(elements.get(i).getText()+" is Enabled");
				}else
				{
					System.out.println(elements.get(i).getText()+"is not Enabled");
				}
			}
			}catch(Throwable e)
			{
				collector.addError(e);
			}
	}
	public void verifyLinks()
	{
		try{
			for(int i=0;i<link.size();i++)
			{
				if(link.get(i).isEnabled())
				{
					System.out.println(link.get(i).getText()+" is Enabled");
				}else
				{
					System.out.println(link.get(i).getText()+"is not Enabled");
				}
			}
			}catch(Throwable e)
			{
				collector.addError(e);
			}
	}
}
