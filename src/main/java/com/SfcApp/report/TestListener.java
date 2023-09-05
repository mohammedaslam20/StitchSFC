package com.SfcApp.report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.SfcApp.report.ExtentReport;
import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.report.TestUtils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class TestListener implements ITestListener {
	TestUtils utils = new TestUtils();
	//static WebDriver driver;

	public void onTestFailure(ITestResult result) {
		if(result.getThrowable() != null) {
			  StringWriter sw = new StringWriter();
			  PrintWriter pw = new PrintWriter(sw);
			  result.getThrowable().printStackTrace(pw);
			  utils.log().error(sw.toString());
		}
		
		BaseClassMobile base = new BaseClassMobile();
		TakesScreenshot screenshot=(TakesScreenshot)base.getDriver();
		File file = screenshot.getScreenshotAs(OutputType.FILE);
	

		byte[] encoded = null;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}

		Map <String, String> params = new HashMap<String, String>();
		params = result.getTestContext().getCurrentXmlTest().getAllParameters();

//		String imagePath = "Screenshots" + File.separator + params.get("platformName")
//		+ "_" + params.get("deviceName") + File.separator + base.getDateTime() + File.separator
//		+ result.getTestClass().getRealClass().getSimpleName() + File.separator + result.getName() + ".png";
		String imagePath = "Screenshots" + File.separator + "Android"
				+ "_" + File.separator + result.getName() + ".png";
		String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;

		try {
			FileUtils.copyFile(file, new File(imagePath));
			Reporter.log("This is the sample screenshot");
			Reporter.log("<a href='"+ completeImagePath + "'> <img src='"+ completeImagePath + "' height='400' width='400'/> </a>");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ExtentReport.getTest().fail("Test Failed",
				MediaEntityBuilder.createScreenCaptureFromPath(completeImagePath).build());
		ExtentReport.getTest().fail("Test Failed",
				MediaEntityBuilder.createScreenCaptureFromBase64String(new String(encoded, StandardCharsets.US_ASCII)).build());
		ExtentReport.getTest().fail(result.getThrowable());
		ExtentReport.getTest().log(Status.FAIL, "Test Failed");
	}

	
	public void onTestStart(ITestResult result) {
		BaseClassMobile base = new BaseClassMobile();
		ExtentReport.startTest(result.getName() + " : ", result.getMethod().getDescription())
		.assignAuthor("User-"+ " # SFCApp-"+" # Screen Resolution-"  +"x");
	}

	
	public void onTestSuccess(ITestResult result) {
		ExtentReport.getTest().log(Status.PASS, "Test Passed");
		
	}

	
	public void onTestSkipped(ITestResult result) {
		ExtentReport.getTest().log(Status.SKIP, "Test Skipped");
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		
		
	}

	
	public void onFinish(ITestContext context) {
		ExtentReport.getReporter().flush();		
	}

}
