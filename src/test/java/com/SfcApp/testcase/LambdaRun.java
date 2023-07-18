package com.SfcApp.testcase;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.SfcApp.utility.Lambda;
import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



//Inherit the property from parent class with extends keyword

//public class AppLogin extends BaseClassMobile 

public class LambdaRun extends Lambda {


	@Test(priority = 1)
	public void login() throws MalformedURLException, InterruptedException, AWTException {
		
		
		Thread.sleep(3000);
		driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();

		// TODO Auto-generated method stub

		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//android.widget.TextView[contains(@text,'SKIP')]").click();

		// Successfully login positive testcase
		CommanApp.MobileLogin(driver);
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

		Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/radioButton").click();
			// Actions actions = new Actions(driver);
			// Robot robot = new Robot();
			 
			// Robot robot =new Robot();
			
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys("banswara-AMIN");
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys("auriga123");
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			System.out.println("Successfully login");
			
			Thread.sleep(5000);
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[@text='REPORT MACHINE']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.RadioButton' and @text='DAMAN - Day Shift']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Proceed']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
		//WebElement p= driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et");
		//p.sendKeys("9add80ff-cc74-4cfe-8ad6-6ecee5a79def");
		driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys("9add80ff-cc74-4cfe-8ad6-6ecee5a79def");	
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
	       driver.findElementByXPath("//android.widget.TextView[contains(@text,'KNIFE ISSUE')]").click();
	       
			//driver.findElementByXPath("//*[@id='com.auriga.stitch.sfc.debug:id/item_tv' and @index='1']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();

			Thread.sleep(3000);
			 driver.findElementByXPath("//android.widget.TextView[contains(@text,'Select')]").click();
			//driver.findElementByXPath("//*[@class='com.auriga.stitch.sfc.debug:id/temp_tv' and @text='Select']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'High')]").click();
			//driver.findElementByXPath("//*[@id='com.auriga.stitch.sfc.debug:id/severity_tv' and @text='High']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/red_btn_title_tv").click();
			//driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Report Error']").click();
			
			Thread.sleep(5000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();

			//driver.findElementByXPath("//*[@class='android.widget.ImageView' and @index='1']").click();
			//resource-id  com.auriga.stitch.sfc.debug:id/back_btn
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='MAINTENANCE']").click();
			
			//driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='JUKI - DDL-8700-7 - 10004839 breakdown']").getText();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
			Thread.sleep(3000);
			//Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			Thread.sleep(3000);
			//Logout from supervisor
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
			
			Thread.sleep(3000);
			// Login with Machenic 
			
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

			Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/radioButton").click();
				
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys("banswara-mechanic-anil");
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys("auriga123");
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
				System.out.println("Successfully login");
				
			Thread.sleep(3000);
			
			
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Request']").click();
			
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'JUKI - DDL-8700-7 - 10005392 breakdown')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'START REPAIR')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys("9add80ff-cc74-4cfe-8ad6-6ecee5a79def");
			
			Thread.sleep(3000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'TAKE ACTION')]").click();
			//com.auriga.stitch.sfc.debug:id/action_btn_title
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Repaired')]").click();
			
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys("9add80ff-cc74-4cfe-8ad6-6ecee5a79def");
			Thread.sleep(3000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(3000);
			WebElement a=driver.findElementById("com.auriga.stitch.sfc.debug:id/on_success_text_tv");
			String success= a.getText();
		    System.out.println(success);
			
			
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Home')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/leading_icon").click();
			
			
			Thread.sleep(3000);
			//Machenic Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			
			//Logout from Machenic
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
			
			
			// Again Login with supervisor 
			
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

			Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/radioButton").click();
				
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
				Thread.sleep(3000); 
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys("banswara-AMIN");
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys("auriga123");
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
				System.out.println("Successfully login");
			
			
	
		
		
				Thread.sleep(5000);
				driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='MAINTENANCE']").click();
		
				Thread.sleep(3000);
				driver.findElementById("com.auriga.stitch.sfc.debug:id/ic_drop_down").click();
				
				Thread.sleep(3000);
				driver.findElementByXPath("//android.widget.TextView[contains(@text,'Completed (On-Demand)')]").click();
				//com.auriga.stitch.sfc.debug:id/drop_down_tv_2
				
				Thread.sleep(3000);
				WebElement r=driver.findElementByXPath("//android.widget.TextView[contains(@text,'045261')]");
				String s= r.getText();
			    System.out.println("Ticket NO: " + s + "Completed");
				
		
		
		

	}
}
