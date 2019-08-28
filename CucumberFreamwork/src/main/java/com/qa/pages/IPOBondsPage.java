package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class IPOBondsPage extends TestBase{
	
	public IPOBondsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='top-navrol']//table//tbody//tr//td//div//div//div[contains(text(),'APPLY IPO')]")
	WebElement title;
	
	public void validateTitle()
	{
		try{
		    String actual=title.getText();
		    Assert.assertEquals("APPLY IPO", actual);
			}catch(Throwable t)
			{
				collector.addError(t);
			}	
		}
	
	@FindBy(xpath="//td//td//td[1]//a[1]//img[1]")
	WebElement FT;
	
	@FindBy(xpath="//td[2]//a[1]//img[1]")
	WebElement AF;
	
	@FindBy(xpath="//div[@id='mainwrapper']//td[3]//img[1]")
	WebElement OR;
	
	@FindBy(xpath="//div[@id='mainwrapper']//td[4]//img[1]")
	WebElement AB;
	
	@FindBy(xpath="//td[5]//img[1]")
	WebElement YP;
	
	@FindBy(xpath="//*[@class='Mainheading pr']")
	List<WebElement> mainlinks;
	
	@FindBy(xpath="//a[contains(text(),'IPO Terms')]")//--dashboard table
	WebElement ipoTerms;	
	@FindBy(xpath="//a[contains(text(),'IPO FAQs')]")
	WebElement ipoFAQ;
	@FindBy(xpath="//a[contains(text(),'IPOs')]")
	WebElement IPOS;
	@FindBy(xpath="//a[contains(text(),'Forthcoming IPOs')]")
	WebElement forthComing;
	@FindBy(xpath="//a[contains(text(),'New Listings')]")
	WebElement newListing;
	
	
	
	public void verifyTopLinks()
	{
		try{
			if(FT.isEnabled() && AF.isEnabled() && OR.isEnabled() && AB.isEnabled() && YP.isEnabled())
				System.out.println("All Top Links Of the Page are Displayed & Enabled");
			else
				System.out.println("All The Top links are not enabled");
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
	public void verifyAllMainLinks()
	{
		try{
			for(int i=0;i<mainlinks.size();i++)
			{
				if(mainlinks.get(i).isEnabled())
				{
					System.out.println(mainlinks.get(i).getText()+" is Enabled");
				}else
				{
					System.out.println(mainlinks.get(i).getText()+"is not Enabled");
				}
			}
			}catch(Throwable e)
			{
				collector.addError(e);
			}
	}
	public void verifyBottomLinks()
	{
		try{
			if(ipoTerms.isEnabled() && ipoFAQ.isEnabled() && IPOS.isEnabled() && forthComing.isEnabled() && newListing.isEnabled())
				System.out.println("All Bottom Links Of the Page are Displayed & Enabled");
			else
				System.out.println("All The Bottom links are not enabled");
		}catch(Throwable t)
		{
			collector.addError(t);
		}
	}
	
}
