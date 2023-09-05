package com.SfcApp.testcase;

import java.awt.AWTException;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

import org.chocosolver.solver.constraints.nary.nvalue.amnv.mis.F;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SfcApp.factory.SfcAppLoginFactory;
import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.MobileElement;
import junit.framework.Assert;

public class ScheduleMaintenance extends BaseClassMobile  {
	public static WebDriver wdriver;
	@Test(priority = 1)
	public void WebAdminLogin() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/auriga/git/repository/StitchSfc/src/chromedriver"); 
	  wdriver = new ChromeDriver();

	  wdriver.get(prop.getProperty("webUrl"));
	  Thread.sleep(3000);
	  wdriver.manage().window().maximize();
	  
	  wdriver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(prop.getProperty("WebAdmin"));
	  wdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(prop.getProperty("Webpassword"));
	  wdriver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	}
	
	@Test(priority = 2)
	public void AddScheduledMaintenanceFromWeb() throws InterruptedException {
	
	  wdriver.findElement(By.xpath("//span[normalize-space()='Maintenance']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//a[normalize-space()='Scheduled Maintenance']")).click();
	  wdriver.findElement(By.xpath("//a[normalize-space()='Add scheduled maintenance']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-issue']//span[@role='presentation']")).click();
	  CommanApp.WebRandomValue(wdriver, "//ul[@id='select2-id_issue-results']");
	  
	  
	  
	 // wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("NEEDLE BREAK");
	  //wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-priority']//span[@role='presentation']")).click();
	  CommanApp.WebRandomValue(wdriver, "//ul[@id='select2-id_priority-results']");
	  
	  //wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();

	  
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-location']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(prop.getProperty("WebLocation"));
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	 // wdriver.findElement(By.xpath("//li[@id='select2-id_location-result-46ly-19']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-shift']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(prop.getProperty("WebShift"));
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-floor']//span[@role='presentation']")).click();
	  
	  //wdriver.findElement(By.xpath("//li[@id='select2-id_floor-result-jhps-50']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(prop.getProperty("WebFloor"));
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	  
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-line']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(prop.getProperty("WebLine"));
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	  
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-machine']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(prop.getProperty("WebMachine"));
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	  
	  
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//span[@class='datetimeshortcuts']//a[@href='#'][normalize-space()='Today']")).click();
	  wdriver.findElement(By.xpath("//input[@name='_save']")).click();
	  Thread.sleep(3000);
	  WebElement m= wdriver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
	  String maintenance= m.getText();
	  System.out.println("Ticket NO: " + maintenance + "Completed");
	  
	  WebElement ma= wdriver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/th[1]/a[1]"));
	  String maintenance1= ma.getText();
	  System.out.println("Ticket NO: " + maintenance1 + "Completed");
	  
		//WebElement TicketNo=wdriver.findElement(By.xpath("//h3[normalize-space()='Guru99 is totally new kind of learning experience.']"));
		//String ExpectedTicket1= TicketNo.getText();
		//System.out.println("Ticket NO: " + ExpectedTicket1 + "Completed");


	}
	
	@Test(priority = 3)
	public void LoginMechanic() throws MalformedURLException, InterruptedException, AWTException{
	
		
		  Thread.sleep(5000);
		  
		  
		  
		  driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		  
		 
		  
		  CommanApp.MobileLogin(driver);
		 
		  Thread.sleep(3000);
		  driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();
		  
		  Thread.sleep(3000); 
		  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
		  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
		  
		  driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
		  Thread.sleep(3000); 
		  driver.findElementById("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("MachenicUserName")); 
		  driver.findElementById("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("MachenicPassword")); 
		  Thread.sleep(3000); 
		  driver.findElementById("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
		  
		  System.out.println("Successfully login"); 
		  Thread.sleep(3000);
		 
		 		}

	@Test(priority = 4)
	public void VerifiedMachineRepaired() throws MalformedURLException, InterruptedException, AWTException{
		
		
		
		
				  	
						//System.out.println(driver.getPageSource());
						
						
						Thread.sleep(3000);
						driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Scheduled']").click();
						
						//driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]").click();
						
						Thread.sleep(3000);
						driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv").click();
						
						
						
						  Thread.sleep(3000); 
						  WebElement TicketNo=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv"); 
						  String ExpectedTicket= TicketNo.getText();
						 
						 
						

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
						//driver.findElementById("com.auriga.stitch.sfc.debug:id/checklist_rv").click();
						List<MobileElement> productElem = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
				    	 System.out.println(productElem.size());
				    	 for (int i= 0; i<productElem.size(); i++) {
				    		 driver.findElementByXPath("//*[@class='android.widget.CompoundButton' and  @checked='false']").click();
							
				    	 }
					
						
			
						/*
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Open needle plate & feed dog']"
						 * ).click();
						 * 
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Open Face Plate']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Oil Level Check']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='OIl Replace']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Needle Plate Check & Cleaning']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Belt Cover Check']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Pulley Cover Check']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Oil Pump Check']"
						 * ).click();
						 * 
						 * driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Cleaning']"
						 * ).click(); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Lubrication Check - oil change']"
						 * ).click();
						 */
                        
                         Thread.sleep(3000);
						driver.findElementByXPath("//android.widget.TextView[contains(@text,'COMPLETED')]").click();
					
						
						
						
						//Thread.sleep(3000);
						//driver.findElementByXPath("//android.widget.TextView[contains(@text,'PUT ON HOLD')]").click();
						//com.auriga.stitch.sfc.debug:id/action_btn_title
						
						
						//Thread.sleep(3000);
						//driver.findElementByXPath("//android.widget.TextView[contains(@text,'Repaired')]").click();
						
						
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
						
						
						//com.auriga.stitch.sfc.debug:id/schedule_view/
						
						//*[@id='com.auriga.stitch.sfc.debug:id/schedule_view'/[@class='android.widget.TextView' and @text='Completed']]
							Thread.sleep(3000);
							driver.findElementByXPath("//android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView[2]").click();
							//driver.findElementByXPath("//android.widget.TextView[contains(@text,'Completed (On-Demand)')]").click();
							//com.auriga.stitch.sfc.debug:id/drop_down_tv_2
							//com.auriga.stitch.sfc.debug:id/schedule_view
							Thread.sleep(3000);
							WebElement r=driver.findElementById("com.auriga.stitch.sfc.debug:id/ticket_no_tv");
							String ActualTicket= r.getText();
						    System.out.println("Ticket NO: " + ActualTicket + "Completed");
						   Assert.assertEquals(ExpectedTicket, ActualTicket);
						   System.out.println("Test Case Pass Actual ticket and Expected Ticket Matched");		 

	}	

	}
