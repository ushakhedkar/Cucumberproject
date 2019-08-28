package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	@FindBy(xpath="//a[@class='loginLogo']//img")
	WebElement logo;
	
	@FindBy(xpath="//input[@name='emailLoginId']")
	WebElement user;
	
	@FindBy(xpath="//button[@class='blk-lg-button col-sm-12 more-margin']")
	WebElement next;
	
	@FindBy(xpath="//input[@name='br_pwd']")
	WebElement psw;
	
	@FindBy(xpath="//button[@class='blk-lg-button col-sm-12 ng-binding']")
	WebElement login;
	
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	
	public void enterUsername(String username)
	{
		user.sendKeys(username);
	}
  
	public void clickOnNext()
	{
		next.click();
	}
	public void enterPassword(String password)
	{
		psw.sendKeys(password);
	}
  
	public HomePage clickOnLogin()
	{
		login.click();
		return new HomePage();
	}



}
