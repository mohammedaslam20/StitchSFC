package com.SfcApp.testcase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


	 
	
	
		
		
			
		
public class AdminLogin {

	
		public static WebDriver wdriver;
		@Test(priority = 1)
		public void f() {
			
		  System.setProperty("webdriver.chrome.driver", "/home/auriga/Automation/Selenium/work/StitchSfc/src/chromedriver"); 
		  wdriver = new ChromeDriver();

		  wdriver.get("http://www.guru99.com");
		  WebElement TicketNo=wdriver.findElement(By.xpath("//h3[normalize-space()='Guru99 is totally new kind of learning experience.']"));
			String ExpectedTicket1= TicketNo.getText();

		}
}
