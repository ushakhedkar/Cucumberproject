package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ViewProfilePage extends TestBase {
	
	public ViewProfilePage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//div[@class='bkListH1']")
	WebElement title;
	
	@FindBy(tagName="h2")
	List<WebElement> allheadings;
	
	@FindBy(xpath="//*[@class=\"trAlt\"]")
	List<WebElement> allfields;
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement> elements;
	
	public String verifyTitle()
	{
		return title.getText();
	}
	
	public void verifyAllHeadings()
	{
		try{
		for(int i=0;i<allheadings.size();i++)
		{
			allheadings.get(i).isDisplayed();	
			System.out.println(allheadings.get(i).getText()+" heading is displayed");

		}
		}catch(Throwable e)
		{
			collector.addError(e);
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
	
	public void verifyAllFields()
	{
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	        
			for(int i=0;i<allfields.size();i++)
			{
				Assert.assertTrue(allfields.get(i).isDisplayed());	
				System.out.println(allfields.get(i).getText()+" Field is displayed");

			}
			}catch(Throwable e)
			{
				collector.addError(e);
				System.out.println("headings are not displayed");
			}
	}
}
