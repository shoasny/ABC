package com.PageAction;

import org.testng.Assert;

import com.PageLocator.HomePageLocator;
import com.utiliti.TestBase_Base;

public class HomePageAction extends TestBase_Base{
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void ClickSigninLinks() {
		
		homePageLocator.Signin.click();
		}
	public void ClickSignin1Buttons() {
		homePageLocator.SigninButton1.click();
	}
	public void UserLogin(String U, String P) {
		homePageLocator.Email.sendKeys(U);
		homePageLocator.Password.sendKeys(P);
		homePageLocator.SigninButton2.click();
	}
	public void VerifyUsershouldLoginSuccessfully() {
		boolean profilepage =homePageLocator.VerifyProfile.isDisplayed();
		Assert.assertTrue(profilepage);
		
	}

}
