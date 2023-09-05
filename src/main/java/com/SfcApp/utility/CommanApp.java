package com.SfcApp.utility;




import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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

public class CommanApp {
	
	
		
	public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> androidDriver;
	public static WebDriver wdriver;
	
	//public static Properties prop;
	
	
		
	// Successfully login positive testcase
	
	public static void MobileLogin(AppiumDriver <MobileElement> driver) throws InterruptedException, AWTException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void RandomValue (AppiumDriver <MobileElement> driver,String Element){
		
		
		 // get all products whose quanity >0
        List<MobileElement> productElems = driver.findElementsById(Element);
        // get the len of productElems
        int maxProducts = productElems.size();
        // get random number
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        // Select the list item
        productElems.get(randomProduct).click();
		
		
		
	}
	
	
	public static void WebRandomValue (WebDriver wdriver, String Element){
	
	  // get all products whose quanity >0 
	  List<WebElement> productElems =  wdriver.findElements(By.xpath(Element));
		  int maxProducts = productElems.size(); 
		  // get random
		 Random random = new Random(); 
		 int randomProduct =random.nextInt(maxProducts); 
		 // Select the list item
		  productElems.get(randomProduct).click();
	}
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

	
	/**
	  * Takes screenshot of active screen
	 * @param scrShotDir 
	 * @param destFile 
	 * @return 
	  * 
	  * @return ImageFileName
	  */
	 public static void takeScreenShot(String scrShotDir, String destFile) {
	  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
	  
	  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	  new File(scrShotDir).mkdirs(); // Create folder under project with name
	          // "screenshots" if doesn't exist
	  destFile = dateFormat.format(new Date()) + ".png"; // Set file name
	               // using current
	               // date time.
	  try {
	   FileUtils.copyFile(scrFile, new File(scrShotDir + "/" + destFile)); // Copy
	                    // paste
	                    // file
	                    // at
	                    // destination
	                    // folder
	                    // location
	  } catch (IOException e) {
	   System.out.println("Image not transfered to screenshot folder");
	   e.printStackTrace();
	  }
	  return ;
	 }
	 
		/*
		 * public static void AppLoging(AppiumDriver <MobileElement> driver) throws
		 * InterruptedException {
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * driver.findElementById
		 * ("com.android.permissioncontroller:id/permission_allow_foreground_only_button"
		 * ).click();
		 * 
		 * 
		 * 
		 * Thread.sleep(3000); driver.findElementById
		 * ("com.auriga.stitch.sfc.debug:id/img_setting").click();
		 * 
		 * Thread.sleep(3000); String ApplicationBaseUrl =
		 * prop.getProperty("ApplicationBaseUrl");
		 * driver.findElementByXPath("//android.widget.RadioButton[@text= '" +
		 * ApplicationBaseUrl + "' ]").click(); //driver.findElementById
		 * ("com.auriga.stitch.sfc.debug:id/radioButton").click(); // Actions actions =
		 * new Actions(driver); // Robot robot = new Robot(); Thread.sleep(3000);
		 * driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
		 * Thread.sleep(3000); driver.findElementById
		 * ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.
		 * getProperty("userName")); driver.findElementById
		 * ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.
		 * getProperty("password")); Thread.sleep(3000); driver.findElementById
		 * ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
		 * System.out.println("Successfully login"); Thread.sleep(3000);
		 * 
		 * 
		 * }
		 */
}
		
