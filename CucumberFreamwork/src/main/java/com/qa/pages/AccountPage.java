package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AccountPage extends TestBase {

	public AccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateAccountTitle()
	{
		return driver.getTitle();
	}
	
	@FindBy(xpath="//*[@class='middle-ui']")
	List<WebElement> fields;
	
	@FindBy(tagName="h2")
	List<WebElement> allheadings;
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement> elements;
	
	@FindBy(xpath="//input[@name='btn']")
	WebElement submit;
	
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
			}catch(Exception e)
			{
				e.getMessage();
				System.out.println("headings are not displayed");
			}
	}
	public void verifyAllFields()
	{
		try{
			for(int i=0;i<fields.size();i++)
			{
				if(fields.get(i).isEnabled())
				{
					System.out.println(fields.get(i).getText()+" is Enabled");
				}else
				{
					System.out.println(fields.get(i).getText()+"is not Enabled");
				}
			}
			}catch(Exception e)
			{
				e.getMessage();
				System.out.println("headings are not displayed");
			}
	}
	public void verifySubmitButton()
	{
		Assert.assertTrue("Submit Button is Displayed", submit.isDisplayed());
		Assert.assertTrue("Submit Button is Enabled", submit.isEnabled());
	}
}
