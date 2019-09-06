package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class FirstPage extends TestBase {
	
	
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	@FindBy(xpath="//img[@class='main_logo']")
	WebElement logo;
	@FindBy(xpath="//li[@class='login']//a[@class='btnGreen']")
	WebElement loginbtn;
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	
	public LoginPage switchToLoginPage() throws InterruptedException
	{
		
		Set<String>handle=driver.getWindowHandles();
		
		Iterator<String> it=handle.iterator();
		
		String mainWindow=it.next();
		
		System.out.println(mainWindow);
		
		Thread.sleep(1000);
		
		loginbtn.click();
		
		handle=driver.getWindowHandles();
		
		it=handle.iterator();
		
		System.out.println("--------------After clicking-------------");
		
		mainWindow=it.next();
		String nwindow=it.next();
		
		System.out.println(mainWindow);
		System.out.println(nwindow);
		Thread.sleep(2000);
		
		driver.switchTo().window(nwindow);
		
		return new LoginPage();
	}

}
