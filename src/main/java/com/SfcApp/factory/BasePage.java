package com.SfcApp.factory;

import com.SfcApp.report.ExtentReport;
import com.SfcApp.report.TestUtils;
import com.SfcApp.utility.BaseClassMobile;
import com.aventstack.extentreports.Status;

public class BasePage extends BaseClassMobile{
	
	TestUtils utils = new TestUtils();
	public BasePage() {
		
	}

	  public void loginstep () throws InterruptedException {
		  
	  Thread.sleep(5000); 
	  
	  
	  ExtentReport.getTest().log(Status.INFO, "Waiting for 5 sec.");
		utils.log().info("Waiting for 5 sec.");
	 // Login.getInput_UserPermission().click();
	
	//Thread.sleep(3000);
	 // driver.findElementById ("com.android.permissioncontroller:id/permission_allow_button").click();

	driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();



	// Successfully login positive testcase
	
	Thread.sleep(3000);
	driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

	Thread.sleep(3000); 
	  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
	  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
		// Actions actions = new Actions(driver);
		// Robot robot = new Robot();
	Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("userName"));
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
		//System.out.println("Successfully login");
		ExtentReport.getTest().log(Status.PASS, "Successfully login");
			utils.log().info("Successfully login");
		
}
}


