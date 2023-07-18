package com.SfcApp.testcase;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.google.inject.internal.util.ImmutableMap;

public class MyLine extends BaseClassMobile {
	

	@Test(priority = 1)
	public void login() throws MalformedURLException, InterruptedException, AWTException{
	
		Thread.sleep(5000); 
		driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();

		CommanApp.MobileLogin(driver);
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/radioButton").click();
			
		Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys("banswara-AMIN");
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys("auriga123");
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			System.out.println("Successfully login");
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[@text='View All']").click();
			Thread.sleep(2000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/search_btn").click();
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/search_et").sendKeys("aslam-1");
			
			driver.findElementByXPath ("//android.widget.TextView[@text='aslam-1']").click();
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			driver.findElementByXPath ("//android.widget.TextView[@text='Proceed With Selected Style']").click();
			driver.findElementByXPath ("//android.widget.TextView[@text='aslam-1']").click();
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/add_btn").click();
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys("9add80ff-cc74-4cfe-8ad6-6ecee5a79def");	
			
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			// com.auriga.stitch.sfc.debug:id/planning_eff_et ---Target E
			driver.findElementByXPath("//android.widget.TextView[@text='Not Assigned']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='2-Attach W.Band Extension- Triangular Shape']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Not Assigned']").click();
			
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/search_et").sendKeys("ANIL");
			driver.findElementByXPath("//android.widget.TextView[@text='ID : 124360']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			

}
}
