package com.SfcApp.utility;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


//import com.sun.java.util.jar.pack.Package.File;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClassMobile {
	
	public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> androidDriver;
		// TODO Auto-generated method stub
	
	@BeforeClass
	public void setupapp() throws MalformedURLException	{
		//Create file object for access APK from any PC and anywhere
		File f = new File ("src"); 
		File fs = new File(f, "SFC_D_v2.4.5_26.apk");
	
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//cap.setCapability(MobileCapabilityType.UDID,"8cddcac4");
		 
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		 
		 cap.setCapability("appPackage", "com.auriga.stitch.sfc.debug");
		 cap.setCapability("appActivity", "com.example.textreader.Activities.SplashActivity");

		
	
		 
		cap.setCapability("RESET","true"); 
		
	//cap.setCapability("newCommandTimeout", 500);
		
		
		 
		 //for connection to server link ( AndroidDriver<AndroidElement> = data type  of driver variable ) 
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		//AndroidDriver driver = new AndroidDriver(connectiontoserverlink, cap); 
		driver = new AndroidDriver<MobileElement>(url,cap);
		
		 
         System.out.println("Launch Stitch App"); 	
         //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    
    public WebDriver getDriver() {
    	
    	return driver;
    	
    }
    
    
    
    
}
