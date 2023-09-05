package com.SfcApp.factory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SfcApp.utility.BaseClassMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



	public class RoamingQcFactory extends BaseClassMobile {
		
		//public static AndroidBy driver;
		
		
		// This is a constructor, as every page need a base driver to find web elements
		public RoamingQcFactory(AndroidBy driver) {
			super();
			
			//this.driver = driver;
			
		}
		
	
			//This is a constructor, as every page need a base driver to find web elements
		@FindBy(how = How.XPATH, using ="//android.widget.TextView[@text='ROAMING QC']") 
		public AndroidElement tab_RoamingQC;
		
		
		 public AndroidElement gettab_RoamingQC() { 
	     return tab_RoamingQC;
			 
		  }
		  
		  public void setInput_UserPermission(AndroidElement tab_RoamingQC) {
				this.tab_RoamingQC = tab_RoamingQC;
			}
		  
	}
		  
		
		
