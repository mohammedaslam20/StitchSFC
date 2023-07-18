package com.SfcApp.testcase;

import java.awt.AWTException;
import java.io.File;
import java.net.MalformedURLException;

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

import junit.framework.Assert;

public class ScheduleMaintenance extends BaseClassMobile  {
	public static WebDriver wdriver;
	@Test(priority = 1)
	public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/auriga/Automation/Selenium/work/StitchSfc/src/chromedriver"); 
	  wdriver = new ChromeDriver();

	  wdriver.get("https://stage.stitcherp.com/company-admin/login/?next=/company-admin/");
	  Thread.sleep(3000);
	  wdriver.manage().window().maximize();
	  
	  wdriver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("banswara-admin_daman");
	  wdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("auriga123");
	  wdriver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	  wdriver.findElement(By.xpath("//span[normalize-space()='Maintenance']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//a[normalize-space()='Scheduled Maintenance']")).click();
	  wdriver.findElement(By.xpath("//a[normalize-space()='Add scheduled maintenance']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-issue']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("NEEDLE BREAK");
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	  
	  
	
	  Thread.sleep(3000);               
	 
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-priority']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("High");
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();

	  
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-location']//span[@role='presentation']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("DAMAN");
	  wdriver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	 // wdriver.findElement(By.xpath("//li[@id='select2-id_location-result-46ly-19']")).click();
	  Thread.sleep(3000);
	  wdriver.findElement(By.xpath("//div[@class='fieldBox field-floor']//span[@role='presentation']")).click();
	  
	  //wdriver.findElement(By.xpath("//li[@id='select2-id_floor-result-jhps-50']")).click();
	  wdriver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("K-1 2nd FLOOR");
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

	@Test(priority = 2)
	public void login() throws MalformedURLException, InterruptedException, AWTException{
		// TODO Auto-generated method stub
		//System.out.println("Ticket NO: " +  + "Completed");
		
		
		  //SfcAppLoginFactory Login = PageFactory.initElements(driver,SfcAppLoginFactory.class);
				  
			/*
			 * Thread.sleep(3000);
			 * 
			 * Login.getInput_UserPermission().click();
			 */
				  
				Thread.sleep(3000);
					driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
					//driver.findElementById ("com.android.permissioncontroller:id/permission_allow_button").click();
					
						// Login with Machenic 
					//System.out.println("Ticket NO: " + ExpectedTicket1 + "Completed");
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
						System.out.println(driver.getPageSource());
						
						Thread.sleep(3000);
						driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Total Scheduled']").click();
						
						
						Thread.sleep(3000);
						driver.findElementByXPath("//android.widget.TextView[contains(@text,'SM - JUKI - DDL-8700-7 - 10004873 - 2023-07-13')]").click();
						
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
						driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys("6015037817e165e7e0c0146b");
						
						Thread.sleep(3000);
						//Click on Enter Key
						driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
						
						
						
						Thread.sleep(3000);
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Open needle plate & feed dog']").click();
                        
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Open Face Plate']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Oil Level Check']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='OIl Replace']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Needle Plate Check & Cleaning']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Belt Cover Check']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Pulley Cover Check']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Oil Pump Check']").click();
                        
                        driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='Cleaning']").click();
                        
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
						driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys("6015037817e165e7e0c0146b");
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
						
						/*
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='01' and @text='Accepted']"
						 * ).click();
						 * 
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//android.widget.TextView[contains(@text,'SM - JUKI - DDL-8700-7 - 10004873 - 2023-07-05')]"
						 * ).click();
						 * 
						 * //Thread.sleep(3000); //driver.findElementById(
						 * "com.auriga.stitch.sfc.debug:id/custom_primary_btn_title_tv").click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//android.widget.TextView[contains(@text,'START REPAIR')]"
						 * ).click();
						 * 
						 * Thread.sleep(3000);
						 * driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
						 * System.out.println("Enter QR Code1"); Thread.sleep(3000);
						 * driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(
						 * "6015037817e165e7e0c0146b");
						 * 
						 * Thread.sleep(3000); //Click on Enter Key
						 * driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action",
						 * "Done"));
						 * 
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Open needle plate & feed dog']"
						 * ).click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Open Face Plate']"
						 * ).click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Oil Level Check']"
						 * ).click();
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='OIl Replace']"
						 * ).click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Needle Plate Check & Cleaning']"
						 * ).click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Belt Cover Check']"
						 * ).click();
						 * 
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Pulley Cover Check']"
						 * ).click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Oil Pump Check']"
						 * ).click();
						 * 
						 * Thread.sleep(3000); driver.
						 * findElementByXPath("//*[@class='android.widget.TextView' and @text='Cleaning']"
						 * ).click();
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * 
						 * Thread.sleep(3000); driver.findElementByXPath(
						 * "//android.widget.TextView[contains(@text,'COMPLETED')]").click();
						 * 
						 * 
						 * 
						 * //com.auriga.stitch.sfc.debug:id/action_btn_title //Thread.sleep(3000);
						 * //driver.findElementByXPath(
						 * "//android.widget.TextView[contains(@text,'Repaired')]").click();
						 * 
						 * 
						 * Thread.sleep(3000);
						 * driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
						 * System.out.println("Enter QR Code1"); Thread.sleep(3000);
						 * driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(
						 * "6015037817e165e7e0c0146b"); Thread.sleep(3000); //Click on Enter Key
						 * driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action",
						 * "Done"));
						 * 
						 * Thread.sleep(3000); WebElement
						 * b=driver.findElementById("com.auriga.stitch.sfc.debug:id/on_success_text_tv")
						 * ; String successmess= b.getText(); System.out.println(successmess);
						 * 
						 * 
						 * 
						 * Thread.sleep(3000);
						 * driver.findElementByXPath("//android.widget.TextView[contains(@text,'Home')]"
						 * ).click();
						 * 
						 * 
						 * 
						 * 
						 * 
						 * Thread.sleep(3000);
						 * driver.findElementById("com.auriga.stitch.sfc.debug:id/leading_icon").click()
						 * ;
						 */
						                          //com.auriga.stitch.sfc.debug:id/schedule_view/
						
						//*[@id='com.auriga.stitch.sfc.debug:id/schedule_view'/[@class='android.widget.TextView' and @text='Completed']]
							Thread.sleep(3000);
							driver.findElementByXPath("//*[@class='android.widget.TextView' and @text='06']").click();
							//driver.findElementByXPath("//android.widget.TextView[contains(@text,'Completed (On-Demand)')]").click();
							//com.auriga.stitch.sfc.debug:id/drop_down_tv_2
							
							Thread.sleep(3000);
							WebElement r=driver.findElementByXPath("//android.widget.TextView[contains(@text,'045301')]");
							String ActualTicket= r.getText();
						    System.out.println("Ticket NO: " + ActualTicket + "Completed");
						    Assert.assertEquals(ExpectedTicket, ActualTicket);
				  
				 

	}	

	}
