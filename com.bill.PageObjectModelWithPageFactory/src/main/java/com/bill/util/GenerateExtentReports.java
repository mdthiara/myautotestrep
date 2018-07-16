package com.bill.util;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateExtentReports {
	
	public static ExtentReports extent;   //specify location of reports
	ExtentTest testInfo;  //what details to be populated in report
	static ExtentHtmlReporter htmlReporter;
	
	public static ExtentReports getExtentReport() {
	
		if (extent==null) {
			
			Date d=new Date();
			String fileName=d.toString().replaceAll(":","_").replace(" ", "_")+".html";
			String reportPath=(System.getProperty("user.dir")+"\\target\\ExtentsReports\\")+fileName;
			
			htmlReporter=new ExtentHtmlReporter(new File(reportPath));
			htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\ReportsConfig.xml"));
			extent=new ExtentReports();
			extent.setSystemInfo("Execution Environment", "TestQA");
			extent.attachReporter(htmlReporter);
		}
		
		
		
		return extent;
		
		
		
	}
	
	
	

}
