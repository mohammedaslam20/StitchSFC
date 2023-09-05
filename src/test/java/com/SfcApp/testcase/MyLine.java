package com.SfcApp.testcase;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.google.inject.internal.util.ImmutableMap;

public class MyLine extends BaseClassMobile {
	

	

	@Test(priority = 1)
	public void LoginSupervisor() throws MalformedURLException, InterruptedException, AWTException{
	
		Thread.sleep(5000); 
		driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		Thread.sleep(1000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();
		//CommanApp.takeScreenShot(null, null);
		
		Thread.sleep(2000); 
		  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
		  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
			
		
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			Thread.sleep(2000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("userName"));
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("password"));
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			System.out.println("Successfully login");
	}
			@Test(priority = 2)
			public void Myline() throws MalformedURLException, InterruptedException, AWTException{
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[@text='View All']").click();
			Thread.sleep(2000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/search_btn").click();
			//driver.findElementById ("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Style"));
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Style"));
	        String Style = prop.getProperty("Style");
			//driver.findElementByXPath("//android.widget.TextView[@text='"+ Style +"']").click();
			
			
			//driver.findElementById ("com.auriga.stitch.sfc.debug:id/item_tv").click();
			
			
			//driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			Thread.sleep(2000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
			
			Thread.sleep(2000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/style_title_tv").click();
			//driver.findElementByXPath ("//android.widget.TextView[@text='aslam-1']").click();
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/add_btn").click();
			Thread.sleep(2000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
		
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));	
			
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			Thread.sleep(2000);
			// com.auriga.stitch.sfc.debug:id/planning_eff_et ---Target E
			driver.findElementByXPath("//android.widget.TextView[@text='Not Assigned']").click();
			
			//driver.findElementById("com.auriga.stitch.sfc.debug:id/item_tv").click();
			
			driver.findElementById("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Operation"));
	          String Operation = prop.getProperty("Operation");
			driver.findElementByXPath("//android.widget.TextView[@text='"+ Operation +"']").click();
			
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Not Assigned']").click();
			
			
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("IDOperator"));
			driver.findElementById("com.auriga.stitch.sfc.debug:id/operator_name_card").click();
			
			//driver.findElementByXPath("//android.widget.TextView[@text='ID : 124360']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			
			//System.out.println(driver.getPageSource());
			Thread.sleep(2000);
			WebElement line= driver.findElementById ("com.auriga.stitch.sfc.debug:id/txt_message");
			String Myline= line.getText();
		    System.out.println(Myline);
	
	}
	
			
   //Report error
	@Test(priority = 3)
	public void ChangeMachineOrientation() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/machine_serial_no_tv").click();

	driver.findElementById ("com.auriga.stitch.sfc.debug:id/menu_btn").click();
	//Change machine Orientation
		driver.findElementByXPath("//android.widget.TextView[@text='Change Orientation']").click();
		//com.auriga.stitch.sfc.debug:id/machine_orientation
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/rotate_btn").click(); 
		driver.findElementByXPath("//android.widget.TextView[@text='Save']").click();
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(2000);
		WebElement orientation= driver.findElementById ("com.auriga.stitch.sfc.debug:id/txt_message");
		String orientation1= orientation.getText();
	    System.out.println(orientation1);
	}
	    @Test(priority = 4)
		public void ReportError() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElementById ("com.auriga.stitch.sfc.debug:id/menu_btn").click();
	    
	driver.findElementByXPath("//android.widget.TextView[@text='Report Error']").click();
	driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
	
	 driver.findElementById("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Error"));
		String Error = prop.getProperty("Error");
		driver.findElementByXPath("//android.widget.TextView[@text='"+ Error +"']").click();
	
	//CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/search_rv");
	
	
	 driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
	 driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
	 Thread.sleep(3000);
	 CommanApp.RandomValue(driver, "com.auriga.stitch.sfc.debug:id/severity");
	 Thread.sleep(3000);
	// driver.findElementByXPath("//android.widget.TextView[contains(@text,'High')]").click();
	 driver.findElementById("com.auriga.stitch.sfc.debug:id/red_btn_title_tv").click();
	 WebElement error= driver.findElementById ("com.auriga.stitch.sfc.debug:id/txt_message");
		String ReportError= error.getText();
	    System.out.println(ReportError);
	    Thread.sleep(3000);
	    driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
	    Thread.sleep(3000);
	    driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
	    Thread.sleep(3000);
	    driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
	    }
	  	    
	    @Test(priority = 5)
		public void RecorderVerifyMachineReported() throws InterruptedException {    
	    //RECORDER 
	    	Thread.sleep(3000);
	    driver.findElementByXPath("//android.widget.TextView[@text='RECORDER']").click();
	    
	    
	    
	    String Shift = prop.getProperty("Shift");
		driver.findElementByXPath("//android.widget.RadioButton[@text= '" + Shift + "' ]").click();
		
	   // driver.findElementByXPath("//*[@class='android.widget.RadioButton' and @index=0]").click();
	    
	 
	    //driver.findElementByXPath("//*[@class='android.widget.RadioButton' and @text='DAMAN - Day Shift']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Proceed']").click();
		driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
		System.out.println("Enter QR Code");
	driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
	driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
	//Verification 
	Thread.sleep(2000);
	driver.findElementById("com.auriga.stitch.sfc.debug:id/back_btn").click();
	 
	 
	 
	
	
	//Profile
	Thread.sleep(1000);
		driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='PROFILE']").click();
		Thread.sleep(3000);
		//Logout from supervisor
		
		driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
		
		Thread.sleep(3000);
	    }
		
		 @Test(priority = 6)
			public void LoginMachenic() throws InterruptedException { 
		
		// Login with Machenic 
		
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

		Thread.sleep(3000);
		String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
		driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
			
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("MachenicUserName"));
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("MachenicPassword"));
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			System.out.println("Successfully login");
			
		Thread.sleep(3000);
		 }
		 
		 @Test(priority = 7)
			public void RepairMachine() throws InterruptedException { 
			 Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Request']").click();
		
		
		Thread.sleep(3000);
		driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv").click();
		//driver.findElementByXPath("//android.widget.TextView[contains(@text,'JUKI - JUKI-DDL 9000 - 10007202 breakdown')]").click();
		
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
		
		 }
		 
		 @Test(priority = 8)
			public void RecorderVerifyMachineRepaired() throws InterruptedException { 
		// Again Login with supervisor 
		
		Thread.sleep(3000);
		driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();

		Thread.sleep(3000);
		String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
		driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
			
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			Thread.sleep(3000); 
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("userName"));
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("password"));
			Thread.sleep(3000);
			driver.findElementById ("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			System.out.println("Successfully login");
	 
			
			
			Thread.sleep(3000);
			 driver.findElementByXPath("//android.widget.TextView[@text='RECORDER']").click();
			 
			 String Shift = prop.getProperty("Shift");
				driver.findElementByXPath("//android.widget.RadioButton[@text= '" + Shift + "' ]").click();
				
			
				Thread.sleep(2000);
				driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Proceed']").click();
				driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
				System.out.println("Enter QR Code");
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			Thread.sleep(2000);
			boolean elepresent=driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Record Production']").isDisplayed();
		
			System.out.println("machine Repaired:"+elepresent);
			System.out.println("Successfully Verified Machine" );	
	}

}
