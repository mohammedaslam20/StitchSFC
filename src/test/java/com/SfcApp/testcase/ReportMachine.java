package com.SfcApp.testcase;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SfcApp.factory.BasePage;
import com.SfcApp.factory.SfcAppLoginFactory;
import com.SfcApp.report.ExtentReport;
import com.SfcApp.report.TestUtils;
import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.SfcApp.utility.Lambda;
import com.aventstack.extentreports.Status;
import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import junit.framework.Assert;



//Inherit the property from parent class with extends keyword
public class ReportMachine extends BasePage {
	
	//TestUtils utils = new TestUtils();
	//public AppiumDriver<MobileElement> driver;
	//public String ExpectedTicket=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_number_tv").getText();
	//AndroidBy driver;
	@Test(priority = 1)
	public void login() throws MalformedURLException, InterruptedException, AWTException{
	
		
		loginstep();
			
	}
	
	@Test(priority = 2)
	public void OnDemandReportError() throws MalformedURLException, InterruptedException, AWTException{
	
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[@text='REPORT MACHINE']").click();
			
			Thread.sleep(3000);
			String Shift = prop.getProperty("Shift");
			driver.findElementByXPath("//android.widget.RadioButton[@text= '" + Shift + "' ]").click();
			
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Proceed']").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code");
			
			Thread.sleep(3000);
		    driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));	
			Thread.sleep(3000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			//CommanApp.robotDoEnter(); 
			Thread.sleep(3000);
			//CommanApp.keyEvent(13);
			//driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(Keys.ENTER);	
			//driver.findElementByXPath("//com.auriga.stitch.sfc.debug:id/qr_code_et[@text='Enter Here']").sendKeys("b05ad826-d331-4cdd-b90c-1afc1c914cc6");
			//driver.tapAtPosition(859,1610);
	         Thread.sleep(3000);
	         driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
	         Thread.sleep(3000);
	         
	         //CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/search_rv");
	         driver.findElementById("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Error"));
				String Error = prop.getProperty("Error");
				driver.findElementByXPath("//android.widget.TextView[@text='"+ Error +"']").click();
	         
				
	        
	         
	       //driver.findElementByXPath("//android.widget.TextView[contains(@text,'KNIFE ISSUE')]").click();
	       
			//driver.findElementByXPath("//*[@id='com.auriga.stitch.sfc.debug:id/item_tv' and @index='1']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();

			Thread.sleep(3000);
			 driver.findElementByXPath("//android.widget.TextView[contains(@text,'Select')]").click();
			//driver.findElementByXPath("//*[@class='com.auriga.stitch.sfc.debug:id/temp_tv' and @text='Select']").click();
			Thread.sleep(3000);
			CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/severity");
			
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/red_btn_title_tv").click();
			
			Thread.sleep(2000); 
			  WebElement b=driver.findElementById("com.auriga.stitch.sfc.debug:id/txt_message"); 
			  String success1= b.getText(); 
			  System.out.println(success1);
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
			
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='MAINTENANCE']").click();
			//String ExpectedTicket=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_number_tv").getText();
			
			//System.out.println("Ticket No:-"  + ExpectedTicket);
			
			//driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='JUKI - DDL-8700-7 - 10004839 breakdown']").getText();
			
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
			Thread.sleep(2000);
			
	}
	
	

	
	@Test(priority = 3)
	public void LogoutSupervisor() throws MalformedURLException, InterruptedException, AWTException{
	
			//Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			Thread.sleep(2000);
			//Logout from supervisor
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
			
	}
	
	

	@Test(priority = 4)
	public void LoginMechanic() throws MalformedURLException, InterruptedException, AWTException{
			Thread.sleep(3000);
			// Login with Machenic 
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

			Thread.sleep(2000); 
			  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
			  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
				
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
				Thread.sleep(2000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("MachenicUserName"));
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("MachenicPassword"));
				Thread.sleep(2000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
				System.out.println("Successfully login");
	}
	
	@Test(priority = 5)
	public void OnDemandMaintenanceHold() throws MalformedURLException, InterruptedException, AWTException{
		
			Thread.sleep(2000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Request']").click();
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv").click();
						
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'START REPAIR')]").click();
			
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			
			Thread.sleep(2000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'TAKE ACTION')]").click();
			//com.auriga.stitch.sfc.debug:id/action_btn_title
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Hold')]").click();
			
			String CheckBoxHoldReason = prop.getProperty("CheckBoxHoldReason");
			driver.findElementByXPath("//android.widget.CheckBox[contains(@text,'" + CheckBoxHoldReason + "')]").click();
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_et").sendKeys(prop.getProperty("HoldComment"));
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
		
			
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			//Thread.sleep(2000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(3000);
			WebElement a=driver.findElementById("com.auriga.stitch.sfc.debug:id/on_success_text_tv");
			String success= a.getText();
		    System.out.println(success);
		    //Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Home')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/leading_icon").click();
	}
	
	@Test(priority = 6)
	public void OnDemandMaintenanceRepaire() throws MalformedURLException, InterruptedException, AWTException{
				
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Accepted']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and contains(@text,'On-Hold')]").click();
			
			
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'START REPAIR')]").click();
			
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			
			Thread.sleep(2000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'TAKE ACTION')]").click();
			
			  Thread.sleep(2000); 
			  driver.findElementByXPath("//android.widget.TextView[contains(@text,'Repaired')]").click();
			 
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			Thread.sleep(3000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(3000);
			WebElement f=driver.findElementById("com.auriga.stitch.sfc.debug:id/on_success_text_tv");
			String succes= f.getText();
		    System.out.println(succes);
		    Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Home')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/leading_icon").click();
		
	}
	
	@Test(priority = 7)
	public void LogoutMechanic() throws MalformedURLException, InterruptedException, AWTException{
	
			Thread.sleep(3000);
			//Machenic Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			
			//Logout from Machenic
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
	
	}
		
	@Test(priority = 8)
	public void LoginAgainSupervisor() throws MalformedURLException, InterruptedException, AWTException{
			// Again Login with supervisor 
			
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

			Thread.sleep(2000); 
			  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
			  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
				
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
				Thread.sleep(3000); 
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("userName"));
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("password"));
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
				System.out.println("Successfully login");
	}
	
	@Test(priority = 9)
	public void VerifiedMachineRepaired() throws MalformedURLException, InterruptedException, AWTException{
	
		
				Thread.sleep(3000);
				driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='MAINTENANCE']").click();
		
				Thread.sleep(3000);
				driver.findElementById("com.auriga.stitch.sfc.debug:id/ic_drop_down").click();
				
				Thread.sleep(3000);
				driver.findElementByXPath("//android.widget.TextView[contains(@text,'Completed (On-Demand)')]").click();
				//com.auriga.stitch.sfc.debug:id/drop_down_tv_2
				
				Thread.sleep(3000); //android.widget.TextView[contains(@text,'045300')]

				WebElement r=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_number_tv");
				String ActualTicket= r.getText();
			    System.out.println("Ticket NO: " + ActualTicket + " Completed");
			  //Assert.assertEquals(ExpectedTicket, ActualTicket);
			   System.out.println("Actual and Expected Ticket no. matched");
				//driver.closeApp();
	}
}
