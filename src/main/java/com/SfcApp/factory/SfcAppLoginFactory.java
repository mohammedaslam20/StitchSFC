package com.SfcApp.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SfcApp.utility.BaseClassMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SfcAppLoginFactory extends BaseClassMobile {
	
	//public static AndroidBy driver;
	
	protected  AppiumDriver<?> driver;
	// This is a constructor, as every page need a base driver to find web elements
	public SfcAppLoginFactory(AppiumDriver<?> driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//this.driver=ldriver;
		
		
	//super();
	}
	
	@FindBy(how = How.ID, using ="com.android.permissioncontroller:id/permission_allow_foreground_only_button") 
	public AndroidElement input_UserPermission;
	
	@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/img_setting") 
	public AndroidElement  button_Setting;
	
	
	public AndroidElement getButton_Setting() {
		return button_Setting;
	}

	public void setButton_Setting(AndroidElement button_Setting) {
		this.button_Setting = button_Setting;
	}

	public AndroidElement getButton_StageRadio() {
		return button_StageRadio;
	}

	public void setButton_StageRadio(AndroidElement button_StageRadio) {
		this.button_StageRadio = button_StageRadio;
	}

	@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/radioButton") 
	public AndroidElement  button_StageRadio;
	
	  
	  public AndroidElement getInput_UserPermission() { 
		  return input_UserPermission;
		 
	  }
	  
	  public void setInput_UserPermission(AndroidElement input_UserPermission) {
			this.input_UserPermission = input_UserPermission;
		}
	  
		@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/btn_save") 
		public AndroidElement  button_Save;
		
		public AndroidElement getButton_Save() {
			return button_Save;
		}

		public void setButton_Save(AndroidElement button_Save) {
			this.button_Save = button_Save;
		}

		public AndroidElement getInput_UserName() {
			return input_UserName;
		}

		public void setInput_UserName(AndroidElement input_UserName) {
			this.input_UserName = input_UserName;
		}

		public AndroidElement getInput_Password() {
			return input_Password;
		}

		public void setInput_Password(AndroidElement input_Password) {
			this.input_Password = input_Password;
		}

		public AndroidElement getButton_Login() {
			return button_Login;
		}

		public void setButton_Login(AndroidElement button_Login) {
			this.button_Login = button_Login;
		}

		public AndroidElement getTab_Profile() {
			return tab_Profile;
		}

		public void setTab_Profile(AndroidElement tab_Profile) {
			this.tab_Profile = tab_Profile;
		}

		public AndroidElement getButton_Logout() {
			return button_Logout;
		}

		public void setButton_Logout(AndroidElement button_Logout) {
			this.button_Logout = button_Logout;
		}

		@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/userNameEditTextId") 
		public AndroidElement  input_UserName;
		
		@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/passwordEditTextId") 
		public AndroidElement  input_Password;
		
		@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/loginLinLayoutId") 
		public AndroidElement  button_Login;
		
		
		@FindBy(how = How.XPATH, using ="//*[@class='android.widget.TextView' and @text='PROFILE']") 
		public AndroidElement  tab_Profile;
		
		
		@FindBy(how = How.ID, using ="com.auriga.stitch.sfc.debug:id/btn_title_tv") 
		public AndroidElement  button_Logout;
		
}

	
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@class='android.widget.EditText' and @index='0']") public AndroidElement
	 * input_UserName ;
	 * 
	 * 
	 * public AndroidElement getInput_UserName() { return input_UserName; }
	 * 
	 * 
	 * public void setInput_UserName(AndroidElement input_UserName) {
	 * this.input_UserName = input_UserName; }
	 */
	
	
	
	
