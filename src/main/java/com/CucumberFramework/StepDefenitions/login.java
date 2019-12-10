package com.CucumberFramework.StepDefenitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.CucumberFramework.Pages.homepage;
import com.CucumberFramework.Pages.signonpage;
import com.CucumberFramework.Utils.ReadPropertyFile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login {
	
	ChromeDriver driver;
	signonpage signon;
	
	@Given("^User is on Mercury Login Page$")
	public void user_is_on_Mercury_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		String appUrl = ReadPropertyFile.get("url");
		driver.get("http://newtours.demoaut.com/");
		homepage home = new homepage(driver);
		home.clickonSignon();
	}

	@And("^User enters Username$")
	public void user_enters_Username() throws Throwable {
		signon = new signonpage(driver);
		signon.enterUsername("admin");
	}

	@And("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		signon.enterPassword("mercury");
	}

	@When("^User click on Signin button$")
	public void user_click_on_Signin_button() throws Throwable {
		signon.clickonLogin();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   Assert.assertTrue("User Logged in Successfully", driver.getTitle().contains("Find a Flight"));	    
	}


}
