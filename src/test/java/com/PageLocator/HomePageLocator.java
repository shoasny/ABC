package com.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utiliti.TestBase_Base;

public class HomePageLocator extends TestBase_Base{
	

	public HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement Signin;
	@FindBy(how=How.XPATH, using="//a[@class='mh-btn mh-btn-primary mh-si-cold-state mh-sign-in-btn']")
	public WebElement SigninButton1;
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement Email;
	@FindBy(how=How.NAME, using="Password")
	public WebElement Password;
	@FindBy(how=How.ID, using="sign-in-button")
	public WebElement SigninButton2;
	@FindBy(how=How.XPATH, using="//span[text()='MOHAMMAD JAHAN']")
	public WebElement VerifyProfile;
	
	
	
	
	
	
	
	
	
	
	

}
