package com.CucumberFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	@FindBy(xpath = "//a[.='SIGN-ON']")
	WebElement signon;	
	
	@FindBy(xpath = "//a[.='REGISTER']")
	WebElement register;
	
	@FindBy(xpath = "//a[.='SUPPORT']")
	WebElement support;
	
	@FindBy(xpath = "//a[.='CONTACT']")
	WebElement contact;
	
	public homepage(ChromeDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickonSignon(){
		signon.click();
	}
	
	public void clickRegister(){
		register.click();
	}
	
	
}
