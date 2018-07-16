package com.bil.pom.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;


public class BasePage {
	
	public WebDriver driver;
	public TopMenu menu;
	public ExtentTest testInfo;
		
	public BasePage(WebDriver driver,ExtentTest testInfo) {
	this.driver=driver;
	this.testInfo=testInfo;
menu=PageFactory.initElements(driver, TopMenu.class);
	}
	


public String verifyText(String locator,String expectedText) {
	
	return "";
	
}

public boolean isElementPresent() {
	
	return false;
	
}


public  void takeScreenShot(){
	Date d=new Date();
	String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
	String filePath=(System.getProperty("user.dir")+"\\Screenshots\\")+screenshotFile;
	// store screenshot in that file
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(scrFile, new File(filePath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		testInfo.addScreenCaptureFromPath(filePath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}




}
