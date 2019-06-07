package com.testing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	@Test
	public void loginTest() throws IOException {
		
			
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\chira\\OneDrive\\Desktop\\testing\\Extent Report/extent.html");
		ExtentReports extent  = new ExtentReports();
		
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("loginTest");
		
		logger.log(Status.INFO, "Logint to amazon");
		logger.log(Status.PASS, "Title Verified");
		
		extent.flush();
		
ExtentTest logger1 = extent.createTest("logoffTest");
		
		logger1.log(Status.FAIL, "failing test case");
		logger1.addScreenCaptureFromPath("C:\\Users\\chira\\OneDrive\\Desktop\\testing\\Extent Report/skdj.jpg");
		extent.flush();
		
		
		
		//for attaching screenshot 
		
		
		
		
		System.out.println("THis is login to amazon");
		
	}
	
	
	
	
}
