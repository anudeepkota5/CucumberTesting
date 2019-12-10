package com.CucumberFramework.StepDefenitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.CucumberFramework.Pages.flightfinderpage;
import com.CucumberFramework.Pages.homepage;
import com.CucumberFramework.Pages.signonpage;
import com.CucumberFramework.Utils.ReadPropertyFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class reservation {
	
	ChromeDriver driver;
	homepage home;
	signonpage signon;
	flightfinderpage flight;
	
	@Given("^User is on Mercury Flight Reservation Application$")
	public void user_is_on_Mercury_Flight_Reservation_Application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		String appUrl = ReadPropertyFile.get("url");
		driver.get("http://newtours.demoaut.com/");
		home = new homepage(driver);
		home.clickonSignon();
	}

	@Then("^User logsin to the Application successfully$")
	public void user_logsin_to_the_Application_successfully() throws Throwable {
		signon = new signonpage(driver);
		signon.enterUsername("admin");
		signon.enterPassword("mercury");
		signon.clickonLogin();
	}

	@Then("^Select the required flight tickets name ([^\"]*)$")
	public void select_the_required_flight_tickets_name(String arg1) throws Throwable {
		System.out.println(arg1);
		flight = new flightfinderpage(driver);
		flight.selectType(arg1.trim());
		flight.selectpassengersCount("2");
		flight.selectfromdate("November/26");
		flight.selectfromPort("London");
		flight.selecttoPort("Paris");
		flight.selecttodate("November/28");
		flight.selectServiceClass("Business");
		flight.selectairline("Unified Airlines");
		flight.clickContinue();
	}

	@Then("^User verify the price of the tickets$")
	public void user_verify_the_price_of_the_tickets() throws Throwable {
		System.out.println("User verify the price of the tickets");
	}

	@When("^User makes a successfull payment and buy the tickets$")
	public void user_makes_a_successfull_payment_and_buy_the_tickets() throws Throwable {
		System.out.println("User makes a successfull payment and buy the tickets");
	}

	@Then("^Tickets are will be available for the user to print$")
	public void tickets_are_will_be_available_for_the_user_to_print() throws Throwable {
		System.out.println("Tickets are will be available for the user to print");
	}


}
