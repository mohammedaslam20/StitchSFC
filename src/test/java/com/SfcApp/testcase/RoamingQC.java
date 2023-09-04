package com.SfcApp.testcase;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SfcApp.factory.RoamingQcFactory;
import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.utility.CommanApp;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.inject.internal.util.ImmutableMap;

import io.appium.java_client.MobileElement;
import junit.framework.Assert;

	//Inherit the property from parent class with extends keyword
	public class RoamingQC extends BaseClassMobile {
		

		  String defectText= "";
		  int defectIndex ;
		 // ExtentTest test;
		 // ExtentReports extent = new ExtentReports();
		 

		    //initialize ExtentReports and attach the HtmlReporter
		  
		  //ExtentSparkReporter spark = new ExtentSparkReporter("Extenreport.html");
		  
		  
		  
		  
		 @BeforeTest
		    public void startReport() {
			  // initialize the HtmlReporter
			 
		      //extent.attachReporter(spark);
		 
		 
		        //configuration items to change the look and feel
		        //add content, manage tests etc
				/*
				 * spark.config().setChartVisibilityOnOpen(true);
				 * htmlReporter.config().setDocumentTitle("Simple Automation Report");
				 * htmlReporter.config().setReportName("Test Report");
				 * htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
				 * htmlReporter.config().setTheme(Theme.STANDARD); htmlReporter.config().
				 * setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
				 */
		    }
		  
		  
		  
		  
		  
		  
		
		@Test(priority = 1)
		public void LoginSupervisor() throws MalformedURLException, InterruptedException, AWTException{
		
			//CommanApp.AppLoging(driver);
			
			
			  //public void main () throws InterruptedException, IOException{ 
			//this.driver= driver;
			  //RoamingQcFactory Roaming = PageFactory.initElements(driver,RoamingQcFactory.class);
			  
			  Thread.sleep(5000);
			  
			  // Login.getInput_UserPermission().click();
			  
			  //Thread.sleep(3000); 
			  //driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
			  
			 driver.findElementById ("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
			  
			  //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			  
			  //driver.findElementByXPath(//android.widget.TextView[contains(@text,'SKIP')]").click();
			  
			  // Successfully login positive testcase
			  
			  CommanApp.MobileLogin(driver);
			  //driver.findElementById("com.auriga.stitch.sfc.debug:id/radioButton").click(); 
			  Thread.sleep(3000);
			  driver.findElementById ("com.auriga.stitch.sfc.debug:id/img_setting").click();
			  
			  Thread.sleep(3000); 
			  String ApplicationBaseUrl =prop.getProperty("ApplicationBaseUrl");
			  driver.findElementByXPath("//android.widget.RadioButton[@text= '" +ApplicationBaseUrl + "' ]").click(); 
			  //driver.findElementById("com.auriga.stitch.sfc.debug:id/radioButton").click();
			  // Actions actions = new Actions(driver); 
			  // Robot robot = new Robot(); Thread.sleep(3000);
			  driver.findElementById ("com.auriga.stitch.sfc.debug:id/btn_save").click();
			  Thread.sleep(3000); 
			  driver.findElementById("com.auriga.stitch.sfc.debug:id/userNameEditTextId").sendKeys(prop.getProperty("userName")); 
			  driver.findElementById("com.auriga.stitch.sfc.debug:id/passwordEditTextId").sendKeys(prop.getProperty("password")); 
			  Thread.sleep(3000); 
			  driver.findElementById("com.auriga.stitch.sfc.debug:id/loginLinLayoutId").click();
			  
			  System.out.println("Successfully login"); 
			  Thread.sleep(3000);
			  //Roaming.gettab_RoamingQC().click();
			  
			  //test = extent.createTest("LoginSupervisor Test Case 1", "The test case 1 has passed");
		        Assert.assertTrue(true);
			 		}
		
				@Test(priority = 2)
				public void RoamingSetup() throws MalformedURLException, InterruptedException, AWTException{
					Thread.sleep(3000);
				driver.findElementByXPath("//android.widget.TextView[@text='ROAMING QC']").click();
				driver.findElementById("com.auriga.stitch.sfc.debug:id/report_machine_step_name_tv").click();
				
				//creating Custom Locator and without iterating the List
				Thread.sleep(3000);
				String Shift = prop.getProperty("Shift");
				driver.findElementByXPath("//android.widget.RadioButton[@text= '" + Shift + "' ]").click();
				
				//driver.findElementById("com.auriga.stitch.sfc.debug:id/bottom_sheet_rv").sendKeys("DAMAN - DAYTIME");
				
				
				driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
				Thread.sleep(3000);
				
				driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
				String Floor = prop.getProperty("Floor");
				driver.findElementByXPath("//android.widget.RadioButton[@text= '" + Floor + "' ]").click();
			
				driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
				
				Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
			String Line = prop.getProperty("Line");
				driver.findElementByXPath("//android.widget.RadioButton[@text= '" + Line + "' ]").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
				
				Thread.sleep(3000);
				
				
				driver.findElementById("com.auriga.stitch.sfc.debug:id/temp_tv").click();
				
			driver.findElementById("com.auriga.stitch.sfc.debug:id/search_et").sendKeys(prop.getProperty("Style"));
		          String Style = prop.getProperty("Style");
				//driver.findElementByXPath("//android.widget.TextView[@text='"+ Style +"']").click();
				
				
				driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
				driver.findElementById("com.auriga.stitch.sfc.debug:id/btn_title_tv").click();
				//driver.findElementById("com.auriga.stitch.sfc.debug:id/total_defect_count_tv").click();
				
				//driver.findElementByXPath("//android.widget.TextView[@text='7']").click();
				//test = extent.createTest("Roaming QC Test Case 2", "The test case 2 has pass");
		        Assert.assertTrue(true);
					
				}
					
				
			
		@Test(priority = 3)
				public void NODefect() throws MalformedURLException, InterruptedException, AWTException{
				
				//Quality Check with No Defect
					Thread.sleep(3000);
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/icon_btn").click();
				  Thread.sleep(3000);
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR")); 
				  //Click on Enter Key
				  driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action","Done"));
				  Thread.sleep(3000);
				  
					
						
			
					Thread.sleep(3000);
					 // driver.findElementByXPath("//android.widget.TextView[@text='Submit Defect']").click();
				  
				  
				  
				  
				  
				 driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_btn").click();
				 driver.findElementById("com.auriga.stitch.sfc.debug:id/remark_et").sendKeys(prop.getProperty("CommentNoDefect"));
				 driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
				  //driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				  //driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				  
				  
				  driver.findElementByXPath("//android.widget.TextView[@text='No Defect']").click();
				  
				  String NoDefect= driver.findElementById("com.auriga.stitch.sfc.debug:id/txt_message").getText();
				  System.out.println(NoDefect);
				  //test = extent.createTest("NoDefecr Test Case 3", "The test case 1 has passed");
			        Assert.assertTrue(true);
				}
				
		        @Test(priority = 4)
				public void OneDefect() throws MalformedURLException, InterruptedException, AWTException{
				  
				//Quality Check with three Defect
					
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/icon_btn").click();
				  Thread.sleep(3000);
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR")); 
				  
				  //Click on Enter Key
				  driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action","Done"));
				  Thread.sleep(3000);
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_btn").click();
					
				  driver.findElementById("com.auriga.stitch.sfc.debug:id/remark_et").sendKeys(prop.getProperty("CommentOneDefect"));
				  driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
				  driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				  //driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				  //driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				  driver.findElementByXPath("//android.widget.TextView[@text='Submit Defect']").click();
				   String SubmitDefect= driver.findElementById ("com.auriga.stitch.sfc.debug:id/txt_message").getText();
				   System.out.println(SubmitDefect); 
				   //test = extent.createTest("OneDefect Test Case 4", "The test case 1 has passed");
			        Assert.assertTrue(true);
				 
				}
				
				
				
			@Test(priority = 5)
				public void MultipleDefect() throws MalformedURLException, InterruptedException, AWTException{
				//Quality Check with Multiple Defect
				driver.findElementById("com.auriga.stitch.sfc.debug:id/icon_btn").click();
				Thread.sleep(3000);
				driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
				driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));	
				//Click on Enter Key
				driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
				driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_btn").click();
				Thread.sleep(3000);
				driver.findElementById("com.auriga.stitch.sfc.debug:id/remark_et").sendKeys(prop.getProperty("CommentMultipleDefect"));
				driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
				
			
				driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				
				
				//Thread.sleep(3000);
				
				//"Puckering",
				String ScrollText = prop.getProperty("ScrollText");
				CommanApp.scrollToAnElementBytExt(driver,ScrollText);
				
				
				driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				driver.findElementByXPath("//android.widget.TextView[@text='ADD']").click();
				driver.findElementByXPath("//android.widget.TextView[@text='Submit Defect']").click();
				
				
				
				String SubmitDefect= driver.findElementById ("com.auriga.stitch.sfc.debug:id/txt_message").getText();
			    System.out.println(SubmitDefect);
			    //test = extent.createTest("Multiple Defect Test Case 5", "The test case 1 has passed");
		        Assert.assertTrue(true);
				}    			    
			   
			@Test(priority = 6)
			public void DynamicDefect() throws MalformedURLException, InterruptedException, AWTException{
				
			//Quality Check with Multiple Defect
			driver.findElementById("com.auriga.stitch.sfc.debug:id/icon_btn").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").click();
			driver.findElementById("com.auriga.stitch.sfc.debug:id/qr_code_et").sendKeys(prop.getProperty("MachineQR"));	
			//Click on Enter Key
			driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "Done"));
			driver.findElementById("com.auriga.stitch.sfc.debug:id/comment_btn").click();
			Thread.sleep(3000);
			driver.findElementById("com.auriga.stitch.sfc.debug:id/remark_et").sendKeys(prop.getProperty("DynamicDefect"));
			driver.findElementByXPath("//android.widget.TextView[@text='Proceed']").click();
			
			
			
			 List<MobileElement> DefectList=driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//*[@class='android.widget.TextView']");
			  //("//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout");
	  
	  List<String> defectlist = new ArrayList<String>();
	  System.out.println(DefectList.size());
	  System.out.println(DefectList.indexOf("Defect1"));

	for (int i=1; i<=DefectList.size(); i++) {
		String defectText = driver.findElementByXPath("(//androidx.recyclerview.widget.RecyclerView//*[@class='android.widget.TextView'])["+i+"]").getText();
		
		defectlist.add(defectText);
		System.out.println("Test" + defectText);
	}
	System.out.println(DefectList);
	
	
	
	int defectIndex =defectlist.indexOf(prop.getProperty("DefectNo"));
	System.out.println(defectIndex);
	int addIndex=defectIndex+2;
	System.out.println(addIndex);
	
	Thread.sleep(1000);
	 driver.findElementByXPath("(//androidx.recyclerview.widget.RecyclerView//*[@class='android.widget.TextView'])["+addIndex+"]").click();
	 



// String ScrollText = prop.getProperty("ScrollText");
//CommanApp.scrollToAnElementBytExt(driver,ScrollText);



		
			
			
			//Thread.sleep(3000);
			
			//"Puckering",
			//String ScrollText = prop.getProperty("ScrollText");
			//CommanApp.scrollToAnElementBytExt(driver,ScrollText);
			
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Submit Defect']").click();
			
			
			
			String SubmitDefect= driver.findElementById ("com.auriga.stitch.sfc.debug:id/txt_message").getText();
		    System.out.println(SubmitDefect);
		    //test = extent.createTest("DynamicDefect Test Case 6", "The test case 1 has passed");
	        Assert.assertTrue(true);
			}
			
			
			@Test(priority = 7)
				public void VerifyTotalDefect() throws MalformedURLException, InterruptedException, AWTException{
					
					driver.findElementById("com.auriga.stitch.sfc.debug:id/total_defect_count_tv").click();

					 // List<MobileElement> productElem1=driver.findElementsById("com.auriga.stitch.sfc.debug:id/card_bg");
					List<MobileElement> productElem1=driver.findElementsByXPath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView");
					
					  System.out.println(productElem1.size());
					  int number1 = 0 ;
					  for (int i= 0;i<productElem1.size(); i++) {
					 // System.out.println(productElem1.get(i).getText());
					  String sum = productElem1.get(i).getText();
					  //System.out.println(sum); 
					  int number = Integer.parseInt(sum);
			            System.out.println(number); 
					  
			            number1 +=number;
			            System.out.println("Sum"  +number1);
					 
					// System.out.println("Sum"  + sum);
					  
					  }
					  System.out.println("Sum1"  +number1);
					  String ExpectedDefectCount= Integer.toString(number1);
					  
			    	 
			    String TotalDefectCount=driver.findElementById("com.auriga.stitch.sfc.debug:id/total_defect_count_tv").getText();
			    
			    System.out.println("Total Defect Count " + TotalDefectCount +"");
			    Assert.assertEquals(ExpectedDefectCount, TotalDefectCount);
			    System.out.println("Testcase Pass done, matched actual defect count to expected defect count");
			    
			    //test = extent.createTest("VerifyDefect Test Case 7", "The test case 1 has passed");
		        Assert.assertTrue(true);
				
		}
			
		/*
		 * @AfterMethod public void getResult(ITestResult result) {
		 * if(result.getStatus() == ITestResult.FAILURE) {
		 * test.log(Status.FAIL,result.getThrowable()); } else if(result.getStatus() ==
		 * ITestResult.SUCCESS) { test.log(Status.PASS, result.getTestName()); } else {
		 * test.log(Status.SKIP, result.getTestName()); } }
		 */
			 
			 
			 
				/*
				 * @AfterTest public void tearDown() { //to write or update test information to
				 * reporter extent.flush();
				 * 
				 * }
				 */
				  
				 


}
	
	
	