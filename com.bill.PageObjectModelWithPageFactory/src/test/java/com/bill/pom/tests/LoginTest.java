package com.bill.pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bil.pom.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {
	
		testInfo=extent.createTest("loginTest");
		testInfo.log(Status.INFO, "Starting Login test");
		testInfo.log(Status.INFO, "Opening Browser");
		init("Chrome");
		
		LoginPage loginPage=new LoginPage(driver,testInfo);
		PageFactory.initElements(driver,loginPage );
		loginPage.gotoLoginPage();
		
		
		
		
		testInfo.log(Status.PASS, "TEST PASSED");		
		
		
		
		
		
		
		
	
	}
	
	
	
	@AfterMethod
	public void quit() {
		if(extent!=null) {
			extent.flush();
		}
		
	}
	
}
