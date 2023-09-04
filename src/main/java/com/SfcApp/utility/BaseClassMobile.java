package com.SfcApp.utility;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


//import com.sun.java.util.jar.pack.Package.File;

import io.appium.java_client.remote.MobileCapabilityType;
//import web.projectname.utility.Constants;

public class BaseClassMobile {
	
	public static AndroidDriver driver ;
	
	/*
	 * public void setDriver(AndroidDriver driver) { driver.set(driver); }
	 * 
	 * 
	 * public AndroidDriver getDriver() { return driver.get(); }
	 */
	
	
	  public WebDriver getDriver() {
	  
	  return driver;
	  
	  }
	 
	
	//ExtentReports extent = new ExtentReports();

    //initialize ExtentReports and attach the HtmlReporter
   //ExtentSparkReporter spark = new ExtentSparkReporter("Extenreport.html");
    
	//public static AppiumDriver<MobileElement> driver;
	//public static AndroidDriver<MobileElement> driver;
	public static Properties prop;
		// TODO Auto-generated method stub
	public static String ProjectBasePath = System.getProperty("user.dir");
	
	@BeforeClass
	public AndroidDriver setupapp() throws IOException	{
		//Create file object for access APK from any PC and anywhere
		File f = new File ("src"); 
		File fs = new File(f, "SFC_D_v2.5.6_30.apk");
	
		
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
		//setDriver(driver);
		 
         System.out.println("Launch Stitch App"); 	
         //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         
        
        		// load properties file for windows 
        		
        		
        		
        		prop = new Properties(); 
        	 FileInputStream fis = new FileInputStream(ProjectBasePath+"//src//main//java//com//SfcApp//resources//data.properties");
        		    prop.load(fis);
					return driver; 
        		    
        		    
        	        
        	       // extent.attachReporter(spark);
        			 
        			
        			
        		
    }

    //return driver;
    
  
    
    
	/*
	 * @AfterTest public void tearDown() { //to write or update test information to
	 * reporter extent.flush(); }
	 */
    
}
