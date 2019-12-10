package com.CucumberFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signonpage {
	
	@FindBy(name = "userName")
	WebElement userName;	
	
	@FindBy(name = "password")
	WebElement password;	
	
	@FindBy(name = "login")
	WebElement login;	
	
	public signonpage(ChromeDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String strUsername){
		userName.sendKeys(strUsername);
	}
	
	public void enterPassword(String strPassword){
		password.sendKeys(strPassword);
	}
	
	public void clickonLogin(){
		login.click();
	}
}
