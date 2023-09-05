
package com.SfcApp.testcase;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SfcApp.factory.SfcAppLoginFactory;
import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.SfcApp.utility.Lambda;
import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import junit.framework.Assert;



//Inherit the property from parent class with extends keyword
public class Maintenance extends BaseClassMobile {
	public static WebDriver wdriver;
	
	@Test(priority = 1)
	public void login() throws MalformedURLException, InterruptedException, AWTException{
		  
		  Thread.sleep(5000); 

		driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();

		// Successfully login positive testcase
		
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

		Thread.sleep(3000); 
		  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
		  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
			
		Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("userName"));
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("password"));
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			System.out.println("Successfully login");
			Thread.sleep(3000);
			
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
			
			Thread.sleep(3000);
	         driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
	         
	         Thread.sleep(3000);
	         //CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/search_rv");
	         driver.findElementById("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Error"));
			 String Error = prop.getProperty("Error");
			 driver.findElementByXPath("//android.widget.TextView[@text='"+ Error +"']").click();
				
	       
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();

			Thread.sleep(3000);
			 driver.findElementByXPath("//android.widget.TextView[contains(@text,'Select')]").click();
			//driver.findElementByXPath("//*[@class='com.auriga.stitch.sfc.debug:id/temp_tv' and @text='Select']").click();
			Thread.sleep(3000);
			CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/severity");
			
			
			//driver.findElementByXPath("//android.widget.TextView[contains(@text,'High')]").click();
			//driver.findElementByXPath("//*[@id='com.auriga.stitch.sfc.debug:id/severity_tv' and @text='High']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/red_btn_title_tv").click();
			//driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Report Error']").click();
			
			  Thread.sleep(3000); 
				/*
				 * WebElement
				 * b=driver.findElementById("com.auriga.stitch.sfc.debug:id/txt_message");
				 * String success1= b.getText(); System.out.println(success1);
				 */
			//System.out.println(driver.getPageSource());
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();

			//driver.findElementByXPath("//*[@class='android.widget.ImageView' and @index='1']").click();
			//resource-id  com.auriga.stitch.sfc.debug:id/back_btn
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='MAINTENANCE']").click();
			String ExpectedTicket=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_number_tv").getText();
			System.out.println("Ticket No:-"  + ExpectedTicket);
			
			//driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='JUKI - DDL-8700-7 - 10004839 breakdown']").getText();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
			Thread.sleep(3000);
			
	}
	
	
	@Test(priority = 3)
	public void LogoutSupervisor() throws MalformedURLException, InterruptedException, AWTException{
	
			//Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			Thread.sleep(3000);
			//Logout from supervisor
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
			
			
	}
	
	@Test(priority = 4)
	public void LoginMechanic() throws MalformedURLException, InterruptedException, AWTException{
			Thread.sleep(3000);
			// Login with Machenic 
			
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

			Thread.sleep(2000); 
			  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
			  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
				
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("MachenicUserName"));
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("MachenicPassword"));
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
				System.out.println("Successfully login");
				
	}
	
	@Test(priority = 5)
	public void DisposeMachine() throws MalformedURLException, InterruptedException, AWTException{
				
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Request']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'START REPAIR')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			
			Thread.sleep(3000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'TAKE ACTION')]").click();
			//com.auriga.stitch.sfc.debug:id/action_btn_title
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Dispose')]").click();
			
			String CheckBoxDisposeReason = prop.getProperty("CheckBoxDisposeReason");
			driver.findElementByXPath("//android.widget.CheckBox[contains(@text,'" + CheckBoxDisposeReason + "')]").click();
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_et").sendKeys(prop.getProperty("DisposeComment"));
			
			//driver.findElementByXPath("//android.widget.CheckBox[contains(@text,'Dispose')]").click();
			//driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_et").sendKeys("Dispose");
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
			
			
			//Replace
			
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
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
			
	}
	
	
	
	@Test(priority = 6)
	public void WebVerifiedMachineDispose() throws MalformedURLException, InterruptedException, AWTException{
		
		System.setProperty("webdriver.chrome.driver", "/home/auriga/git/repository/StitchSfc/src/chromedriver"); 
		  wdriver = new ChromeDriver();

		  wdriver.get(prop.getProperty("webUrl"));
		  Thread.sleep(3000);
		  wdriver.manage().window().maximize();
		  
		  wdriver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(prop.getProperty("WebAdmin"));
		  wdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(prop.getProperty("Webpassword"));
		  wdriver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		  wdriver.findElement(By.xpath("//span[normalize-space()='Maintenance']")).click();
		
		  Thread.sleep(3000);
		  wdriver.findElement(By.xpath("//a[normalize-space()='Machines']")).click();
		  wdriver.findElement(By.xpath("//input[@id='searchbar']")).sendKeys(prop.getProperty("WebMachine1"));
		
		  wdriver.findElement(By.xpath("//input[@value='Search']")).click();
		 String MachineStatus=  wdriver.findElement(By.xpath("//td[@class='field-state']")).getText();
		 System.out.println ("MachineStatus: " +MachineStatus);
		 Thread.sleep(3000);
		 wdriver.findElement(By.xpath("//th[@class='field-serial_no']/a[1]")).click();
		 
		 wdriver.findElement(By.xpath("//span[@id='select2-id_state-container']")).click();
		 wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Working");
		 wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
		
		 
		 //wdriver.findElement(By.xpath("//li[@id='select2-id_state-result-u6cv-working']")).click();
		 wdriver.findElement(By.xpath("//input[@name='_save']")).click();
		

	} 
	
	
	
	
	@Test(priority = 7)
	public void LogoutMechanic() throws MalformedURLException, InterruptedException, AWTException{		
			
			Thread.sleep(3000);
			//Machenic Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			
			//Logout from Machenic
			Thread.sleep(3000);
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
	public void ReportError() throws MalformedURLException, InterruptedException, AWTException{
	
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
			
			Thread.sleep(3000);
			CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/severity");
			
			
			//driver.findElementByXPath("//android.widget.TextView[contains(@text,'High')]").click();
			//driver.findElementByXPath("//*[@id='com.auriga.stitch.sfc.debug:id/severity_tv' and @text='High']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/red_btn_title_tv").click();
			
			
			//System.out.println(driver.getPageSource());
			Thread.sleep(3000); 
			 
			  
			  
			/*
			 * WebElement
			 * c=driver.findElementById("com.auriga.stitch.sfc.debug:id/txt_message");
			 * String success2= c.getText(); System.out.println(success2);
			 */
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();

		
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='MAINTENANCE']").click();
			String ExpectedTicket=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_number_tv").getText();
			System.out.println("Ticket No:-"  + ExpectedTicket);
			
			
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
			Thread.sleep(3000);
			
	}
	
	
	@Test(priority = 10)
	public void AgainLogoutSupervisor() throws MalformedURLException, InterruptedException, AWTException{
	
			//Profile
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
			Thread.sleep(3000);
			//Logout from supervisor
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
			
			
	}
	
	@Test(priority = 11)
	public void AgainLoginMechanic() throws MalformedURLException, InterruptedException, AWTException{
			Thread.sleep(3000);
			// Login with Machenic 
			
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

			Thread.sleep(2000); 
			  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
			  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
				
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("MachenicUserName"));
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("MachenicPassword"));
				Thread.sleep(3000);
				driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
				System.out.println("Successfully login");
				
	}
	
	@Test(priority = 12)
	public void ReplaceMachine() throws MalformedURLException, InterruptedException, AWTException{
			
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Request']").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv").click();
			
			
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'START REPAIR')]").click();
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			
			Thread.sleep(3000);
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'TAKE ACTION')]").click();
			//com.auriga.stitch.sfc.debug:id/action_btn_title
			
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[contains(@text,'Replace')]").click();
			
			
			String CheckBoxReplaceReason = prop.getProperty("CheckBoxReplaceReason");
			driver.findElementByXPath("//android.widget.CheckBox[contains(@text,'" + CheckBoxReplaceReason + "')]").click();
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_et").sendKeys(prop.getProperty("ReplaceComment"));
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
			
			
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			System.out.println("Enter QR Code1");
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
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
			
	}
	
	
	
	@Test(priority = 13)
	public void WebVerifiedMachineReplace() throws MalformedURLException, InterruptedException, AWTException{
		
		System.setProperty("webdriver.chrome.driver", "/home/auriga/git/repository/StitchSfc/src/chromedriver"); 
		  wdriver = new ChromeDriver();

		  wdriver.get(prop.getProperty("webUrl"));
		  Thread.sleep(3000);
		  wdriver.manage().window().maximize();
		  
		  wdriver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(prop.getProperty("WebAdmin"));
		  wdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(prop.getProperty("Webpassword"));
		  wdriver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		  wdriver.findElement(By.xpath("//span[normalize-space()='Maintenance']")).click();
		
		  Thread.sleep(3000);
		  wdriver.findElement(By.xpath("//a[normalize-space()='Machines']")).click();
		  wdriver.findElement(By.xpath("//input[@id='searchbar']")).sendKeys(prop.getProperty("WebMachine1"));
		
		  wdriver.findElement(By.xpath("//input[@value='Search']")).click();
		 String MachineStatus=  wdriver.findElement(By.xpath("//td[@class='field-state']")).getText();
		 System.out.println ("MachineStatus: " +MachineStatus);
		 Thread.sleep(3000);
		 wdriver.findElement(By.xpath("//th[@class='field-serial_no']/a[1]")).click();
		 
		 wdriver.findElement(By.xpath("//span[@id='select2-id_state-container']")).click();
		 
		 wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Working");
		 wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
		
		
		 //wdriver.findElement(By.xpath("//li[@id='select2-id_state-result-u6cv-working']")).click();
		 wdriver.findElement(By.xpath("//input[@name='_save']")).click();
		

	}
}
