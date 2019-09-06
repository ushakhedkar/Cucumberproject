package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class CSPage extends TestBase {

	public CSPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='help-label']")
	List<WebElement>allLabel; 
	
	@FindBy(xpath="//*[@class='sub-help']")
	List<WebElement>allContent; 
	
	@FindBy(xpath=	"//div[@class='help-label']")
	WebElement title;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	public void validateTitle()
	{
		try{
		    String actual=title.getText();
		    Assert.assertEquals("Need Help?", actual);
			}catch(Throwable t)
			{
				collector.addError(t);
			}	
	}
	
	public void getAllLabel()
	{
		try{
			for(int i=0;i<allLabel.size();i++)
			{
					System.out.println(allLabel.get(i).getText());
			}
			}catch(Throwable e)
			{
				collector.addError(e);
			}
	}
	public void getAllContent()
	{
		try{
			for(int i=0;i<allContent.size();i++)
			{
					System.out.println(allContent.get(i).getText());
			}
			}catch(Throwable e)
			{
				collector.addError(e);
			}
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(8000);
		logout.click();
	}
}
