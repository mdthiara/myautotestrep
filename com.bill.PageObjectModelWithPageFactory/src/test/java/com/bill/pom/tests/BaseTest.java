package com.bill.pom.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.bill.util.GenerateExtentReports;

public class BaseTest {

	WebDriver driver;
	public ExtentReports extent=GenerateExtentReports.getExtentReport();
	public ExtentTest testInfo;
	public void init(String bType) {
		if (bType.equalsIgnoreCase("Mozilla"))
			driver=new FirefoxDriver();
		else if (bType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	

}
