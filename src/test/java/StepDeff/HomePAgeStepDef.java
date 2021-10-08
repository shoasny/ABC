package StepDeff;

import org.apache.log4j.Logger;

import com.PageAction.HomePageAction;
import com.utiliti.LogGenerate;
import com.utiliti.TestBase_Base;
import com.utiliti.utilityy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePAgeStepDef extends TestBase_Base{
	
	Logger logg = LogGenerate.getlogs(LogGenerate.class);
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^OpenURL \"([^\"]*)\"$")
	public void openurl(String URLURL) throws Throwable {
		launchURL(URLURL);
		logg.info("Opening URL");
		
	}

	@Then("^Click Signin Links$")
	public void click_Signin_Links() throws Throwable {
		homePageAction.ClickSigninLinks();
		logg.info("Clicking Signin Links");
	}

	@Then("^Click Signin1 Buttons$")
	public void click_Signin1_Buttons() throws Throwable {
		homePageAction.ClickSignin1Buttons();
	}

	@Then("^Enter Emails and Passwords$")
	public void enter_Emails_and_Passwords() throws Throwable {
		homePageAction.UserLogin(proo.getProperty("username1"), proo.getProperty("Password1"));
	}

	@Then("^Verify User should Login Successfully$")
	public void verify_User_should_Login_Successfully() throws Throwable {
		homePageAction.VerifyUsershouldLoginSuccessfully(); 
		utilityy.takescreenshot(driver, "User Profile page");
		
	}



}
