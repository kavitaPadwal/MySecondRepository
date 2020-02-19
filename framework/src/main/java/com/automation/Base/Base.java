package com.automation.Base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automation.pages.page1_Login;
import com.automation.utilities.Browserfactory;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;

public class Base {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
    
	
	//new commit
	@BeforeSuite
	public void setUpSuite() {
		 excel=new ExcelDataProvider();
		  config=new ConfigDataProvider();
		
		  
	}
	@BeforeClass
	public void setup() {
		driver=Browserfactory.startBrowser(driver,config.getBrowser(),config.getURL());
        System.out.println(config.getDataFromConfig("FirstName"));    
		
	}
	
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
	
/*	@AfterClass
	public void tearown() {
		Browserfactory.quiteBrowser(driver);
	}
	
	/*@AfterMethod
	public void tearDownMethod(ITestResult result   ) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Helper.ScreenShot(driver);
			
		}
		
	}*/

}
