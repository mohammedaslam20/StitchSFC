package com.SfcApp.utility;




import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.comcast.video.stbio.Key;
import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class CommanApp  {
	
	
		
	public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> androidDriver;
		
	// Successfully login positive testcase
	
	public static void MobileLogin(AppiumDriver <MobileElement> driver) throws InterruptedException, AWTException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementById ("com.android.permissioncontroller:id/permission_allow_button").click();
		
		
		
    
		//com.android.permissioncontroller:id/permission_allow_foreground_only_button
// com.auriga.stitch.sfc.debug:id/nav_text_tv

			
		//driver.findElementByXPath("//*[@id='com.android.permissioncontroller:id/permission_allow_button]").click();
		/*
		/
		 * driver.findElementByXPath(
		 * "//*[@id='com.auriga.stitch.sfc.debug:id/img_setting]").click();
		 * driver.findElementByXPath(
		 * "//*[@id='com.auriga.stitch.sfc.debug:id/radioButton]").click();
		 * driver.findElementByXPath("//*[@id='com.auriga.stitch.sfc.debug:id/btn_save]"
		 * ).click(); driver.findElementByXPath(
		 * "//*[@id='com.auriga.stitch.sfc.debug:id/userNameEditTextId]").sendKeys(
		 * "banswara-AMIN");
		 */
		
				
				//driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='JUKI - DDL-8700-7 - 10004839 breakdown']").getText();
			

	
			
			
			
			
	}
	
	

	//Scroll App for static text		

	public static WebElement scrollToAnElementBytExt(AppiumDriver <MobileElement> driver,String text){
		return ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0))");

		}	
	
	
	public static void robotDoEnter() 
	{
	try {
	Robot robot= new Robot();
	robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	robot.delay(300);
	robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	robot.delay(300);
}catch (AWTException e)
{
e.printStackTrace();
}
	}	
	
	
	public static void keyEvent(int keyEvent) throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(keyEvent);
		r.keyRelease(keyEvent);
		}

			
		}

		
