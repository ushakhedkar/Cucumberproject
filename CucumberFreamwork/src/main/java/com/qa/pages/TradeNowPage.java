package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class TradeNowPage extends TestBase{
	
	public TradeNowPage()
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//button[contains(text(),'X')]")
	WebElement close;
	
	@FindBy(xpath="//div[@class='bkListH1']")
	WebElement title;
	public void clickOnClose() throws InterruptedException
	{
		Thread.sleep(8000);
		close.click();
	}
	public String verifyTitle()
	{
		return title.getText();
	}
	@FindBy(tagName="h2")
	List<WebElement> allheadings;
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement> elements;
	
	@FindBy(xpath="//*[@class='middle-ui']")
	List<WebElement> fields;
	
	@FindBy(xpath="//input[@id='placeOrderbutton']")
	WebElement placeOrder;
	
	@FindBy(xpath="//input[@name='Reset']")
	WebElement reset;
	
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
				System.out.println("Field are not Enabled");
			}
	}
	public void verifyPlaceOrderButton()
	{
		Assert.assertTrue("Reset Button is Enabled", placeOrder.isEnabled());
	}
	public void verifyResetButton()
	{
		Assert.assertTrue("Reset Button is Enabled", reset.isEnabled());
	}
}
