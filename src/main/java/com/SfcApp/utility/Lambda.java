package com.SfcApp.utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Lambda {
	
	public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> androidDriver;


	//this.driver=driver;
	
	 public static String userName = "nishantaurigait"; //Enter your LT Username here
	    public static String accessKey = "FMcvc7CZVRBQsyn0T7M7ptIAtAEa9wIIbKV7DBTDz7FHINJEGu"; //Enter your LT AccessKey here

	    public String gridURL = "@mobile-hub.lambdatest.com/wd/hub";
	    

	    String DeviceValue;
	    String versionValue;
	    String PlatformValue;
	    
	  //  @BeforeClass
	   @org.testng.annotations.Parameters(value = {"device", "version", "platform"})
	    
	    public void Lambda(String device, String version, String platform, AppiumDriver<MobileElement> driver, AndroidDriver<MobileElement> androidDriver) {
		   this.driver = driver;
		   this.androidDriver = androidDriver;
	        try {
	           DeviceValue = device;
	            versionValue = version;
	            PlatformValue = platform;
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability("build","ParallelSample Android");
	            capabilities.setCapability("name",platform+" "+device+" "+version);
	            capabilities.setCapability("deviceName", device);
	            capabilities.setCapability("platformVersion",version);
	            capabilities.setCapability("platformName", platform);
	            capabilities.setCapability("isRealMobile", true);
	            //AppURL (Create from Wikipedia.apk sample in project)
	            capabilities.setCapability("app", "lt://APP1016045801683741497153395"); //Enter your app URL from previous step here
	            capabilities.setCapability("deviceOrientation", "PORTRAIT");
	            capabilities.setCapability("console", true);
	            capabilities.setCapability("network", true);
	            capabilities.setCapability("visual", true);
	            capabilities.setCapability("devicelog", true);

	            String hub = "https://nishantaurigait:FMcvc7CZVRBQsyn0T7M7ptIAtAEa9wIIbKV7DBTDz7FHINJEGu@mobile-hub.lambdatest.com/wd/hub";
	          //  AppiumDriver driver = new AppiumDriver(new URL(hub), capabilities);
	            
	            driver = new AndroidDriver<MobileElement>(new URL(hub), capabilities);
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	    
	        } catch (Exception t) {
	            System.out.println();

	        }	
		

}
}
