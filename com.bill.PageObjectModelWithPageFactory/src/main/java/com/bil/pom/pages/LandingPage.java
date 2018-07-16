package com.bil.pom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.bill.util.BLConstants;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver, ExtentTest testInfo) {
		super(driver, testInfo);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath=BLConstants.LOGIN_USERNAME)
	List<WebElement> selectionButton;
	
	public void CompanyProfile() {
		
		selectionButton.size();
		
		
	}
	
	
	
	
}
