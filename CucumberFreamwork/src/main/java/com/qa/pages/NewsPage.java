package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class NewsPage extends TestBase {
	
	public NewsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=	"//div[@class='bkListH1']")
	WebElement title;
	
	@FindBy(tagName="h2")
	List<WebElement> allheadings;
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement> elements;
	
	@FindBy(xpath="//*[@class='header']")
	List<WebElement> allNews;
	
	
	public void validateTitle()
	{
		try{
		    String actual=title.getText();
		    Assert.assertEquals("Sharekhan News > Must Know News", actual);
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
				if(elements.get(i).isEnabled()==true)
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
	
	public void getAllNews()
	{
		try{
			for(int i=0;i<allNews.size();i++)
			{
					System.out.println(allNews.get(i).getText());
			}
			}catch(Throwable e)
			{
				collector.addError(e);
			}
	}
}
