package com.CucumberFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class flightfinderpage {
	
	@FindBy(xpath = "//*[@value='roundtrip']")
	WebElement roundtrip;
	
	@FindBy(xpath = "//*[@value='oneway']")
	WebElement oneway;
	
	@FindBy(name = "passCount")
	WebElement passCount;
	
	@FindBy(name = "fromPort")
	WebElement fromPort;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	
	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement toPort;
	
	@FindBy(name = "toMonth")
	WebElement toMonth;
	
	@FindBy(name = "toDay")
	WebElement toDay;
	
	@FindBy(xpath = "//*[@value='Coach']")
	WebElement Coach;
	
	@FindBy(xpath = "//*[@value='Business']")
	WebElement Business;
	
	@FindBy(xpath = "//*[@value='First']")
	WebElement First;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	@FindBy(name = "findFlights")
	WebElement btncontinue;
	
	public flightfinderpage(ChromeDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void selectType(String strType){
		if(strType.equals("Round Trip")){
			roundtrip.click();
		}else{
			oneway.click();
		}
	}
	
	public void selectpassengersCount(String strcount){
		Select sel = new Select(passCount);
		sel.selectByVisibleText(strcount);
	}
	
	public void selectfromPort(String strfromPort){
		Select sel = new Select(fromPort);
		sel.selectByVisibleText(strfromPort);
	}
	
	public void selectfromdate(String strfromdate){
		String[] date = strfromdate.split("/");
		Select sel;
		sel = new Select(fromMonth);
		sel.selectByVisibleText(date[0]);
		sel = new Select(fromDay);
		sel.selectByVisibleText(date[1]);
	}
	
	public void selecttoPort(String strtoPort){
		Select sel = new Select(toPort);
		sel.selectByVisibleText(strtoPort);
	}
	
	public void selecttodate(String strtodate){
		String[] date = strtodate.split("/");
		Select sel;
		sel = new Select(toMonth);
		sel.selectByVisibleText(date[0]);
		sel = new Select(toDay);
		sel.selectByVisibleText(date[1]);
	}
	
	public void selectServiceClass(String strServiceClass){
		if(strServiceClass.equals("Economy")){
			Coach.click();
		}else if(strServiceClass.equals("Business")){
			Business.click();
		}else{
			First.click();
		}
	}
	
	public void selectairline(String strairline){
		Select sel = new Select(airline);
		sel.selectByVisibleText(strairline);
	}
	
	public void clickContinue(){
		btncontinue.click();
	}

}
