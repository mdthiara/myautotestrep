package com.bil.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bill.util.BLConstants;

public class LoginPage extends BasePage {

	
	
	@FindBy(xpath=BLConstants.LOGIN_USERNAME)
	public WebElement email;
	
	@FindBy(xpath=BLConstants.LOGIN_PASSWORD)
	public WebElement psswd;
	
	@FindBy(xpath=BLConstants.SUBMIT_BUTTON)
	public WebElement submit;
	
	
	
	public LoginPage(WebDriver driver,ExtentTest testInfo) {
		super(driver, testInfo);
		
	
	}
	
	public Object gotoLoginPage() {
		testInfo.log(Status.INFO,"Opening the URL - "+BLConstants.HOME_URL);
		driver.get(BLConstants.HOME_URL);
		testInfo.log(Status.INFO,"URL opening Success");
		testInfo.log(Status.INFO,"Logging in for UserName - "+BLConstants.USERNAME_EMAIL);
	    email.sendKeys(BLConstants.USERNAME_EMAIL);
	    psswd.sendKeys(BLConstants.USERNAME_PASSWORD);
	    submit.click();	 
	    String title =driver.getTitle();
        if(title.equals("Business Bill Payment | Pay Online and Get Paid"))
        {
          
    	    testInfo.log(Status.INFO,"Logging Success ");
    	    return PageFactory.initElements(driver, LandingPage.class);	
        }
        else {
        	 testInfo.log(Status.FAIL,"Logging FAILED ");
     	    return PageFactory.initElements(driver, LoginPage.class);	
             }
       		
	}
	
	
	
	
	

}
