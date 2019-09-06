package com.qa.pages;


import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LogOutPage extends TestBase{

	public LogOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
